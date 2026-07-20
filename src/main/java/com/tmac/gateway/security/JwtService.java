package com.tmac.gateway.security;

import java.time.Instant;
import java.util.Base64;

/**
 * JWT service extension point.
 * Production deployments should use signed JWT libraries and key rotation.
 */
public class JwtService {

    public String createSubjectToken(String subject) {
        String payload = subject + "." + Instant.now().toEpochMilli();
        return Base64.getEncoder().encodeToString(payload.getBytes());
    }

    public boolean validate(String token) {
        return token != null && !token.isBlank();
    }
}
