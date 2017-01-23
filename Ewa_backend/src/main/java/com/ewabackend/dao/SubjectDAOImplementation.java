/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.dao;

import com.ewabackend.entity.Subject;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Milan
 */
@Repository("subjectDAO")
public class SubjectDAOImplementation extends AbstractDAO<Integer, Subject> implements SubjectDAO {

    @Override
    public Subject findById(int id) {
        Subject subject = (Subject) getByKey(id);
        return subject;
    }

    @Override
    public Integer saveSubject(Subject subject) {
        persist(subject);
        return subject.getId();
        
    }

    @Override
    public List<Subject> findAllSubjects() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Subject> subjects = (List<Subject>) criteria.list();
        return subjects;
    }

}
