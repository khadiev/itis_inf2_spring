package com.example.security2;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class AuthenticationManagerImpl implements AuthenticationManager {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        MyAuth result;


        if ("admin".equals(username) && "adminadmin".equals(password)){
             result = new MyAuth(username, password);
            ((Set<MyRole>)result.getAuthorities()).add(new MyRole("ROLE_ADMIN"));
            result.setAuthenticated(true);
        }
        else {
            result = MyAuth.getInstance();
        }
        return result;
    }
}
