package com.example.web2;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        ((servletRequest).).toString().split("/")
//        int idValue = Integer.parseInt(id);
//        System.out.println("idValue:" + idValue);
//        if (idValue>10) {
//            System.out.println("idValue>10" );
        StringBuilder sb = new StringBuilder();
        sb.append("servletRequest.getParameter(s)").append(servletRequest.getParameter("s"));
        System.out.println(sb);
        if ("Hello world".equals(servletRequest.getParameter("s"))){
            System.out.println(" hello" );
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else {
            System.out.println("No hello" );
            throw new RuntimeException("No hello world");
        }
//        StringBuilder sb = new StringBuilder();
//        while (servletRequest.getAttributeNames().hasMoreElements()){
//            sb.append(servletRequest.getAttributeNames().nextElement()+", ");
//        }
//        Map atrib = (HashMap)servletRequest.getAttribute("org.springframework.web.servlet.View.pathVariables");
//        Integer id = (Integer)  atrib.get("id");
//        System.out.println("servletRequest.getAttribute(id):" + id);
//        String name = servletRequest.getAttributeNames().nextElement();
//        System.out.println("name: "+name);
//         atrib = (HashMap)servletRequest.getAttribute(name);
//        System.out.println("class name:" + atrib.getClass().getName());
//        System.out.println("id class:" + atrib.get("id").getClass());

       // System.out.println("servletRequest.getAttributeNames():" + servletRequest.getAttribute(servletRequest.getAttributeNames().nextElement()));
    }
}
