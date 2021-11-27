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
 public class Carfeauters {
    
    @Id
    @GeneratedValue
    private int ID;
    private String Color;
    private int Doors;
    private boolean Allwheel;
    
    @OneToOne
    private Veichle veichle;

    public int getID() {
        return ID;
    }

    public String getColor() {
        return Color;
    }

    public int getDoors() {
        return Doors;
    }

    public boolean isAllwheel() {
        return Allwheel;
    }

    public Veichle getVeichle() {
        return veichle;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setDoors(int Doors) {
        this.Doors = Doors;
    }

    public void setAllwheel(boolean Allwheel) {
        this.Allwheel = Allwheel;
    }

    public void setVeichle(Veichle veichle) {
        this.veichle = veichle;
    }
    
    
    
    
}
