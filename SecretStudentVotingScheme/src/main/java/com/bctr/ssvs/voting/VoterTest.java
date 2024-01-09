package com.bctr.ssvs.voting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.logging.Logger;


public class VoterTest {

    private Counter counter;
    private Administrator administrator;
    private Voter voter;
    private static Logger logger = Logger.getLogger(com.bctr.ssvs.voting.VoterTest.class.getName());

    @BeforeEach
    public void setUp() {
        counter = new Counter();
        voter = new Voter(counter);
        administrator = Administrator.getAdministrator(List.of(voter));
        voter.setAdministrator(administrator);
    }

    @Test
    public void prepareBallotShouldSetBallot() {
        // Create instance
        Vote vote = new Vote("CandidateA");

        voter.prepareBallot(vote);

        logger.info("The ballot should be created");
        assertNotNull(voter.getBallot());
        assertNotNull(voter.getBallot().getEncryptedVote());
        assertNotEquals(vote.getValue(), voter.getBallot().getEncryptedVote());
    }
    @Test
    public void sendBallotShouldSignBallot() {
        // Create instance
        Vote vote = new Vote("CandidateA");
        voter.prepareBallot(vote);

        voter.sendBallot();

        logger.info("The ballot should be signed");
        assertTrue(voter.getBallot().getSignature() != null && !voter.getBallot().getSignature().isEmpty());
    }
}
