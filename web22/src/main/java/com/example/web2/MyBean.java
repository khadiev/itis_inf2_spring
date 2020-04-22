package com.example.web2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("customscope")
@Component("myBean")
public class MyBean {
     public String field;
}
