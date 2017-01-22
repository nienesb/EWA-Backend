/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.dao;

import com.ewabackend.entity.GroupHasSubject;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Milan
 */
@Repository("groupHasSubjectDAO")
public class GroupHasSubjectDAOImplementation extends AbstractDAO<Integer, GroupHasSubject> implements GroupHasSubjectDAO {

    @Override
    public GroupHasSubject findById(Integer id) {
        GroupHasSubject groupHasSubject = (GroupHasSubject) getByKey(id);
        return groupHasSubject;
    }

    @Override
    public Integer saveGroup(GroupHasSubject groupHasSubject) {
        persist(groupHasSubject);
        return groupHasSubject.getId();
    }

    @Override
    public List<GroupHasSubject> findAllGroupHasSubject() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<GroupHasSubject> results = (List<GroupHasSubject>) criteria.list();
        return results;
    }
    
}
