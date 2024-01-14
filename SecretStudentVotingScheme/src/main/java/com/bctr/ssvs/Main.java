package com.bctr.ssvs;

import com.bctr.ssvs.voting.Administrator;
import com.bctr.ssvs.voting.Counter;
import com.bctr.ssvs.voting.Vote;
import com.bctr.ssvs.voting.Voter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Counter counter = new Counter();
        Path path = Path.of("src/main/resources/votes.txt");
        Map<Voter, Vote> voteMap = Files.newBufferedReader(path)
                .lines()
                .collect(Collectors.toMap(vote -> new Voter(counter), Vote::new));
        Administrator administrator = Administrator.getAdministrator(List.copyOf(voteMap.keySet()));
        //An attacker trying to manipulate the voting process should not be allowed to vote
//          Voter fakeVoter = new Voter(counter);
//          fakeVoter.setAdministrator(administrator);
//          voteMap.put(fakeVoter, new Vote("3"));
        voteMap.forEach((key, value) -> {
            key.prepareBallot(value);
            key.sendBallot();
            administrator.publishSignedVotersList();
            key.sendVote();
            counter.publishBallots();
        });
        System.out.println(counter.countVotes());
    }
}