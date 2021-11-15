/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author zacco
 */
@Entity
public class UserBalance {
    @Id
    @GeneratedValue
    private int ID;
    
   private float userbalance;
   
    @OneToOne
   private User user;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUserbalance(float userbalance) {
        this.userbalance = userbalance;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getID() {
        return ID;
    }

    public float getUserbalance() {
        return userbalance;
    }

    public User getUser() {
        return user;
    }
   
}
