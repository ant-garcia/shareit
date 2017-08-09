package com.shareit.service;

import java.util.List;

import com.shareit.model.User;

public interface UserService {
	
	public void add(User user);
	
	public void update(User user);
	
	public void remove(User user);
	
	public User get(String email);
	
	public User getByUsername(String username);
	
	public List<User> getAll();
}
