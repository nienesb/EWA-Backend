/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import com.ewabackend.dao.GroupDAO;
import com.ewabackend.entity.Group;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milan
 */

@Service("groupService")
@Transactional
public class GroupServiceImplementation implements GroupService{
    GroupDAO dao;
    
    @Override
    public Group findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public Group findByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public List findByYear(Integer year) {
        return dao.findByYear(year);
    }

    @Override
    public void saveGroup(Group group) {
     dao.saveGroup(group);
    }

    @Override
    public List findAllGroups() {
       return dao.findAllGroups();
    }
    
}
