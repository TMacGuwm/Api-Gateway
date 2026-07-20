package com.tmac.gateway.billing;

import java.time.Instant;

public record TokenUsageRecord(
        String appId,
        String model,
        long inputTokens,
        long outputTokens,
        Instant timestamp
) {}
