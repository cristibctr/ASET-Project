package com.bctr.ssvs.voting;

import com.bctr.ssvs.voting.DTO.CollectedBallots;
import com.bctr.ssvs.voting.observer.EventManager;

import javax.crypto.SecretKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.bctr.ssvs.voting.observer.EventType.COUNTER;

/**
 * Represents the Counter in the secret voting scheme.
 */
public class Counter {
    private final CollectedBallots receivedBallots;
    private final Map<String, Vote> openedVotes;
    private final EventManager eventManager;

    public Counter() {
        this.receivedBallots = new CollectedBallots(new ArrayList<>());
        this.openedVotes = new HashMap<>();
        this.eventManager = EventManager.getInstance();
    }

    /**
     * Receives a vote and adds it to the list of ballots.
     *
     * @param ballot The ballot to be added.
     */
    public void receiveVote(Ballot ballot) {
        if (CryptoUtils.verifySignature(Administrator.getPublicKey(), String.valueOf(ballot.hashCode()),
                ballot.getSignature())) {
            receivedBallots.addBallot(ballot);
        }
    }

    /**
     * Publishes the list of received ballots.
     */
    public void publishBallots() {
        eventManager.notify(COUNTER, receivedBallots);
    }

    /**
     * Opens the vote for a ballot at index
     *
     * @param index     The index of the ballot
     * @param secretKey The {@link SecretKey} of the voter
     */
    public void openVote(int index, SecretKey secretKey) {
        openedVotes.put(receivedBallots.getBallot(index).getVoterID(),
                CryptoUtils.decryptVote(secretKey, receivedBallots.getBallot(index).getEncryptedVote()));
    }

    /**
     * Counts the votes and announces the result.
     *
     * @return The result of the voting.
     */
    public String countVotes() {
        Map<String, Integer> voteCounts = new HashMap<>();
        for (Vote vote : openedVotes.values()) {
            String voteValue = vote.getValue();
            voteCounts.put(voteValue, voteCounts.getOrDefault(voteValue, 0) + 1);
        }
        return voteCounts.toString();
    }
}
