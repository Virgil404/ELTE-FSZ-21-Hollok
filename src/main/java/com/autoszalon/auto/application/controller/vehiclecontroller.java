/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autoszalon.auto.application.controller;

import com.autoszalon.auto.application.domains.User;
import com.autoszalon.auto.application.service.vehicleservice;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Nagy
 */
@Controller
public class vehiclecontroller {
    
    @Autowired
    
    private vehicleservice vehicleservice;
    
   // @GetMapping("order")
    /*
    public String listVehicle(Model jarmumodel){
        List<vehiclefinddto> carlist = new ArrayList<>();
        
        vehicleservice.findAllVeichle().forEach(h 
				-> carlist.add(new vehiclefinddto(h.getPrice(), h.getCarpackage(), h.getCategory(), h.isAllwheels()));
        )
      jarmumodel.addAttribute("order", carlist);
     
      return "order";
      }
    @PostMapping("orderfilter")
    public String vehichle(vehichledtotemp vehichledto ){
        vehicleservice.transfertovehichlefinddto(vehichledto);
        
    return "order";
    }
    
*/
}
