/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import com.ewabackend.entity.SubjectPart;
import java.util.List;

/**
 *
 * @author Milan
 */
public interface SubjectPartService {
    SubjectPart findById(int id);

    Integer saveSubjectPart(SubjectPart subjectPart);

    List findAllSubjectParts();
}
