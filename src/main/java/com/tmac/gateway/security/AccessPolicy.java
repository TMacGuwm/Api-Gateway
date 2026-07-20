package com.tmac.gateway.security;

import java.util.Set;

/**
 * API access policy model.
 */
public record AccessPolicy(String appId, Set<String> permissions) {

    public boolean allows(String permission) {
        return permissions != null && permissions.contains(permission);
    }
}
