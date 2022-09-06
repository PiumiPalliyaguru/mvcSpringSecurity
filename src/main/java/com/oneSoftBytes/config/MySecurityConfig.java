package com.oneSoftBytes.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true) //this already has @Configuration.so no need to tell it
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    // this class is going to help to create the spring security filter chain

    @Autowired
    private PasswordEncoder bcryptPasswordEncoder;

    // Create user
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("piumi")
                .password("$2a$12$lyd.j5aptzBjq63hEW6bKuabAcoHjzwltxzNfLgq4sS2OU9Bp4KQW") // .password("{bcrypt}$2a$12$lyd.j5aptzBjq63hEW6bKuabAcoHjzwltxzNfLgq4sS2OU9Bp4KQW")
                .roles("admin");

        System.out.println(bcryptPasswordEncoder.encode("abcd123"));
    }


}
