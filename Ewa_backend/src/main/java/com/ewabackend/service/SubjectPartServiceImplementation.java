/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import com.ewabackend.dao.SubjectPartDAO;
import com.ewabackend.entity.SubjectPart;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milan
 */
@Transactional
@Service("subjectPartService")
public class SubjectPartServiceImplementation implements SubjectPartService {

    SubjectPartDAO dao;

    @Override
    public SubjectPart findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveSubjectPart(SubjectPart subjectPart) {
      dao.saveSubjectPart(subjectPart);
    }

    @Override
    public List findAllSubjectParts() {
        return dao.findAllSubjectParts();
    }

}
