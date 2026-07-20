package com.tmac.gateway.ratelimit;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Local token bucket limiter foundation.
 */
public class TokenBucketLimiter {
    private final ConcurrentHashMap<String, AtomicLong> buckets = new ConcurrentHashMap<>();

    public boolean allow(String key, long limit) {
        AtomicLong counter = buckets.computeIfAbsent(key, k -> new AtomicLong());
        return counter.incrementAndGet() <= limit;
    }
}
