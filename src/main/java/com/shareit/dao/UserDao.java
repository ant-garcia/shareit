package com.shareit.dao;

import java.util.List;

import com.shareit.model.User;

public interface UserDao {

	public void persist(User user);
	
	public void update(User user);
	
	public void delete(User user);
	
	public User get(String email);
	
	public User getByUsername(String username);
	
	public List<User> getAll();
}
