/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.service;

import com.autoszalon.auto.domains.User;
import com.autoszalon.auto.domains.UserBalance;
import com.autoszalon.auto.domains.Veichle;
import com.autoszalon.auto.repositorys.Userbalancerepository;
import com.autoszalon.auto.repositorys.Userrepository;
import com.autoszalon.auto.repositorys.Veichlerepository;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author zacco
 */
@Component
public class Testdata {
    @Autowired
    private Userrepository userrep;
    
    @Autowired
    private Veichlerepository vehrep;
    
    @Autowired
    private Userbalancerepository ubalancerep;
    
     //@Autowired
  
     public void Createdata(){
         User Virgil =createuser("Virgil","titok");
         userrep.save(Virgil);
         UserBalance usernalance=createuserbalance(10000,Virgil);
         ubalancerep.save(usernalance);
         User Jani =createuser("Jani","jelszo123");
         userrep.save(Jani);
         UserBalance janibalance=createuserbalance(1000000,Jani);
         ubalancerep.save(janibalance);
       
         
         Veichle veichle=createveichle(2000);
         vehrep.save(veichle);
     
     
     
     }
     
     
     
     
private User createuser(String username, String Password){
    User user =new User() ;
    user.setPassword(Password);
    user.setUsername(username);

    return user;

}
    
private Veichle createveichle(int price){
Veichle veichle =new Veichle();
veichle.setPrice(price);
return veichle;
}

public UserBalance createuserbalance(float amount,User user){

UserBalance userbalance =new UserBalance();

userbalance.setUser(user);

userbalance.setUserbalance(amount);

return userbalance;
}

/*
private Features CreateFeature(){



}
*/

}
