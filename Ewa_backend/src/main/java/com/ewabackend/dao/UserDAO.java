package com.ewabackend.dao;

import java.util.List;

import com.ewabackend.entity.User;

public interface UserDAO{

    User findById(int id);
	 
    void saveUser(User user);
     
    void deleteUserByStudentnr(String studentnr);
     
    List<User> findAllUsers();
 
    User findUserByStudentnr(Integer studentnr);
    
    User findUserByEmail(String email);
}

