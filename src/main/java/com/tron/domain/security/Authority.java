package com.tron.domain.security;
import org.springframework.security.core.GrantedAuthority;


//Represents an authority granted to an Authentication object.
public class Authority implements GrantedAuthority{

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
