package com.tmac.gateway.trace;

import java.util.UUID;

public class TraceContext {

    public String createTraceId() {
        return UUID.randomUUID().toString();
    }
}
