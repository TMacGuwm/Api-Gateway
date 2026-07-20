package com.tmac.gateway.filter;

public final class FilterOrder {
    private FilterOrder() {}

    public static final int AUTHENTICATION = 100;
    public static final int RATE_LIMIT = 200;
    public static final int BILLING = 300;
    public static final int AUDIT = 400;
}
