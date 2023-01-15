package com.aeflheim.strom.config.authentication;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class OtpAuthentication extends UsernamePasswordAuthentication {

    public OtpAuthentication(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
        super(principal, credentials, authorities);
    }

    public OtpAuthentication(Object principal, Object credentials) {
        super(principal, credentials);
    }
    
}
