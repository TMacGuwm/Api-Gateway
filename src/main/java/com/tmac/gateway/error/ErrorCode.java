package com.tmac.gateway.error;

public enum ErrorCode {
    AUTH_FAILED("AUTH_001", "Authentication failed"),
    ACCESS_DENIED("AUTH_002", "Access denied"),
    RATE_LIMITED("LIMIT_001", "Too many requests"),
    ROUTE_NOT_FOUND("ROUTE_001", "Route not found"),
    UPSTREAM_ERROR("UPSTREAM_001", "Upstream service error");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code() { return code; }
    public String message() { return message; }
}
