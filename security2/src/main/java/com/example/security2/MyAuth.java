package com.example.security2;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MyAuth implements Authentication {
    private Set<MyRole> roles = new HashSet<>();
    private String username;
    private String password;
    private boolean authenticated;

    public static MyAuth getInstance(){
        MyAuth result = new MyAuth("a", "a");
        result.setAuthenticated(false);
        return result;
    }

    public MyAuth(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public Object getCredentials() {
        return password;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return username;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }

    @Override
    public void setAuthenticated(boolean b) throws IllegalArgumentException {
        authenticated = b;
    }

    @Override
    public String getName() {
        return null;
    }
}
