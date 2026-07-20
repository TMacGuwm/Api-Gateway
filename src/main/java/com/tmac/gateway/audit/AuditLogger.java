package com.tmac.gateway.audit;

import java.time.Instant;

/**
 * Gateway audit event logger foundation.
 */
public class AuditLogger {

    public void log(String requestId, String path, String appId, long costMs) {
        System.out.printf(
                "AUDIT requestId=%s app=%s path=%s cost=%dms time=%s%n",
                requestId, appId, path, costMs, Instant.now());
    }
}
