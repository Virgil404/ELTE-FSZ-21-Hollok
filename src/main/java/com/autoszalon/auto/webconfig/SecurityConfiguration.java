/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.webconfig;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author zacco
 */
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    @Override
     protected void configure(AuthenticationManagerBuilder auth) throws Exception{
          PasswordEncoder encoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
    
        auth
            .inMemoryAuthentication()
            .withUser("user")
            .password(encoder.encode("password"))
            .roles("USER");
               
     }
    
     
     @Override
     protected void configure(HttpSecurity http) throws Exception{
         http
          .authorizeRequests()
          .antMatchers("/views/index").permitAll()
          .antMatchers("/views/register").permitAll()
          .antMatchers("/h2-console/").permitAll()
          .anyRequest().authenticated()
           .and()
           .formLogin()
                 .loginPage("/login")
                 .permitAll()
                 .and()
                 .logout()
                 .permitAll();
         
     
     }
    
    
    
}
