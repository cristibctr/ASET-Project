package com.bctr.ssvs.voting;

import com.bctr.ssvs.voting.DTO.CollectedBallots;
import com.bctr.ssvs.voting.DTO.SignedBallots;
import com.bctr.ssvs.voting.observer.EventManager;

import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.util.UUID;

import static com.bctr.ssvs.voting.observer.EventType.ADMINISTRATOR;
import static com.bctr.ssvs.voting.observer.EventType.COUNTER;

/**
 * Represents a voter in the secret voting scheme.
 */
public class Voter {
    private final String ID;
    private Ballot ballot;
    private Administrator administrator;
    private final Counter counter;
    private final SecretKey secretKey;
    private final KeyPair keyPair;

    /**
     * Constructs a Voter with an ID.
     * @param counter The counter.
     */
    public Voter(Counter counter) {
        this.ID = UUID.randomUUID().toString();
        this.counter = counter;
        this.secretKey = CryptoUtils.getEncryptionKey();
        this.keyPair = CryptoUtils.getSignaturePair();
    }

    /**
     * Sets the administrator
     * @param administrator {@link Administrator}
     */
    public void setAdministrator(Administrator administrator)
    {
        this.administrator = administrator;
    }

    /**
     * Prepares the ballot for voting.
     * @param vote The vote to be cast by the voter.
     */
    public void prepareBallot(Vote vote) {
        String encryptedVote = CryptoUtils.encryptVote(secretKey, vote);
        this.ballot = new Ballot(ID, encryptedVote, CryptoUtils.generateSignature(keyPair.getPrivate(), encryptedVote));
    }

    /**
     * Sends the ballot to the Administrator for signing.
     */
    public void sendBallot() {
        administrator.signBallot(ballot);
        EventManager.getInstance().<SignedBallots>subscribe(ADMINISTRATOR,
                (eventType, signedBallot) -> {
                    if (!checkSignature(signedBallot.getSignature(ID))) {
                        throw new RuntimeException("Invalid administrator signature");
                    }
                    this.ballot.setSignature(signedBallot.getSignature(ID));
                });
    }

    /**
     * Sends the vote to the Counter anonymously.
     */
    public void sendVote() {
        counter.receiveVote(this.ballot);
        EventManager.getInstance().<CollectedBallots>subscribe(COUNTER,
                (eventType, collectedBallots) -> counter.openVote(
                        collectedBallots.ballots().indexOf(ballot), secretKey));
    }

    /**
     * Receive the ballot.
     */
    public Ballot getBallot() {
        return ballot;
    }

    /**
     * Check the signature of the ballot.
     * @param signature The signature of the ballot
     */
    private boolean checkSignature(String signature) {
        return CryptoUtils.verifySignature(Administrator.getPublicKey(), String.valueOf(ballot.hashCode()), signature);
    }
}
