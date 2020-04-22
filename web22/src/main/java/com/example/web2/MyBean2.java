package com.example.web2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MyBean2 {
    @Autowired
    MyBean myBean;

    public String data(){
        return myBean.field;
    }
    public void setData(String s){
        myBean.field = s;
    }
}
