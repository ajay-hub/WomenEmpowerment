package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.beans.Ngo;

@Repository
public class NgoDaoImpl implements NgoDao {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public boolean addNGO(Ngo user) {
		entityManager.persist(user);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Ngo> fetchAll() {
		Query q = entityManager.createQuery("select obj from NGO as obj");
		return q.getResultList();
	}

	@Override
	public Ngo fetchNGO(String username) {
		// TODO Auto-generated method stub
		return entityManager.find(Ngo.class,username);
	}
}
