package com.tmac.gateway.registry;

import java.util.List;

/**
 * Service discovery abstraction.
 */
public interface ServiceRegistry {

    List<String> discover(String serviceName);
}
