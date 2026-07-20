package com.tmac.gateway.metrics;

import java.util.concurrent.atomic.AtomicLong;

public class MetricsCollector {
    private final AtomicLong requests = new AtomicLong();
    private final AtomicLong failures = new AtomicLong();

    public void recordRequest(){requests.incrementAndGet();}
    public void recordFailure(){failures.incrementAndGet();}
    public long requests(){return requests.get();}
    public long failures(){return failures.get();}
}
