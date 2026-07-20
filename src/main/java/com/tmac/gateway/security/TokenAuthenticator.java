package com.tmac.gateway.security;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Simple API token authentication foundation.
 * Replace storage with Redis/DB in production deployment.
 */
public class TokenAuthenticator {
    private final Map<String, String> tokens = new ConcurrentHashMap<>();

    public void register(String token, String appId) {
        tokens.put(token, appId);
    }

    public String authenticate(String token) {
        String appId = tokens.get(token);
        if (appId == null) {
            throw new SecurityException("Invalid API token");
        }
        return appId;
    }
}
