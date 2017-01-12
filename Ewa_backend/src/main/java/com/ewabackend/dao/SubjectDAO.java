/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.dao;

import com.ewabackend.entity.Subject;
import java.util.List;

/**
 *
 * @author Milan
 */
public interface SubjectDAO {

    Subject findById(int id);
	 
    void saveSubject(Subject subject);
     
    List<Subject> findAllSubjects();

}
