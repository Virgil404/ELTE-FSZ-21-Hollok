/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.application.service;

import com.autoszalon.auto.application.domains.Shopbalance;
import com.autoszalon.auto.application.repositorys.ShopbalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zacco
 */
@Service
public class Shopbalanceservice {
    
    @Autowired
    public ShopbalanceRepository shopbalrep;
    public Shopbalance createshopbalance(float amount){
       Shopbalance shopbalance =new Shopbalance();
       shopbalance.setShopbalance(amount);
       
       return shopbalance;
    }
    
    public void insertshopbalance(float amount){
    
    Shopbalance newshopbalance=createshopbalance(amount);
    shopbalrep.save(newshopbalance);
    }
    /*
    public void increaseshopbalance(float amount){
        Shopbalance updatedshopbalance =  shopbalrep.findById(1);
        
        shopbalrep.save(udateshopbalance.setshopbalance(updatedshopbalance.getshopbalance+amount)
    }
*/
}
