/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoszalon.auto.service;

import com.autoszalon.auto.domains.Carpackage;
import com.autoszalon.auto.domains.Veichle;
import com.autoszalon.auto.repositorys.Veichlerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nagy
 */
@Service
public class vehicleservice {
    @Autowired
    public Veichlerepository vehiclerepo;
    
    	public Iterable<Veichle> findAllVeichle() {
		return vehiclerepo.findAll();
	}
        public Iterable<Veichle> findAllBycarpackage(Carpackage carpackage){
            return (Iterable<Veichle>) vehiclerepo.findAllBycarpackage(carpackage);
        }
}
