package com.ewabackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ewabackend.dao.UserDAO;
import com.ewabackend.entity.User;

/**
 *
 * @author Milan & Jimmy
 */
@Service("userService")
@Transactional
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserDAO dao;

    @Override
    public void deleteUserByStudentnr(String studentnr) {
        dao.deleteUserByStudentnr(studentnr);
    }

    @Override
    public User findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveUser(User user) {
        // TODO Auto-generated method stub
        dao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        // TODO Auto-generated method stub
        User entity = dao.findById(user.getId());
        if (entity != null) {
            entity.setFirstName(user.getFirstName());
            entity.setLastName(user.getLastName());
        }

    }

    @Override
    public List findAllUsers() {
        return dao.findAllUsers();
    }

    @Override
    public User findUserByStudentnr(Integer studentnr) {
        return dao.findUserByStudentnr(studentnr);
    }

    @Override
    public boolean isUserStudentnrUnique(Integer id, Integer studentnr) {
        User user = findUserByStudentnr(studentnr);
        return (user == null || ((id != null) && (user.getId() == id)));
    }

    @Override
    public User findUserByEmail(String email) {
      return dao.findUserByEmail(email);
    }

}
