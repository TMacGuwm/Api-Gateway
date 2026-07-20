package com.tmac.gateway.ratelimit;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TokenRateLimiter {
    private final ConcurrentHashMap<String, AtomicInteger> counter = new ConcurrentHashMap<>();
    public boolean allow(String apiKey,int limit){
        AtomicInteger c=counter.computeIfAbsent(apiKey,k->new AtomicInteger());
        return c.incrementAndGet()<=limit;
    }
}
