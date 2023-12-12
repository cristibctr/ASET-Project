package com.bctr.ssvs.voting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    private Counter counter;
    private Ballot validBallot;
    private Ballot invalidBallot;

    @BeforeEach
    public void setUp() {
        counter = new Counter();

        // Create a valid ballot for testing
        validBallot = new Ballot();
        validBallot.setVoterID("Voter1");
        validBallot.setEncryptedVote("EncryptedVote1");
        validBallot.setSignature("ValidSignature");

        // Create an invalid ballot for testing
        invalidBallot = new Ballot();
        invalidBallot.setVoterID("Voter2");
        invalidBallot.setEncryptedVote("EncryptedVote2");
        invalidBallot.setSignature("InvalidSignature");
    }

    @Test
    public void testReceiveVoteWithValidSignature() {
        counter.receiveVote(validBallot);

        Log.d("The vote should be received and added to the list");
        assertEquals(1, counter.getReceivedBallots().getBallots().size());
    }

    @Test
    public void testReceiveVoteWithInvalidSignature() {
        counter.receiveVote(invalidBallot);

        Log.d("The vote should not be counted");
        assertEquals(0, counter.getReceivedBallots().getBallots().size());
    }

    @Test
    public void testOpenVote() {
        counter.receiveVote(validBallot);
        int index = 0;
        counter.openVote(index, someSecretKey); // Replace someSecretKey with an actual SecretKey

        Log.d("The signature should be invalid");
        assertEquals(1, counter.getOpenedVotes().size());
    }

    @Test
    public void testCountVotes() {
        // Assuming receiveVote and openVote work correctly
        counter.receiveVote(validBallot);
        int index = 0;
        counter.openVote(index, someSecretKey); // Replace someSecretKey with an actual SecretKey

        String result = counter.countVotes();

        Log.d("The signature should be invalid");
        assertNotNull(result);
    }
}
