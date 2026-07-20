package com.tmac.gateway.filter;

import java.util.UUID;

public class RequestIdFilter {

    public String generateRequestId() {
        return UUID.randomUUID().toString();
    }
}
