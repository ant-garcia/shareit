package com.shareit.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.shareit.dao.UserDao;
import com.shareit.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void persist(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);
	}

	@Override
	public void update(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
	}

	@Override
	public void delete(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);
	}

	@Override
	public User get(String email) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.load(User.class, email);
		
		return user;
	}

	@Override
	public User getByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.load(User.class, username);
		
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		Session session = sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		
		return userList;
	}
}