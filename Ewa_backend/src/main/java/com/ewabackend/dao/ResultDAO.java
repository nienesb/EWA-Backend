package com.ewabackend.dao;

import com.ewabackend.entity.Result;

import java.util.List;

/**
 *
 * @author Milan
 */
public interface ResultDAO {
    Result findById(int id);
	 
    void saveResult(Result result);
     
    List<Result> findAllResults();
 
    List<Result> findResultByUser(Integer userId);
}
