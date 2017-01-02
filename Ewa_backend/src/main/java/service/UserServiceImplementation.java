package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDAO;
import entity.User;

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
        // TODO Auto-generated method stub
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
    public User findUserByStudentnr(String studentnr) {
        return dao.findUserByStudentnr(studentnr);
    }

    public boolean isUserStudentnrUnique(Integer id, String studentnr) {
        User user = findUserByStudentnr(studentnr);
        return (user == null || ((id != null) && (user.getId() == id)));
    }

}
