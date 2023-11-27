package com.bctr.ssvs.voting.DTO;

import com.bctr.ssvs.voting.Ballot;

import java.util.Iterator;
import java.util.List;

public record CollectedBallots(List<Ballot> ballots) implements GenericEventDTO, Iterable<Ballot> {

    public Ballot getBallot(int index) {
        return ballots.get(index);
    }

    public void addBallot(Ballot ballot) {
        ballots.add(ballot);
    }

    @Override
    public Iterator<Ballot> iterator() {
        return ballots.iterator();
    }
}
