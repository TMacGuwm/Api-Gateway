package com.tmac.gateway.metrics;

import java.util.Map;

public class MetricsEndpoint {

    public Map<String, Object> snapshot() {
        return Map.of(
                "service", "api-gateway",
                "status", "UP"
        );
    }
}
