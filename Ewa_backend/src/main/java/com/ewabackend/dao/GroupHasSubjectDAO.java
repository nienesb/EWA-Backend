/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.dao;

import com.ewabackend.entity.GroupHasSubject;
import java.util.List;

/**
 *
 * @author Milan
 */
public interface GroupHasSubjectDAO {
    
    GroupHasSubject findById(Integer id);
    
    Integer saveGroup(GroupHasSubject groupHasSubject);

    List<GroupHasSubject> findAllGroupHasSubject();
}
