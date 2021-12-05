/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.autoszalon.auto.application.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author zacco
 */

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
   /* 
    @Override
     protected void configure(AuthenticationManagerBuilder auth) throws Exception{
          PasswordEncoder encoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
    
        auth
            .inMemoryAuthentication()
            .withUser("user")
            .password(encoder.encode("password"))
               
     }
    */
    
    
     
     @Override
     protected void configure(HttpSecurity http) throws Exception{
         http
          .authorizeRequests()
          .antMatchers("/index/**").permitAll()
          .antMatchers("/register/**").permitAll()
          .antMatchers("/h2-console/**").permitAll()
           .antMatchers("/views/css/**").permitAll()
           .antMatchers("/views/source/**").permitAll()
          .anyRequest().authenticated()
           .and()
                .csrf().ignoringAntMatchers("/h2-console/**")
           .and()
                 .headers().frameOptions().sameOrigin()
           .and()
                .formLogin()
                 .loginPage("/login").permitAll()
          .and()
                 .logout().permitAll();
         
     
     }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder(12);
    }
    
}
