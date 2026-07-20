package com.tmac.gateway.health;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class HealthChecker {

    private final Map<String, Boolean> status = new ConcurrentHashMap<>();

    public void update(String instance, boolean healthy) {
        status.put(instance, healthy);
    }

    public boolean isHealthy(String instance) {
        return status.getOrDefault(instance, false);
    }
}
