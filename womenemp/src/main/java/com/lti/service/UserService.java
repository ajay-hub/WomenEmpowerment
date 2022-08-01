package com.lti.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.beans.User;

public interface UserService{

	public boolean add(User user);
	public List<User> fetchEach();
	public User fetchUser(String username);
	public User findByUserId(String username);
}
