package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.User;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public boolean addUser(User user) {
		entityManager.persist(user);
		return true;
	}
	
	@Transactional
	public List<User> fetchAll() {
		Query q = entityManager.createQuery("select obj from User as obj");
		return q.getResultList();
	}

	@Override
	public User fetchUser(String username) {
		// TODO Auto-generated method stub
		return entityManager.find(User.class,username);
	}
}
