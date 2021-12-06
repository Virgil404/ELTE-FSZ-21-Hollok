/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.autoszalon.auto.application.Security;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 *
 * @author zacco
 */

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
  
     @Override
     protected void configure(HttpSecurity http) throws Exception{
         http
            .authorizeRequests()
                 
          .antMatchers("/views/index.jsp").permitAll()
          .antMatchers("/views/register.jsp").permitAll()
          .antMatchers("/h2-console/**").permitAll()
           .antMatchers("/views/css/login.css").permitAll()
           .antMatchers("/views/source/**").permitAll()
          .anyRequest().authenticated()
           .and()
                 .csrf().ignoringAntMatchers("/h2-console/**")
           .and()
                 .headers().frameOptions().sameOrigin()
           .and()
                .formLogin()
                 .loginPage("/login").permitAll()
                 .defaultSuccessUrl("/views/carlist.jsp", true)
          .and()
                 .logout().permitAll()
         .and().cors().and().csrf().disable();
         
     
     }
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("*"));
        configuration.setAllowedMethods(Arrays.asList("*"));
        configuration.setAllowedHeaders(Arrays.asList("*"));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder(12);
    }
    
}
