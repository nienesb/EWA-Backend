/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jimmy
 */
@Controller
public class helloWorldController {

    @GetMapping("")

    public String hello(Model model) {

        model.addAttribute("message", "Welcome to Spring");

        return "welcome";
    }
}
