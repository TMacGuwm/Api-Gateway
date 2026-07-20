package com.tmac.gateway.filter;

import com.tmac.gateway.audit.AuditLogger;
import com.tmac.gateway.core.GatewayFilter;
import com.tmac.gateway.core.RequestContext;

public class AuditFilter implements GatewayFilter {
    private final AuditLogger logger;

    public AuditFilter(AuditLogger logger){
        this.logger = logger;
    }

    @Override
    public void doFilter(RequestContext context){
        logger.log(
            context.getRequestId(),
            context.getPath(),
            String.valueOf(context.get("appId")),
            0L
        );
    }
}
