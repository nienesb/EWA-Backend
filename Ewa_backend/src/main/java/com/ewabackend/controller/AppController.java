/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.controller;

import com.ewabackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ewabackend.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Milan
 */
@RestController
@ComponentScan("com.ewabackend.service")
public class AppController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping("/users")
    public User getUser() {

       User user = new User();
       user.setEmail("Jimmy");
       user.setFirstName("Jimmster");
       user.setStudentNumber(5923);
       return user;
    }
     
}
