package com.tmac.gateway.security;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class RsaKeyManager {

    private final KeyPair keyPair;

    public RsaKeyManager() {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(2048);
            this.keyPair = generator.generateKeyPair();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public KeyPair getKeyPair() {
        return keyPair;
    }
}
