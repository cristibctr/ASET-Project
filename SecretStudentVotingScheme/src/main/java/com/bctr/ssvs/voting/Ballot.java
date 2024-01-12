package com.bctr.ssvs.voting;

/**
 * Represents a ballot in the voting system.
 */
public class Ballot {
    private String voterID;
    private String encryptedVote;
    private String signature;

    /**
     * Constructs a Ballot with the specified voter ID, encrypted vote, and signature.
     * @param voterID The ID of the voter.
     * @param encryptedVote The encrypted vote.
     * @param signature The signature of the ballot.
     */
    public Ballot(String voterID, String encryptedVote, String signature) {
        this.voterID = voterID;
        this.encryptedVote = encryptedVote;
        this.signature = signature;
    }

    /**
     * Gets the voter ID.
     * @return The voter ID.
     */
    public String getVoterID() {
        return voterID;
    }

    /**
     * Gets the encrypted vote.
     * @return The encrypted vote.
     */
    public String getEncryptedVote() {
        return encryptedVote;
    }

    /**
     * Gets the signature of the ballot.
     * @return The signature.
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the signature of the ballot.
     * @param signature The signature to set.
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ballot ballot = (Ballot) o;

        if (!voterID.equals(ballot.voterID)) return false;
        return encryptedVote.equals(ballot.encryptedVote);
    }

    @Override
    public int hashCode() {
        int result = voterID.hashCode();
        result = 31 * result + encryptedVote.hashCode();
        return result;
    }
}
