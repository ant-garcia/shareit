package com.shareit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shareit.dao.UserDao;
import com.shareit.model.User;
import com.shareit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public void add(User user) {
		userDao.persist(user);
	}

	@Override
	@Transactional
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	@Transactional
	public void remove(User user) {
		userDao.delete(user);
	}

	@Override
	@Transactional
	public User get(String email) {
		return userDao.get(email);
	}

	@Override
	@Transactional
	public User getByUsername(String username) {
		return userDao.getByUsername(username);
	}

	@Override
	@Transactional
	public List<User> getAll() {
		return userDao.getAll();
	}
}