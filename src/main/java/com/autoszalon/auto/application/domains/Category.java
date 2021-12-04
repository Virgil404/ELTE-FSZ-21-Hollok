/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoszalon.auto.application.domains;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Nagy
 */
@Entity
public class Category {
    @Id
    @GeneratedValue
    int ID;
    @Enumerated(EnumType.STRING)
    Categoryenum category;

    public int getID() {
        return ID;
    }

    public Categoryenum getCategory() {
        return category;
    }

    public void setCategory(Categoryenum category) {
        this.category = category;
    }
    
}
