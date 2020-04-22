package com.example.web2;

import com.example.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class MySessionBean {
    private Person person;
}
