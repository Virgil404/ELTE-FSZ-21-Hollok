/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author zacco
 */
@Controller
public class redirecttoregistercontroller {
  @GetMapping("/")
  public String home(Model model) {
		return "redirect:register";

	}
    
}
