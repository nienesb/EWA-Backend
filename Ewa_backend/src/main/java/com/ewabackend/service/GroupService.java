/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import com.ewabackend.entity.Group;
import java.util.List;

/**
 *
 * @author Milan
 */
public interface GroupService {

    Group findById(Integer id);

    Group findByName(String name);
    
    List findByYear(Integer year);
    
    void saveGroup(Group group);

    List findAllGroups();
}
