/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.application.repositorys;

import com.autoszalon.auto.application.domains.User;
import com.autoszalon.auto.application.domains.UserBalance;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author zacco
 */
public interface Userbalancerepository extends CrudRepository<UserBalance,Integer> {
    
    UserBalance findByUser(User user);
    UserBalance deleteByUser(User user);
    
    @Query(value = "SELECT USERBALANCE FROM USER_BALANCE INNER JOIN USER ON USER_BALANCE.USER_ID = USER.ID WHERE USERNAME =:username", nativeQuery=true)
    float finduserbalancebyusername(@Param ("username") String username);
}
