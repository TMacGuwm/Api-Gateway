package com.tmac.gateway.billing;

public class TokenBillingService {
    public long calculateCost(long inputTokens,long outputTokens){
        return inputTokens + outputTokens;
    }
}
