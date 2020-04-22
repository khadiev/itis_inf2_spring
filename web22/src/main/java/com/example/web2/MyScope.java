package com.example.web2;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class MyScope implements Scope {
    Map<String, Object> storage = new HashMap<>();
    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        return storage.get(s);
    }

    @Override
    public Object remove(String s) {
        return storage.remove(s);
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
        return "myscope";
    }
}
