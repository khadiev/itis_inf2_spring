package com.example.security2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication
@EnableGlobalMethodSecurity(
        securedEnabled = true)
public class Security2Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Security2Application.class, args);

        ActionBean actionBean = (ActionBean)context.getBean("actionBean");
        LoginBean loginBean = (LoginBean)context.getBean("loginBean");

        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(MyAuth.getInstance());

        actionBean.doAction();
        loginBean.login("admin","adminadmin1");


    }

}
