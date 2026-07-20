package com.tmac.gateway.observability;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Lightweight metrics registry foundation.
 */
public class MetricsRegistry {
    private final ConcurrentHashMap<String, AtomicLong> counters = new ConcurrentHashMap<>();

    public void increment(String name) {
        counters.computeIfAbsent(name, k -> new AtomicLong()).incrementAndGet();
    }

    public long get(String name) {
        AtomicLong value = counters.get(name);
        return value == null ? 0 : value.get();
    }
}
