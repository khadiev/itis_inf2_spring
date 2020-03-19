package com.example.security2;

import org.springframework.security.core.GrantedAuthority;

public class MyRole implements GrantedAuthority {
    String rolename;

    public MyRole(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String getAuthority() {
        return rolename;
    }
}
