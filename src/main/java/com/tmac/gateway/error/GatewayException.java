package com.tmac.gateway.error;

public class GatewayException extends RuntimeException {
    private final ErrorCode errorCode;

    public GatewayException(ErrorCode errorCode) {
        super(errorCode.message());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
