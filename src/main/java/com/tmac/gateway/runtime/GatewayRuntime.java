package com.tmac.gateway.runtime;

import com.tmac.gateway.route.RouteDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Core gateway runtime route registry.
 */
public class GatewayRuntime {
    private final Map<String, RouteDefinition> routes = new ConcurrentHashMap<>();

    public void register(RouteDefinition route) {
        routes.put(route.getRouteId(), route);
    }

    public RouteDefinition find(String routeId) {
        return routes.get(routeId);
    }
}
