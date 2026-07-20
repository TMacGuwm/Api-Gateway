package com.tmac.gateway.proxy;

/**
 * Reactive proxy client abstraction for upstream forwarding.
 */
public class ReactorProxyClient {

    public ProxyResponse forward(ProxyRequest request) {
        // WebClient/Reactor Netty implementation can be plugged here.
        return new ProxyResponse(200, "proxy-placeholder");
    }
}
