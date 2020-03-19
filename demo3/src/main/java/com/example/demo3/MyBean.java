package com.example.demo3;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public String helloWorld(){
        System.out.println("I am hello");
        return "Hello World!!!";
    }

    public String helloWorld2(){
        System.out.println("I am world");
        return "Hello World22222!!!";
    }
}
