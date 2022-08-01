package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.User;
import com.lti.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public boolean add(User user) {
		System.out.println("User service add");
		userDao.addUser(user);
		return true;
	}

	@Override
	public List<User> fetchEach() {
		// TODO Auto-generated method stub
		return userDao.fetchAll();
	}

	@Override
	public User fetchUser(String username) {
		// TODO Auto-generated method stub
		return userDao.fetchUser(username);
	}

	@Override
	public User findByUserId(String username) {
		// TODO Auto-generated method stub
		return userDao.findByUserId(username);
	}
}
