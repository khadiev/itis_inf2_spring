package com.example.web2;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class CustomFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String s = servletRequest.getParameter("s");
        System.out.println("s: " + s);
//        if ("Hello world".equals(s)) {
            filterChain.doFilter(servletRequest, servletResponse);
//        }
    }
}
