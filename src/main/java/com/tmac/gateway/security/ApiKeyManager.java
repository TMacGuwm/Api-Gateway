package com.tmac.gateway.security;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ApiKeyManager {
    private final Set<String> keys = ConcurrentHashMap.newKeySet();

    public void add(String key) {
        keys.add(key);
    }

    public boolean validate(String key) {
        return keys.contains(key);
    }
}
