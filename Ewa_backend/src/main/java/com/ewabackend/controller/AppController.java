/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.controller;

import com.ewabackend.entity.Group;
import com.ewabackend.entity.Result;
import com.ewabackend.entity.Subject;
import com.ewabackend.entity.SubjectPart;
import com.ewabackend.entity.User;
import com.ewabackend.service.GroupService;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @Autowired
    GroupService groupService;

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

    @RequestMapping("/results/{studentnr}/{year}/{block}")
    public List<Result> getResultsByStudentnrForBlock(@PathVariable("studentnr") Integer studentnr, @PathVariable("year") Integer year, @PathVariable("block") Integer block) {
        User user = userService.findUserByStudentnr(studentnr);
        if (user == null) {
            return null;
        }
        List<Result> results = resultService.findResultsForUserWithBlock(user.getId(),year, block);
        return results;
    }

     @RequestMapping("/results/{studentnr}/{year}")
    public List<Result> getResultsByStudentnrForYear(@PathVariable("studentnr") Integer studentnr, @PathVariable("year") Integer year) {
        User user = userService.findUserByStudentnr(studentnr);
        if (user == null) {
            return null;
        }
        List<Result> results = resultService.findResultsForUserWithYear(user.getId(),year);
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

    @RequestMapping("/schedule/{groupName}")
    public Group getGroupByName(@PathVariable String groupName) {
        Group group = groupService.findByName(groupName);
        return group;
    }

    @RequestMapping("/groups")
    public List<Group> getGroups() {
        return groupService.findAllGroups();
    }

    @RequestMapping(value="/admin/subject", method=RequestMethod.POST)
    public String createSubject(@RequestBody Subject subject) {
        subjectService.saveSubject(subject);
        return "Het is gelukt nigga";
    }
}
