/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.dao;

import com.ewabackend.entity.Group;
import java.util.List;

/**
 *
 * @author Milan
 */
public interface GroupDAO {
    
    Group findById(Integer id);

    Group findByName(String name);
    
    List<Group> findByYear(Integer year);
    
    void saveGroup(Group group);

    List<Group> findAllGroups();
}
