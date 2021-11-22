/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.repositorys;

import com.autoszalon.auto.domains.User;
import com.autoszalon.auto.domains.UserBalance;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author zacco
 */
public interface Userbalancerepository extends CrudRepository<UserBalance,Integer> {
    
    UserBalance findByUser(User user);
    UserBalance deleteByUser(User user);
}
