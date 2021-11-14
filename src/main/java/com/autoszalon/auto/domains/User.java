/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author zacco
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private int ID;
    @Column(unique=true)
    private String username;
    
    private String Password;
    @OneToOne
    private UserBalance userbalance;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setUserbalance(UserBalance userbalance) {
        this.userbalance = userbalance;
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return Password;
    }

    public UserBalance getUserbalance() {
        return userbalance;
    }
    
    
}
