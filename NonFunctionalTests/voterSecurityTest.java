import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoterSecurityTest {

    @Test
    public void testPrepareBallotEncryptsVote() {
        // Arrange
        Counter counter = new Counter();
        Voter voter = new Voter(counter);
        Vote vote = new Vote("CandidateA");

        // Act
        voter.prepareBallot(vote);

        // Assert
        assertNotNull(voter.getBallot().getEncryptedVote());
        assertNotEquals(vote.getValue(), voter.getBallot().getEncryptedVote());
    }

    @Test
    public void testSendBallotSignatureVerification() {
        // Arrange
        Counter counter = new Counter();
        Voter voter = new Voter(counter);
        Administrator administrator = new Administrator(counter);
        voter.setAdministrator(administrator);
        Vote vote = new Vote("CandidateB");
        voter.prepareBallot(vote);

        // Act
        voter.sendBallot();

        // Assert
        assertTrue(voter.getBallot().getSignature() != null && !voter.getBallot().getSignature().isEmpty());
        assertTrue(voter.checkSignature(voter.getBallot().getSignature()));
    }

    @Test
    public void testSendVoteSecurely() {
        // Arrange
        Counter counter = new Counter();
        Voter voter = new Voter(counter);
        Vote vote = new Vote("CandidateC");
        voter.prepareBallot(vote);

        // Act
        voter.sendVote();

        // Assert
        // Add assertions to ensure that the vote is sent securely, and the counter handles it appropriately
    }
}
