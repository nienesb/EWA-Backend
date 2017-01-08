/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.controller;

import com.ewabackend.entity.Result;
import com.ewabackend.entity.Subject;
import com.ewabackend.entity.SubjectPart;
import com.ewabackend.entity.User;
import com.ewabackend.service.ResultService;
import com.ewabackend.service.SubjectPartService;
import com.ewabackend.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ewabackend.service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Milan
 */
@RestController
@ComponentScan("com.ewabackend.service")
@CrossOrigin
public class AppController {

    
    @Autowired
    UserService userService;

    @Autowired
    ResultService resultService;

    @Autowired
    SubjectService subjectService;

    @Autowired
    SubjectPartService subjectPartService;

    
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

    @RequestMapping("/user")
    public User getUserByEmail(@RequestParam("email") String email) {
        User user = userService.findUserByEmail(email);
        return user;
    }

    @RequestMapping("/results/{studentnr}")
    public List<Result> getResultsByStudentnr(@PathVariable Integer studentnr) {
        User user = userService.findUserByStudentnr(studentnr);
        if (user == null) {
            return null;
        }
        List<Result> results = resultService.findResultsForUser(user.getId());
        return results;
    }

    @RequestMapping("/result/{studentnr}/{subjectPartId}")
    public Result getResultsForSubjectByStudentnr(@PathVariable("studentnr") Integer studentnr, @PathVariable("subjectPartId") Integer subjectPartId) {
        User user = userService.findUserByStudentnr(studentnr);
        if (user == null) {
            return null;
        }
        Result result = resultService.findResultForUser(user.getId(), subjectPartId);
        return result;
    }

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects() {
        List<Subject> subjects = subjectService.findAllSubjects();
        return subjects;
    }

    @RequestMapping("/subjectparts")
    public List<SubjectPart> getAllSubjectParts() {
        List<SubjectPart> subjectParts = subjectPartService.findAllSubjectParts();
        return subjectParts;
    }

}
