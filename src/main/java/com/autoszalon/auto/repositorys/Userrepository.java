/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.repositorys;

import com.autoszalon.auto.domains.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author zacco
 */
public interface Userrepository extends CrudRepository<User,Integer> {
        
        User findByusername(String username);
       // User findByusernameAndPassword(String username,String Password);
        User deleteByusername(String username);
        
        User existsByusername(String username);
        
}
