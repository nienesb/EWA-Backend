/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import com.ewabackend.dao.ResultDAO;
import com.ewabackend.entity.Result;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milan
 */
@Service("resultService")
@Transactional
public class ResultServiceImplementation implements ResultService {

    @Autowired
    private ResultDAO dao;
    
    @Override
    public Result findById(int id) {
      return dao.findById(id);
    }

    @Override
    public void saveResult(Result result) {
        dao.saveResult(result);
    }

    @Override
    public void updateResult(Result result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List findAllResults() {
       return dao.findAllResults();
    }

    @Override
    public List<Result> findResultsForUser(Integer userId) {
        return dao.findResultByUser(userId);
    }
    
}
