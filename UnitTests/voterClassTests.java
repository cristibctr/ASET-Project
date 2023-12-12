package com.bctr.ssvs.voting;

import com.bctr.ssvs.voting.DTO.CollectedBallots;
import com.bctr.ssvs.voting.DTO.SignedBallots;
import com.bctr.ssvs.voting.observer.EventManager;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.SecretKey;
import java.security.KeyPair;

import static org.junit.Assert.*;

public class VoterTest {

    private Counter counter;
    private Administrator administrator;
    private Voter voter;

    @Before
    public void setUp() {
        counter = new Counter();
        administrator = new Administrator();
        voter = new Voter(counter);
        voter.setAdministrator(administrator);
    }

    @Test
    public void prepareBallotShouldSetBallot() {
        // Create instance
        Vote vote = new Vote("CandidateA");

        // Act
        voter.prepareBallot(vote);

        Log.d("The ballot should be created");
        assertNotNull(voter.getBallot());
        assertNotNull(voter.getBallot().getEncryptedVote());
        assertNotEquals(vote.getValue(), voter.getBallot().getEncryptedVote());
    }

    public void sendBallotShouldSignBallot() {
        // Create instance
        Vote vote = new Vote("CandidateA");
        voter.prepareBallot(vote);

        // Act
        voter.sendBallot();

        Log.d("The ballot should be signed");
        assertTrue(voter.getBallot().getSignature() != null && !voter.getBallot().getSignature().isEmpty());
    }

    @Test
    public void sendVoteShouldReceiveVote() {
        // Create instance
        Vote vote = new Vote("CandidateA");
        voter.prepareBallot(vote);

        // Act
        voter.sendVote();

        Log.d("The vote should be counted");
        assertNotNull(counter.getReceivedVotes());
        assertEquals(1, counter.getReceivedVotes().size());
    }

    @Test
    public void checkSignatureShouldReturnTrueForValidSignature() {
        // Create instance
        Vote vote = new Vote("CandidateA");
        voter.prepareBallot(vote);

        // Act
        boolean result = voter.checkSignature("validSignature");

        Log.d("The signature should be valid");
        assertTrue(result);
    }

    @Test
    public void checkSignatureShouldReturnFalseForInvalidSignature() {
        // Create instance
        Vote vote = new Vote("CandidateA");
        voter.prepareBallot(vote);

        // Act
        boolean result = voter.checkSignature("invalidSignature");

        Log.d("The signature should be invalid");
        assertFalse(result);
    }
}
