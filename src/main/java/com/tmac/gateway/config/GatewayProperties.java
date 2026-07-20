package com.tmac.gateway.config;

public class GatewayProperties {
    private int port = 8080;
    private int timeoutMs = 3000;

    public int getPort() {
        return port;
    }

    public int getTimeoutMs() {
        return timeoutMs;
    }
}
