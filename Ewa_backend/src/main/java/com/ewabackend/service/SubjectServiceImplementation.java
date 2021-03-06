/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import com.ewabackend.dao.SubjectDAO;
import com.ewabackend.entity.Subject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milan
 */
@Service("subjectService")
@Transactional
public class SubjectServiceImplementation implements SubjectService{

    @Autowired
    SubjectDAO dao;
    
    @Override
    public Subject findById(int id) {
        return dao.findById(id);
    }

    @Override
    public Integer saveSubject(Subject subject) {
        return dao.saveSubject(subject);
    }

    @Override
    public List findAllSubjects() {
        return dao.findAllSubjects();
    }

    @Override
    public List<Subject> findSubjectsForUser(Integer userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
