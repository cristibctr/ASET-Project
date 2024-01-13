package com.bctr.ssvs;

import com.bctr.ssvs.voting.Administrator;
import com.bctr.ssvs.voting.Ballot;
import com.bctr.ssvs.voting.Counter;
import com.bctr.ssvs.voting.CryptoUtils;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {

    @Test
    public void testGetReceivedEncryptedVotes() throws NoSuchAlgorithmException {
        // given
        Counter counter = new Counter();

        // Add some sample ballots
        Ballot ballot1 = new Ballot("Voter1", "encryptedVote1", "signature1");
        Ballot ballot2 = new Ballot("Voter2", "encryptedVote2", "signature2");
        try (MockedStatic<CryptoUtils> mockedCryptoUtils = Mockito.mockStatic(CryptoUtils.class);
             MockedStatic<Administrator> mockedAdministrator = Mockito.mockStatic(Administrator.class)) {
            mockedCryptoUtils.when(() -> CryptoUtils.verifySignature(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(true);
            mockedAdministrator.when(Administrator::getPublicKey).thenReturn(KeyPairGenerator.getInstance("RSA").generateKeyPair().getPublic());
            counter.receiveVote(ballot1);
            counter.receiveVote(ballot2);
        }

        // when
        String encryptedVote1 = (String) counter.getReceivedEncryptedVotes(0);
        String encryptedVote2 = (String) counter.getReceivedEncryptedVotes(1);
        // then
        assertEquals("encryptedVote1", encryptedVote1);
        assertEquals("encryptedVote2", encryptedVote2);
    }

}