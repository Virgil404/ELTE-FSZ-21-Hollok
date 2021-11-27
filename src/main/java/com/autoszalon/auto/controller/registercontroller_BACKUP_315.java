/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoszalon.auto.controller;
import com.autoszalon.auto.domains.User;
import com.autoszalon.auto.service.Userservice;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
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
<<<<<<< HEAD
public class RegisterController {
 @Autowired 
    private Userservice userservice;
 @PostMapping("adduser")
    public String adduser(Adduserdto adduserdto ){
         User user =new User();
         user.setUsername(adduserdto.getUsername());
         user.setPassword(adduserdto.getPassword());
     try {
         userservice.insertuser(user);
     } catch (Exception ex) {
         Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
     }
    return "redirect:index";
    }
=======
public class registercontroller {
>>>>>>> 5fbe91e8e665b575efeeb72a40917680bc81a340
 
}

