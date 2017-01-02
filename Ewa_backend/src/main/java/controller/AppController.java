/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 *
 * @author Milan
 */
@Controller
@RequestMapping("/")
@ComponentScan("service, entity, dao")
public class AppController {
    
    @Autowired
    UserService userService;
     
    @RequestMapping(value = "/user/{studentnr}", method = RequestMethod.GET, produces = "application/json")
    public User getUserInformation(@PathVariable String studentnr) {
 
        User user = new User();
        user.setEmail("Jimmy");
        return user;
    }
}
