package com.bctr.ssvs.voting.DTO;

import com.bctr.ssvs.voting.Ballot;

import java.util.Map;

public class SignedBallots implements GenericEventDTO {
    private final Map<String, String> ballotSignature;

    public SignedBallots(Map<String, String> ballotSignature) {
        this.ballotSignature = ballotSignature;
    }

    public String getSignature(String id) {
        return ballotSignature.get(id);
    }

    public void addBallotSignature(Ballot ballot, String ballotSignature) {
        this.ballotSignature.put(ballot.getVoterID(), ballotSignature);
    }

    public boolean containsSignature(Ballot ballot) {
        return ballotSignature.containsKey(ballot.getVoterID());
    }

    public int getSize() {
        return ballotSignature.size();
    }
}
