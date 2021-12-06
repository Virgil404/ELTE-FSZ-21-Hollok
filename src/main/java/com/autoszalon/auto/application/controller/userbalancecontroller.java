/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.application.controller;

import com.autoszalon.auto.application.domains.UserBalance;
import com.autoszalon.auto.application.repositorys.Userbalancerepository;
import com.autoszalon.auto.application.service.Userbalanceservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author zacco
 */
@Controller
public class userbalancecontroller {
    
    @Autowired
    private Userbalancerepository userbalrep;
    @Autowired
    private Userbalanceservice userbalservice;
    @GetMapping("carlist")
    public String getloggedinuserBalance(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        if(currentPrincipalName==null){
        
        return"tamás";
        }
        float userbalance =userbalrep.finduserbalancebyusername(currentPrincipalName);
        
        model.addAttribute( "userbalance",userbalance);
    
     return"carlist";
        
    }
    
    
}
