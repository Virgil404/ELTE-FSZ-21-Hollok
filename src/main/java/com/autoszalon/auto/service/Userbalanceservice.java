/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.service;

import com.autoszalon.auto.domains.User;
import com.autoszalon.auto.domains.UserBalance;
import com.autoszalon.auto.repositorys.Userbalancerepository;
import com.autoszalon.auto.repositorys.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zacco
 */
@Service
public class Userbalanceservice {
    
    
    // lehet jobb otlet a Userservicbe mecsinalni a userbalance-t a userrel egyutt szoval ennek servicnek lehet nem sok ertelme van 
    // By Virgil
    @Autowired
    private Userbalancerepository ubalancerep;
    
    @Autowired
    private Userrepository userrep;
    
    private User finduser(String username){
    User user=userrep.findByusername(username);
    return user;
    }
    
    private UserBalance createuserbalance(String username,float amount){
        User user=finduser(username);
        UserBalance userbalance=new UserBalance();
        userbalance.setUserbalance(amount);
        userbalance.setUser(user);
        return userbalance;
      }
    
    public void insertuserbalance(String username,float amount){
        UserBalance newuserbalance =createuserbalance(username,amount);
        
        ubalancerep.save(newuserbalance);   
    }
            
          
    public void reductmoney(float amount,String username){
        User user = finduser(username);
        UserBalance updateduserbalance=ubalancerep.findByUser(user);
        updateduserbalance.setUserbalance(updateduserbalance.getUserbalance()-amount);
        ubalancerep.save(updateduserbalance);
    }
    
    public void deleteuserbalance(String username){
        User user=finduser(username);
        
           ubalancerep.deleteByUser(user);
    
    }
   
}
