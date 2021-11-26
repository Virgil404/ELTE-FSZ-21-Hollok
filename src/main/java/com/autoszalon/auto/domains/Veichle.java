/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.domains;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author zacco
 */
@Entity
public class Veichle {
    
    @Id
    @GeneratedValue
    private int ID;
    private float price;
   
   
  @Enumerated(EnumType.STRING)
  private Carpackage carpackage;
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public float getPrice() {
        return price;
    }
    
    @OneToMany
    private List<Carfeauters> features;
    
}
