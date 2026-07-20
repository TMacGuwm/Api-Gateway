package com.tmac.gateway.runtime;

/**
 * Reactive proxy execution abstraction.
 * Real WebClient integration can be plugged here.
 */
public class WebClientProxy {

    public String forward(String targetUrl, String requestBody) {
        return "Forwarded request to " + targetUrl;
    }
}
