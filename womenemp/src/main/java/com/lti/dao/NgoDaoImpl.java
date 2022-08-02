package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.beans.Ngo;
import com.lti.beans.NgoCourse;

@Repository
public class NgoDaoImpl implements NgoDao {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Ngo> fetchAll() {
		Query q = entityManager.createQuery("select obj from Ngo as obj");
		return q.getResultList();
	}

	@Override
	@Transactional
	public boolean addNgo(Ngo user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
		return true;
	}

	@Override
	public Ngo fetchNgo(String username) {
		// TODO Auto-generated method stub
		return entityManager.find(Ngo.class,username);
	}

	@Override
	public Ngo findByUserId(String username) {
		// TODO Auto-generated method stub
		return entityManager.find(Ngo.class,username);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<NgoCourse> fetchAllByStatus() {
		// TODO Auto-generated method stub
		Query q = entityManager.createQuery("select obj from NgoCourse as obj where obj.status=:true");
		q.setParameter("true", true);
		return q.getResultList();
	}
}
