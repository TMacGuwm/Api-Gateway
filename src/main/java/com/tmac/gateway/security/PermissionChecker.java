package com.tmac.gateway.security;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class PermissionChecker {
    private final Set<String> permissions = ConcurrentHashMap.newKeySet();

    public void grant(String permission) {
        permissions.add(permission);
    }

    public boolean check(String permission) {
        return permissions.contains(permission);
    }
}
