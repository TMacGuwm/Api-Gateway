package com.tmac.gateway.metrics;

import java.util.concurrent.atomic.AtomicLong;

public class PrometheusMetrics {
    private final AtomicLong requests = new AtomicLong();
    private final AtomicLong failures = new AtomicLong();

    public void request() {
        requests.incrementAndGet();
    }

    public void failure() {
        failures.incrementAndGet();
    }

    public long requests() {
        return requests.get();
    }

    public long failures() {
        return failures.get();
    }
}
