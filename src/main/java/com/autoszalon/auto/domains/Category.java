/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author zacco
 */
@Entity
public class Category extends Veichle{
    
    @Id
    @GeneratedValue
    private int ID;
    
    private String category;
    
}
