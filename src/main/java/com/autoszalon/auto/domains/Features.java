/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author zacco
 */
@Entity
class Features {
    
    @Id
    @GeneratedValue
    private int ID;
    private String Color;
    private int Doors;
    private boolean Allwheel;
    
    
    @ManyToOne
    private Veichle veichle;
    
    
    
    
}