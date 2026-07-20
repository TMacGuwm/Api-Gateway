package com.tmac.gateway.core;

public interface GatewayFilter {
    void doFilter(RequestContext context);
}
