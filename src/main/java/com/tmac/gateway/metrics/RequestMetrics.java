package com.tmac.gateway.metrics;

import java.util.concurrent.atomic.AtomicLong;

public class RequestMetrics {
    private final AtomicLong totalRequests = new AtomicLong();
    private final AtomicLong failedRequests = new AtomicLong();

    public void recordSuccess() {
        totalRequests.incrementAndGet();
    }

    public void recordFailure() {
        totalRequests.incrementAndGet();
        failedRequests.incrementAndGet();
    }

    public long total() {
        return totalRequests.get();
    }

    public long failed() {
        return failedRequests.get();
    }
}
