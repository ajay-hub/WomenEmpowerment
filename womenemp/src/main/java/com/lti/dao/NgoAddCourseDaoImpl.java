package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.beans.NgoCourse;

@Repository
public class NgoAddCourseDaoImpl implements NgoAddCourseDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public boolean add(NgoCourse ngoCourse) {
		// TODO Auto-generated method stub
		entityManager.persist(ngoCourse);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NgoCourse> fetchEach() {
		// TODO Auto-generated method stub
		Query q = entityManager.createQuery("select obj from NgoCourse as obj");
		return q.getResultList();
	}


	@Override
	public NgoCourse fetchCourse(int courseId) {
		// TODO Auto-generated method stub
		return entityManager.find(NgoCourse.class,courseId);
	}

}
