package com.example.web2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecutiryConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.addFilterAfter(new CustomFilter(), FilterSecurityInterceptor.class);
//        http.addFilter(new CustomFilter());
        http.authorizeRequests().antMatchers("/greeting**").permitAll().anyRequest().anonymous();
        http.formLogin().loginPage("/login").permitAll();

    }
}
