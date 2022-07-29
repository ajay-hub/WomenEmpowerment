package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Admin;
import com.lti.beans.User;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@PersistenceContext
	EntityManager entityManager;


	@Transactional
	public boolean addAdmin(Admin admin) {
		entityManager.persist(admin);
		return true;
	}
//	@Override
//	public List<Admin> fetchAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@Transactional
	public List<Admin> fetchAll() {
		Query q = entityManager.createQuery("select obj from Admin as obj");
		return q.getResultList();
	}

//	@Override
//	public User fetchAdmin(String userNameAdmin) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public User fetchAdmin(String userNameAdmin) {
		// TODO Auto-generated method stub
		return entityManager.find(User.class,userNameAdmin);
	}

	@Override
	public Admin fetchUser(String userNameAdmin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
