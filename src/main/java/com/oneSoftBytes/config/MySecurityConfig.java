package com.oneSoftBytes.config;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity(debug = true) //this already has @Configuration.so no need to tell it
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    // this class is going to help to create the spring security filter chain
}
