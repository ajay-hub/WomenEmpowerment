package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Step;

@Repository
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
	public boolean addStep(Step step) {
		// TODO Auto-generated method stub
		entityManager.persist(step);
		return true;
	}

	@Override
	public Step fetchStep(int stepRegId) {
		// TODO Auto-generated method stub
		return entityManager.find(Step.class,stepRegId);
	}
}
