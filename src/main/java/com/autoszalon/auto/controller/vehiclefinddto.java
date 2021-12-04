/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoszalon.auto.controller;

import com.autoszalon.auto.domains.Carpackage;
import com.autoszalon.auto.domains.Category;
import com.autoszalon.auto.domains.Categoryenum;

/**
 *
 * @author Nagy
 */
public class vehiclefinddto {
    private final float price;
    private final Carpackage carpackage;
    private final String color;
    private final int doors;
    private final Categoryenum category;
    private final boolean Allwheels;

    public vehiclefinddto(float price, Carpackage carpackage, Categoryenum category ,String color ,boolean Allwheels ,int doors) {
        this.price = price;
        this.carpackage = carpackage;
        this.color = color;
        this.doors = doors;
        this.category = category;
        this.Allwheels = Allwheels;
    }

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
