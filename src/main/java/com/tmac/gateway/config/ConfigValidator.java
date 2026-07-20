package com.tmac.gateway.config;

public class ConfigValidator {
    public void validate(String serviceName, int port) {
        if (serviceName == null || serviceName.isBlank()) {
            throw new IllegalArgumentException("gateway service name is required");
        }
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException("invalid gateway port");
        }
    }
}
