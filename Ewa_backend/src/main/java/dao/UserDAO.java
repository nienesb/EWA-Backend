package dao;

import java.util.List;

import entity.User;

public interface UserDAO{

    User findById(int id);
	 
    void saveUser(User user);
     
    void deleteUserByStudentnr(String studentnr);
     
    List<User> findAllUsers();
 
    User findUserByStudentnr(String studentnr);
}

