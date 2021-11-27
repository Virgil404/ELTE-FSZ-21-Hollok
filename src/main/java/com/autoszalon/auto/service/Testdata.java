/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.service;

import com.autoszalon.auto.domains.Carfeauters;
import com.autoszalon.auto.domains.Carpackage;
import com.autoszalon.auto.domains.Categoryenum;
import com.autoszalon.auto.domains.User;
import com.autoszalon.auto.domains.UserBalance;
import com.autoszalon.auto.domains.Veichle;
import com.autoszalon.auto.repositorys.CarfeautersRepository;
import com.autoszalon.auto.repositorys.Userbalancerepository;
import com.autoszalon.auto.repositorys.Userrepository;
import com.autoszalon.auto.repositorys.Veichlerepository;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import java.util.List;
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
    
    @Autowired
    private CarfeautersRepository carfeauterrep;
    
    
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
       
         Carfeauters carfeatures=createCarfeatures("green",4,true);
         carfeauterrep.save(carfeatures);
         
         Veichle veichle=createveichle(2000, carfeatures, Carpackage.GOLD, Categoryenum.SEDAN  );
         vehrep.save(veichle);
         
         Carfeauters carfeatures2=createCarfeatures("red",2,false);
         carfeauterrep.save(carfeatures2);
         
         Veichle veichle2=createveichle(2000, carfeatures2, Carpackage.PLATINUM, Categoryenum.SUV  );
         vehrep.save(veichle2);
         
         Carfeauters carfeatures3=createCarfeatures("blue",5,true);
         carfeauterrep.save(carfeatures3);
         
         Veichle veichle3=createveichle(2000, carfeatures3, Carpackage.STANDARD, Categoryenum.PICKUP  );
         vehrep.save(veichle3);
         
         Carfeauters carfeatures4=createCarfeatures("purple",3,false);
         carfeauterrep.save(carfeatures4);
         
         Veichle veichle4=createveichle(2000, carfeatures4, Carpackage.GOLD, Categoryenum.SPORT  );
         vehrep.save(veichle4);
    
     }
     
     
     
     
private User createuser(String username, String Password){
    User user =new User() ;
    user.setPassword(Password);
    user.setUsername(username);

    return user;

}
    
private Veichle createveichle(int price, Carfeauters features, Carpackage carpackage,Categoryenum category){
Veichle veichle =new Veichle();
veichle.setPrice(price);
veichle.setCarpackage(carpackage);
veichle.setFeatures(features);
veichle.setCategory(category);
return veichle;
}

private Carfeauters createCarfeatures(String color, int doors, boolean allwheel) {
    Carfeauters carfeauters =new Carfeauters();
    carfeauters.setColor(color);
    carfeauters.setDoors(doors);
    carfeauters.setAllwheel(allwheel);
    return carfeauters;
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

