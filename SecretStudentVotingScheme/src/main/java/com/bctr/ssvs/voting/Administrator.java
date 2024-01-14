package com.bctr.ssvs.voting;

import com.bctr.ssvs.voting.DTO.SignedBallots;
import com.bctr.ssvs.voting.observer.EventManager;

import java.security.*;
import java.util.HashMap;
import java.util.List;

import static com.bctr.ssvs.voting.observer.EventType.ADMINISTRATOR;

/**
 * Represents the Administrator in the secret voting scheme.
 */
public class Administrator {
    public static Administrator administrator;
    private static KeyPair keyPair = CryptoUtils.getSignaturePair();
    private SignedBallots signedBallots;
    private EventManager eventManager;
    private List<Voter> allowedVoters;

    private Administrator() {
        this.signedBallots = new SignedBallots(new HashMap<>());
        this.eventManager = EventManager.getInstance();
    }

    public static Administrator getAdministrator(List<Voter> voters)
    {
        if(administrator == null)
        {
            administrator = new Administrator();
            administrator.addVoters(voters);
        }
        return administrator;
    }

    public static PublicKey getPublicKey() {
        return keyPair.getPublic();
    }

    /**
     * Signs a ballot if the voter is eligible.
     * @param ballot The ballot to be signed.
     */
    //use aop to verify voter's rights to vote
    public void signBallot(Ballot ballot) {
        if (!signedBallots.containsSignature(ballot)) {
            String signature = CryptoUtils.generateSignature(keyPair.getPrivate(), String.valueOf(ballot.hashCode()));
            signedBallots.addBallotSignature(ballot, signature);
        }
    }

    /**
     * Announces the number of voters who were given the administrator's signature.
     */
    public void announceSignedVotersCount() {
        System.out.println("Number of voters who received signatures: " + signedBallots.getSize());
    }

    /**
     * Publishes a list that contains information about voters who received signatures.
     */
    public void publishSignedVotersList() {
        eventManager.notify(ADMINISTRATOR, signedBallots);
    }

    public boolean isVoterAllowed(Object o) {
        return allowedVoters.contains(o);
    }

    private void addVoters(List<Voter> voters) {
        voters.forEach(voter -> voter.setAdministrator(this));
        allowedVoters = List.copyOf(voters);
    }
}
