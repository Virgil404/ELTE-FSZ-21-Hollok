/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoszalon.auto.application.service;

import com.autoszalon.auto.application.controller.vehichledtotemp;
import com.autoszalon.auto.application.controller.vehiclefinddto;
import com.autoszalon.auto.application.domains.Carpackage;
import com.autoszalon.auto.application.domains.Veichle;
import com.autoszalon.auto.application.repositorys.Veichlerepository;
import java.util.ArrayList;
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
        public vehiclefinddto transfertovehichlefinddto(vehichledtotemp vehdtotemp){
            vehiclefinddto vfinddto = new vehiclefinddto(vehdtotemp.getDoors(),vehdtotemp.getCarpackage(), vehdtotemp.getCategory(), vehdtotemp.getColor(), vehdtotemp.isAllwheels(), (int) vehdtotemp.getPrice());
            return vfinddto;
        }
        public Iterable<Veichle> findAlLbycolor(String color) {
            return vehiclerepo.findcarsbycolor(color);
        }
      
            public Iterable<Veichle> findAlLbyall(boolean Allwheel, float price,int doors, String color) {
		return vehiclerepo.findcarsbyAll(Allwheel, price, doors, color);
	}
            
        }

