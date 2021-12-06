package com.autoszalon.auto.application.controller;


import com.autoszalon.auto.application.domains.Carpackage;
import com.autoszalon.auto.application.domains.Categoryenum;


/**
 *
 * @author Felhasználó
 */
public class vehichledtotemp {
    private float price;
    private Carpackage carpackage;
    private String color;
    private int doors;
    private Categoryenum category;
    private boolean Allwheels;

    public float getPrice() {
        return price;
    }

    public Carpackage getCarpackage() {
        return carpackage;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public Categoryenum getCategory() {
        return category;
    }

    public boolean isAllwheels() {
        return Allwheels;
    }
    
    
    
}
