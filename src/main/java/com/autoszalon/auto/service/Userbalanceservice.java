/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.service;

import com.autoszalon.auto.domains.User;
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
    
    
    @Autowired
    private Userbalancerepository ubalancerep;
    
    @Autowired
    private Userrepository userrep;
    
    public void createuserbalance{
        Userbalance userbalance=new Userblance();
      }
    
    public void deleteuserbalance(String Username){
        User user=userrep.findByusername(Username);
        
           ubalancerep.deleteByUser(user);
    
    }
   
}
