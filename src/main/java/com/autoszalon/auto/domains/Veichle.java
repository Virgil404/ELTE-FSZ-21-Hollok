/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.domains;

import java.util.List;

import javax.persistence.Entity;
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
 /*   private Package package;*/
    
    @OneToMany
    private List<Features> features;
    
}
