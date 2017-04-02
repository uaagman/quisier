package com.quisier.config.security.exception;

import com.quisier.config.security.jwt.JwtToken;
import org.springframework.security.core.AuthenticationException;

/**
 * Created by gustavosousa on 4/1/17.
 */
public class JwtExpiredTokenException extends AuthenticationException {
    private static final long serialVersionUID = -5959543783324224864L;

    private JwtToken token;

    public JwtExpiredTokenException(String msg) {
        super(msg);
    }

    public JwtExpiredTokenException(JwtToken token, String msg, Throwable t) {
        super(msg, t);
        this.token = token;
    }

    public String token() {
        return this.token.getToken();
    }
}