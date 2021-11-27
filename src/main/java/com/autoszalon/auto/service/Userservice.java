/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.service;

import com.autoszalon.auto.domains.User;
import com.autoszalon.auto.repositorys.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zacco
 */
@Service
public class Userservice {
    
     @Autowired
    private Userrepository userrep;
     
          
private User createuser(String username, String Password){
    User user =new User() ;
    user.setPassword(Password);
    user.setUsername(username);

    return user;

}


public void insertuser(User user) throws Exception{

    if(userexist(user.getUsername())){
        throw new Exception("Username alredy exists");
    }
User newuser=user;
userrep.save(newuser);
}

/*
public boolean userexistwithusernameandpassword(String username, String Password){
        User user=userrep.findByusernameAndPassword(username, Password);
         return user.getID()>0;

}
*/
private boolean userexist(String username){
    
    User user =userrep.findByusername(username);
         return user!=null;
}

public void deleteuser(String username){
    
     userrep.deleteByusername(username);
}



}
