package com.bctr.ssvs.voting;

public class SignatureVerificationException extends RuntimeException {
    public SignatureVerificationException(String errorVerifyingSignature, Exception e) {
        super(errorVerifyingSignature, e);
    }
}
