package com.tmac.gateway.ratelimit;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Distributed limiter extension point.
 * Redis implementation can replace local counter.
 */
public class DistributedRateLimiter {

    private final ConcurrentHashMap<String, AtomicInteger> counters = new ConcurrentHashMap<>();

    public boolean allow(String key, int limit) {
        AtomicInteger count = counters.computeIfAbsent(key, k -> new AtomicInteger());
        return count.incrementAndGet() <= limit;
    }
}
