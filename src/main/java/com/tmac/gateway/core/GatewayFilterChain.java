package com.tmac.gateway.core;

import java.util.List;

public class GatewayFilterChain {

    private final List<GatewayFilter> filters;

    public GatewayFilterChain(List<GatewayFilter> filters) {
        this.filters = filters;
    }

    public void execute(RequestContext context) {
        for (GatewayFilter filter : filters) {
            filter.doFilter(context);
        }
    }
}
