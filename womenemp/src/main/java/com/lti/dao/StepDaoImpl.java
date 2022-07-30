package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.lti.beans.Ngo;
import com.lti.beans.Step;

public class StepDaoImpl implements StepDao {

	@PersistenceContext
	EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Step> fetchAll() {
		Query q = entityManager.createQuery("select obj from Step as obj");
		return q.getResultList();
	}
	
	@Override
	@Transactional
	public boolean addStep(Ngo ) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
		return true;
	}
	
	
	
	
//	public boolean addStep(Step step) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public List<Step> fetchAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Step fetchStep(int ngoId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
