package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.User;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public void addUser(User user) {
		entityManager.persist(user);
	}
	
}
