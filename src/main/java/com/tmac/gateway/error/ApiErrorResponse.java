package com.tmac.gateway.error;

import java.time.Instant;

public record ApiErrorResponse(
        String code,
        String message,
        Instant timestamp,
        String requestId
) {
    public ApiErrorResponse(String code, String message, String requestId) {
        this(code, message, Instant.now(), requestId);
    }
}
