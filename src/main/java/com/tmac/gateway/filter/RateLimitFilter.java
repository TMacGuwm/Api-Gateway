package com.tmac.gateway.filter;

import com.tmac.gateway.core.GatewayFilter;
import com.tmac.gateway.core.RequestContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class RateLimitFilter implements GatewayFilter {

    private final ConcurrentHashMap<String, AtomicInteger> counters = new ConcurrentHashMap<>();
    private final int limit;

    public RateLimitFilter(int limit) {
        this.limit = limit;
    }

    @Override
    public void doFilter(RequestContext context) {
        String key = context.getAppId();
        AtomicInteger count = counters.computeIfAbsent(key, k -> new AtomicInteger());
        if (count.incrementAndGet() > limit) {
            throw new RuntimeException("Rate limit exceeded");
        }
    }
}
