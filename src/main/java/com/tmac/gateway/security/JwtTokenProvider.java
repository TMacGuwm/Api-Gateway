package com.tmac.gateway.security;

import java.time.Instant;
import java.util.Base64;

/**
 * JWT provider foundation placeholder.
 * Production version will use signed JWT libraries and key rotation.
 */
public class JwtTokenProvider {

    public String create(String subject) {
        String payload = subject + "." + Instant.now();
        return Base64.getEncoder().encodeToString(payload.getBytes());
    }

    public boolean validate(String token) {
        try {
            Base64.getDecoder().decode(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
