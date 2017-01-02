/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;

import entity.User;

/**
 *
 * @author Milan
 */

public interface UserService {

    User findById(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserByStudentnr(String studentnr);

    List findAllUsers();

    User findUserByStudentnr(String studentnr);

    boolean isUserStudentnrUnique(Integer id, String studentnr);

}
