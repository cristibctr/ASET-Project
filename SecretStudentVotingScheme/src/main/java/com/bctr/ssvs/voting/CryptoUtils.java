package com.bctr.ssvs.voting;

import java.security.*;
import java.util.Base64;
import javax.crypto.*;

/**
 * Utility class for cryptographic operations in the voting system.
 */
public class CryptoUtils {
    private static final String ENCRYPTION_ALGORITHM = "AES";
    private static final String SIGNATURE_ALGORITHM = "SHA256withRSA";

    /**
     * @return The signature key pair
     */
    public static SecretKey getEncryptionKey()
    {
        KeyGenerator keyGen = null;
        try {
            keyGen = KeyGenerator.getInstance(ENCRYPTION_ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error initializing cryptographic keys", e);
        }
        return keyGen.generateKey();
    }

    /**
     * @return The signature key pair
     */
    public static KeyPair getSignaturePair()
    {
        KeyPairGenerator keyPairGen = null;
        try {
            keyPairGen = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error initializing cryptographic keys", e);
        }
        return keyPairGen.generateKeyPair();
    }

    /**
     * Encrypts a vote.
     * @param vote The vote to be encrypted.
     * @return The encrypted vote.
     */
    public static String encryptVote(SecretKey encryptionKey, Vote vote) {
        try {
            Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, encryptionKey);
            byte[] encryptedData = cipher.doFinal(vote.getValue().getBytes());
            return Base64.getEncoder().encodeToString(encryptedData);
        } catch (Exception e) {
            throw new RuntimeException("Error encrypting vote", e);
        }
    }

    /**
     * Decrypts a vote.
     * @param encryptedVote The encrypted vote.
     * @return The decrypted vote.
     */
    public static Vote decryptVote(SecretKey encryptionKey, String encryptedVote) {
        try {
            Cipher cipher = Cipher.getInstance(ENCRYPTION_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, encryptionKey);
            byte[] decryptedData = cipher.doFinal(Base64.getDecoder().decode(encryptedVote));
            return new Vote(new String(decryptedData));
        } catch (Exception e) {
            throw new RuntimeException("Error decrypting vote", e);
        }
    }

    /**
     * Generates a digital signature for a given data.
     * @param privateKey The private key to sign with.
     * @param data The data to be signed.
     * @return The digital signature.
     */
    public static String generateSignature(PrivateKey privateKey, String data) {
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initSign(privateKey);
            signature.update(data.getBytes());
            return Base64.getEncoder().encodeToString(signature.sign());
        } catch (Exception e) {
            throw new RuntimeException("Error generating signature", e);
        }
    }

    /**
     * Verifies the digital signature of a given data.
     * @param signaturePublic The public key to verify with.
     * @param data The data whose signature is to be verified.
     * @param signatureStr The digital signature.
     * @return true if the signature is valid, false otherwise.
     */
    public static boolean verifySignature(PublicKey signaturePublic, String data, String signatureStr) {
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initVerify(signaturePublic);
            signature.update(data.getBytes());
            return signature.verify(Base64.getDecoder().decode(signatureStr));
        } catch (Exception e) {
            throw new RuntimeException("Error verifying signature", e);
        }
    }
}