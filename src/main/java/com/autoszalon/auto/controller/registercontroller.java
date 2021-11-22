/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author zacco
 */
@Controller
public class registercontroller {
    
     
    @GetMapping("/test")
    
    public String sanyi(){
        System.out.println("test is done ");
        return"test";
    }
}    

