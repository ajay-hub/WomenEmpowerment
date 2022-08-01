package com.lti.dao;

import java.util.List;

import com.lti.beans.User;

public interface UserDao {

	boolean addUser(User user);
	public List<User> fetchAll();
	public User fetchUser(String username);
	public User findByUserId(String username);
}
