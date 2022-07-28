package com.lti.service;

import java.util.List;

import com.lti.beans.User;

public interface UserService {

	public boolean add(User user);
	public List<User> fetchEach();
	public User fetchUser(String username);
}
