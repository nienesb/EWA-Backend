/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import com.ewabackend.entity.Subject;
import java.util.List;

/**
 *
 * @author Milan
 */
public interface SubjectService {
    Subject findById(int id);

    Integer saveSubject(Subject subject);

    List findAllSubjects();

    List<Subject> findSubjectsForUser(Integer userId); 
}
