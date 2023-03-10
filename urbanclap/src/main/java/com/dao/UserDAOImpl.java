package com.dao;

import java.util.List;

import com.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class UserDAOImpl implements UserDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(User p) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(p);
		logger.info("User saved successfully, User Details="+p);
		transaction.commit();
		session.close();
	}

	@Override
	public void updateUser(User p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, Person Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUsers() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<User> userList = session.createQuery("from User", User.class).list();
		transaction.commit();
		session.close();
		return userList;

	}

	@Override
	public User getUserByPhone(String phone) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = (User) session.createQuery("from User where phone =:phone ").setParameter("phone", phone).uniqueResult();
		logger.info("Person loaded successfully, Person details="+user);
		transaction.commit();
		session.close();
		return user;
	}




}
