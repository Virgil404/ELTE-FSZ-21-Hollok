/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoszalon.auto.controller;

import com.autoszalon.auto.service.vehicleservice;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Nagy
 */
@Controller
public class vehiclecontroller {
    
    @Autowired
    
    private vehicleservice vehicleservice;
    
    @GetMapping("order")
    public String listVehicle(Model jarmumodel){
        List<vehiclefinddto> carlist = new ArrayList<>();
        
        vehicleservice.findAllVeichle().forEach(h 
				-> carlist.add(new vehiclefinddto(h.getPrice(), h.getCarpackage(), h.getCategory())));
        
      jarmumodel.addAttribute("order", carlist);
      
      return "order";
    }
}
