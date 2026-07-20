package com.tmac.gateway.proxy;

/**
 * Gateway proxy execution pipeline.
 */
public class ProxyExecutor {

    public ProxyResponse execute(ProxyRequest request) {
        return new ProxyResponse(200, "proxy pipeline ready");
    }
}
