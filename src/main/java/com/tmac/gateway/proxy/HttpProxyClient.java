package com.tmac.gateway.proxy;

/**
 * HTTP reverse proxy abstraction.
 * A production implementation can delegate to Spring WebClient/Reactor Netty.
 */
public class HttpProxyClient {

    public String forward(String targetUrl, String requestBody) {
        if (targetUrl == null || targetUrl.isBlank()) {
            throw new IllegalArgumentException("target url required");
        }
        return "forwarded:" + targetUrl;
    }
}
