package com.ewabackend.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ewabackend.entity.User;

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
		Criteria criteria = createEntityCriteria();
        return (List) criteria.list();
	}

	@Override
	public User findUserByStudentnr(String studentnr) {
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("studentnr", studentnr));
        return (User) criteria.uniqueResult();
	}
}

