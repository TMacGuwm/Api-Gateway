package com.tmac.gateway.runtime;

import com.tmac.gateway.route.RouteDefinition;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/gateway")
public class GatewayController {

    private final Map<String, RouteDefinition> routes = new ConcurrentHashMap<>();

    @PostMapping("/routes")
    public String register(@RequestBody RouteDefinition route) {
        routes.put(route.getId(), route);
        return "registered";
    }

    @GetMapping("/routes")
    public Map<String, RouteDefinition> routes() {
        return routes;
    }
}
