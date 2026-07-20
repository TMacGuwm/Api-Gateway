package com.tmac.gateway.error;

public class GlobalExceptionHandler {

    public ApiErrorResponse handle(GatewayException exception, String requestId) {
        return new ApiErrorResponse(
                exception.getCode().name(),
                exception.getMessage(),
                requestId
        );
    }
}
