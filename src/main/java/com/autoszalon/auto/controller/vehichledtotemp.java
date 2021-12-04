package com.autoszalon.auto.controller;


import com.autoszalon.auto.domains.Carpackage;
import com.autoszalon.auto.domains.Categoryenum;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
