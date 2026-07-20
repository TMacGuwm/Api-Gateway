package com.tmac.gateway.runtime;

import com.tmac.gateway.route.RouteDefinition;

/**
 * Upstream proxy execution abstraction.
 */
public class ProxyHandler {

    public String resolveTarget(RouteDefinition route) {
        if (route == null) {
            throw new IllegalArgumentException("route required");
        }
        return route.getServiceUrl();
    }
}
