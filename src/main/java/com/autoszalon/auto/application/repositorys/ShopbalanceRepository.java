/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.application.repositorys;

import com.autoszalon.auto.application.domains.Shopbalance;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author zacco
 */
public interface ShopbalanceRepository  extends CrudRepository<Shopbalance,Integer>{
    
}
