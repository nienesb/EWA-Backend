/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.controller;

import com.ewabackend.entity.Result;
import com.ewabackend.entity.User;
import com.ewabackend.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ewabackend.service.UserService;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.List;
import javax.ws.rs.PathParam;
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
    
    @Autowired
    ResultService resultService;
    
    @RequestMapping("/users")
    public List<User> getUsers() {
       List<User> users = userService.findAllUsers();
       return users;
    }
    
    @RequestMapping("/user/{studentnr}")
    public User getUserByStudentnr(@PathVariable Integer studentnr) {
        User user = userService.findUserByStudentnr(studentnr);
        return user;
    }
    
    @RequestMapping("results/{studentnr}")
    public List<Result> getResultsByStudentnr(@PathVariable Integer studentnr) {
       User user = userService.findUserByStudentnr(studentnr);
       List<Result> results = resultService.findResultsForUser(user.getId());
       return results;
    }
    
    @RequestMapping("test/{id}")
    public String test(@PathVariable Integer id) {
       if(id != null) {
           return "Yes";
       }
       else return "Null";
    }
     
}
