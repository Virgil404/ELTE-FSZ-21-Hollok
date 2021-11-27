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
import javax.persistence.OneToOne;


/**
 *
 * @author zacco
 */
@Entity
public class Veichle extends Category {
    
    @Id
    @GeneratedValue
    private int ID;
    private float price;

    public Carpackage getCarpackage() {
        return carpackage;
    }

    public Carfeauters getFeatures() {
        return features;
    }

    public void setFeatures(Carfeauters features) {
        this.features = features;
    }

    public void setCarpackage(Carpackage carpackage) {
        this.carpackage = carpackage;
    }
   
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
    
    @OneToOne
    private Carfeauters features;
    
}
