/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.dao;

import com.ewabackend.entity.Group;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Milan
 */

@Repository("groupDAO")
public class GroupDAOImplementation extends AbstractDAO<Integer, Group> implements GroupDAO{

    @Override
    public Group findById(Integer id) {
       Group group = (Group) getByKey(id);
       return group;
    }

    @Override
    public Group findByName(String name) {
        Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        criteria.add(Restrictions.eq("name", "ID2S01"));
        return (Group) criteria.uniqueResult();
    }

    @Override
    public List<Group> findByYear(Integer year) {
        Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        criteria.add(Restrictions.eq("year", year));
        return (List<Group>) (Group) criteria.list();
    }

    @Override
    public void saveGroup(Group group) {
      persist(group);
    }

    @Override
    public List<Group> findAllGroups() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("year"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Group> groups = (List<Group>) criteria.list();
        return groups;
    }
    
}
