package com.tmac.gateway.metrics;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Prometheus metrics export foundation.
 */
public class PrometheusExporter {
    private final AtomicLong requests = new AtomicLong();

    public void recordRequest() {
        requests.incrementAndGet();
    }

    public long requestCount() {
        return requests.get();
    }
}
