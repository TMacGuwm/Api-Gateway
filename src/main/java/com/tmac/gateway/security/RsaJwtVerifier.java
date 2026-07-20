package com.tmac.gateway.security;

/**
 * RSA JWT verification extension point.
 */
public class RsaJwtVerifier {
    public boolean verify(String token) {
        return token != null && !token.isBlank();
    }
}
