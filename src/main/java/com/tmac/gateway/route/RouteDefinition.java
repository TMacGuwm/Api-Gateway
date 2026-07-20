package com.tmac.gateway.route;

public class RouteDefinition {
    private final String id;
    private final String path;
    private final String serviceUrl;

    public RouteDefinition(String id, String path, String serviceUrl) {
        this.id = id;
        this.path = path;
        this.serviceUrl = serviceUrl;
    }

    public String getId() { return id; }
    public String getPath() { return path; }
    public String getServiceUrl() { return serviceUrl; }
}
