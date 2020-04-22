package com.example.web2;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class CustomScope implements Scope {
    Map<String, Map<Integer, Object>> storage = new HashMap<>();

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        Map<Integer, Object> beans = storage.get(s);
        if (beans== null){
            beans = new HashMap<>();
            storage.put(s,beans);
        }
        Integer x = 4;
        Object result = beans.get(x);
        if (result == null){
            result = objectFactory.getObject();
            beans.put(x,result);
        }
        return result;
    }

    @Override
    public Object remove(String s) {
        storage.remove(s);
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
