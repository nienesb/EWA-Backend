/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import com.ewabackend.dao.GroupHasSubjectDAO;
import com.ewabackend.entity.GroupHasSubject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milan
 */
@Service("groupHasSubjectService")
@Transactional
public class GroupHasSubjectServiceImplementation implements GroupHasSubjectService{
    @Autowired
    GroupHasSubjectDAO dao;
    
    @Override
    public GroupHasSubject findById(Integer id) {
      return dao.findById(id);
    }

    @Override
    public Integer saveGroup(GroupHasSubject groupHasSubject) {
       return dao.saveGroup(groupHasSubject);
    }

    @Override
    public List<GroupHasSubject> findAllGroupHasSubject() {
       return dao.findAllGroupHasSubject();
    }
    
}
