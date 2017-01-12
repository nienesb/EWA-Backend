/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.dao;

import com.ewabackend.entity.SubjectPart;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Milan
 */
@Repository("subjectPartDAO")
public class SubjectPartDAOImplementation extends AbstractDAO<Integer, SubjectPart> implements SubjectPartDAO {

    @Override
    public SubjectPart findById(int id) {
           SubjectPart subjectPart = (SubjectPart) getByKey(id);
        return subjectPart;
    }

    @Override
    public void saveSubjectPart(SubjectPart subjectPart) {
        persist(subjectPart);
    }

    @Override
    public List<SubjectPart> findAllSubjectParts() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<SubjectPart> subjects = (List<SubjectPart>) criteria.list();
        return subjects;
    }
    
}
