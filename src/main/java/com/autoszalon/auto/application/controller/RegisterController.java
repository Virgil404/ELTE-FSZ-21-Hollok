/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.application.controller;
import com.autoszalon.auto.application.domains.User;
import com.autoszalon.auto.application.service.Userbalanceservice;
import com.autoszalon.auto.application.service.Userservice;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author zacco
 */
@Controller
public class RegisterController {
 @Autowired 
    private Userservice userservice;
 @Autowired
    private Userbalanceservice ubalaservice;
 @Autowired
 private PasswordEncoder passwordencoder;
 
 @PostMapping("adduser")
    public String adduser(Adduserdto adduserdto ){
         User user =new User();
         user.setUsername(adduserdto.getUsername());
         user.setPassword(passwordencoder.encode(adduserdto.getPassword()));
         
     try {
        
         userservice.insertuser(user);
         ubalaservice.insertuserbalance(user, 10000);
     } catch (Exception ex) {
         Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
         return "/views/register.jsp";
     }
    return "redirect:/views/login.jsp";
    }


 
}

