package com.tmac.gateway.proxy;

public record ProxyRequest(String path, String method, String body) {
}
