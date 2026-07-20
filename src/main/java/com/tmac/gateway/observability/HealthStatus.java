package com.tmac.gateway.observability;

public record HealthStatus(boolean healthy, String message) {
}
