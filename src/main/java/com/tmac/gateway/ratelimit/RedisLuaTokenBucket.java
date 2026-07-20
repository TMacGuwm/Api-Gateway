package com.tmac.gateway.ratelimit;

/**
 * Redis Lua token bucket limiter extension point.
 * Production implementation should execute atomic Lua scripts in Redis.
 */
public class RedisLuaTokenBucket {

    public boolean tryAcquire(String key, long limit) {
        if (key == null || key.isBlank()) {
            throw new IllegalArgumentException("rate limit key required");
        }
        return limit > 0;
    }
}
