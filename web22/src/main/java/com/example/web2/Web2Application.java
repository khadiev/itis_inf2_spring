package com.example.web2;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@SpringBootApplication
public class Web2Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Web2Application.class, args);
        MyBean2 myBean = (MyBean2)context.getBean("myBean2");
        myBean.setData("Hello");
        MyBean2 myBean1 = (MyBean2)context.getBean("myBean2");
        System.out.println("info*******************:  "+myBean1.data());
    }


}
