package com.example.demo3;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advices {

    @After( value = "execution(* com.example.demo3.MyBean.*(..))")
    public void logMethodCall(JoinPoint jp) {

        System.out.println("Good " + jp.getTarget() + " this:" + jp.getThis());
    }

}
