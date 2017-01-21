/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.service;

import java.util.List;

import com.ewabackend.entity.Result;

/**
 *
 * @author Milan
 */

public interface ResultService {

    Result findById(int id);

    void saveResult(Result result);

    void updateResult(Result result);

    List findAllResults();

    List<Result> findResultsForUser(Integer userId);
    
    List<Result> findResultsForUserWithBlock(Integer userId, Integer year, Integer blockId);
    
    Result findResultForUser(Integer userId, Integer subjectPart);

    List<Result> findResultsForUserWithYear(Integer id, Integer year);

}
