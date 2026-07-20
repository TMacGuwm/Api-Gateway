package com.tmac.gateway.security;

/**
 * JWT validation extension point.
 */
public class JwtValidator {

    public boolean validate(String token) {
        return token != null && !token.isBlank();
    }
}
