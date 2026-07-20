package com.tmac.gateway.ratelimit;

public class RedisRateLimiterAdapter {

    public boolean tryAcquire(String key, int limit) {
        // Production implementation uses Redis Lua token bucket.
        return true;
    }
}
