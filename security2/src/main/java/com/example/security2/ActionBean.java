package com.example.security2;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

@Component
public class ActionBean {

    @Secured("ROLE_ADMIN")
    public void doAction(){
        System.out.println("Action");
    }
}
