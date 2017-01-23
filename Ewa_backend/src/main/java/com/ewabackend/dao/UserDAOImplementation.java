package com.ewabackend.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ewabackend.entity.User;
import org.hibernate.criterion.Order;

@Repository("userDao")
public class UserDAOImplementation extends AbstractDAO<Integer, User> implements UserDAO {

    @Override
    public void deleteUserByStudentnr(String studentnr) {
        Query query = getSession().createSQLQuery("delete from User where studentnr = :studentnr");
        query.setString("studentnr", studentnr);
        query.executeUpdate();
    }

    @Override
    public User findById(int id) {
        User user = (User) getByKey(id);
        return user;
    }

    @Override
    public void saveUser(User user) {
        persist(user);
    }

    @Override
    public List<User> findAllUsers() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<User> users = (List<User>) criteria.list();
        return users;
    }

    @Override
    public User findUserByStudentnr(Integer studentnr) {
        Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        criteria.add(Restrictions.eq("studentNumber", studentnr));
        return (User) criteria.uniqueResult();
    }

    @Override
    public User findUserByEmail(String email) {
        Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        criteria.add(Restrictions.eq("email", email));
        return (User) criteria.uniqueResult();
    }

    @Override
    public List<User> findTeachers() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        criteria.add(Restrictions.eq("userRoleId", 2));
        List<User> users = (List<User>) criteria.list();
        return users;
    }
    
    
}
