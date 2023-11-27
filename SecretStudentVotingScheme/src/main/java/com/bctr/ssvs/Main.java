package com.bctr.ssvs;

import com.bctr.ssvs.voting.Administrator;
import com.bctr.ssvs.voting.Counter;
import com.bctr.ssvs.voting.Vote;
import com.bctr.ssvs.voting.Voter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static Counter counter = new Counter();
    public static List<Voter> voters = new ArrayList<>(List.of(
            new Voter(counter),
            new Voter(counter),
            new Voter(counter),
            new Voter(counter),
            new Voter(counter)
    ));
    public static Administrator administrator = Administrator.getAdministrator(voters);
    public static void main(String[] args) {
        //An attacker trying to manipulate the voting process should not be allowed to vote
//        Voter fakeVoter = new Voter(counter);
//        fakeVoter.setAdministrator(administrator);
//        voters.add(fakeVoter);
        voters.forEach(voter -> {
            voter.prepareBallot(new Vote(String.valueOf(ThreadLocalRandom.current().nextInt(1, 11))));
            voter.sendBallot();
            administrator.publishSignedVotersList();
            voter.sendVote();
            counter.publishBallots();
        });
        System.out.println(counter.countVotes());
    }
}