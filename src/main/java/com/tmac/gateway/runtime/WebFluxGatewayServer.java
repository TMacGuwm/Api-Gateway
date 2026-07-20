package com.tmac.gateway.runtime;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Reactive gateway server lifecycle abstraction.
 */
public class WebFluxGatewayServer {
    private final AtomicBoolean running = new AtomicBoolean(false);

    public void start() {
        running.set(true);
    }

    public void stop() {
        running.set(false);
    }

    public boolean isRunning() {
        return running.get();
    }
}
