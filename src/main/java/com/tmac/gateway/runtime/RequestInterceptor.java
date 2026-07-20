package com.tmac.gateway.runtime;

import com.tmac.gateway.core.RequestContext;

@FunctionalInterface
public interface RequestInterceptor {
    void intercept(RequestContext context);
}
