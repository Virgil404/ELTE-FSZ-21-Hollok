/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.application.service;

import com.autoszalon.auto.application.Security.ShopUserPrincipal;
import com.autoszalon.auto.application.domains.User;
import com.autoszalon.auto.application.repositorys.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author zacco
 */
@Service
public class CarshopUserDetailService implements UserDetailsService{
@Autowired
      private Userrepository userrep;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =userrep.findByusername(username);
    if(user==null)
    {
    
        throw new UsernameNotFoundException(username);
    
       }

        return new ShopUserPrincipal(user);
        }
    }
    

