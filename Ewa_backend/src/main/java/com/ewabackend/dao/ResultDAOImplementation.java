/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.dao;

import com.ewabackend.entity.Result;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Milan
 */
@Repository("resultDao")
public class ResultDAOImplementation extends AbstractDAO<Integer, Result> implements ResultDAO {

    @Override
    public Result findById(int id) {
        Result result = (Result) getByKey(id);
        return result;
    }

    @Override
    public void saveResult(Result result) {
        persist(result);
    }

    @Override
    public List<Result> findAllResults() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Result> results = (List<Result>) criteria.list();
        return results;
    }

    @Override
    public List<Result> findResultByUser(Integer userId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("userId", userId));
        return (List<Result>) criteria.list();
    }
}
