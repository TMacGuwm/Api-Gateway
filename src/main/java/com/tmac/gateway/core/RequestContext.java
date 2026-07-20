package com.tmac.gateway.core;

import java.util.HashMap;
import java.util.Map;

public class RequestContext {
    private final String requestId;
    private final String path;
    private final Map<String,Object> attributes = new HashMap<>();

    public RequestContext(String requestId, String path) {
        this.requestId = requestId;
        this.path = path;
    }

    public String getRequestId() { return requestId; }
    public String getPath() { return path; }

    public void put(String key,Object value){
        attributes.put(key,value);
    }

    public Object get(String key){
        return attributes.get(key);
    }
}
