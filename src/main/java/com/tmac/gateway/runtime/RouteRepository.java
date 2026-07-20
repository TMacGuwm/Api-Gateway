package com.tmac.gateway.runtime;

import com.tmac.gateway.route.RouteDefinition;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RouteRepository {
    private final Map<String, RouteDefinition> routes = new ConcurrentHashMap<>();

    public void save(RouteDefinition route) {
        routes.put(route.getId(), route);
    }

    public RouteDefinition find(String id) {
        return routes.get(id);
    }
}
