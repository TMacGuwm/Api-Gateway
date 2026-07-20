package com.tmac.gateway.filter;

import com.tmac.gateway.core.GatewayFilter;
import com.tmac.gateway.core.RequestContext;
import com.tmac.gateway.security.TokenAuthenticator;

public class AuthenticationFilter implements GatewayFilter {
    private final TokenAuthenticator authenticator;

    public AuthenticationFilter(TokenAuthenticator authenticator){
        this.authenticator = authenticator;
    }

    @Override
    public void doFilter(RequestContext context){
        Object token = context.get("token");
        if(token == null){
            throw new SecurityException("Missing token");
        }
        context.put("appId", authenticator.authenticate(token.toString()));
    }
}
