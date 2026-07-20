package com.tmac.gateway.loadbalance;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Production friendly round robin load balancer.
 */
public class LoadBalancer {
    private final AtomicInteger index = new AtomicInteger();

    public String select(List<String> instances) {
        if (instances == null || instances.isEmpty()) {
            throw new IllegalStateException("No healthy upstream instance");
        }
        int position = Math.abs(index.getAndIncrement() % instances.size());
        return instances.get(position);
    }
}
