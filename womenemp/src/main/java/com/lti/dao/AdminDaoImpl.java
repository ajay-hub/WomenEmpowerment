package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Admin;
import com.lti.beans.NgoCourse;
import com.lti.beans.Step;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@PersistenceContext
	EntityManager entityManager;


	@Transactional
	public boolean addAdmin(Admin admin) {
		entityManager.persist(admin);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Admin> fetchAll() {
		Query q = entityManager.createQuery("select obj from Admin as obj");
		return q.getResultList();
	}

	@Override
	@Transactional
	public Admin fetchUser(String userNameAdmin) {
		// TODO Auto-generated method stub
		return entityManager.find(Admin.class,userNameAdmin);
	}

	@Override
	@Transactional
	public boolean updateStatus(int regId) {
		Step s = entityManager.find(Step.class, regId);
		if (s != null) {
			s.setStatus(true);
			entityManager.merge(s);
			return true;
		}
		return false;
	}

	
	@Override
	@Transactional
	public boolean deleteUser(int regId) {
		Step s = entityManager.find(Step.class, regId);
		if (s != null) {
			entityManager.remove(s);
			return true;
		}
		return false;
	}
	
	@Override
	@Transactional
	public boolean updateCourseStatus(int courseId) {
		NgoCourse s = entityManager.find(NgoCourse.class, courseId);
		if (s != null) {
			s.setStatus(true);
			entityManager.merge(s);
			return true;
		}
		return false;
	}

	//FOR TEST PURPOSE ONLY 
	@Override
	@Transactional
	public NgoCourse fetchUserById(int courseId) {
		NgoCourse s = entityManager.find(NgoCourse.class, courseId);
		return s;
	}
	
	@Override
	@Transactional
	public boolean deleteCourse(int courseId) {
		NgoCourse s = entityManager.find(NgoCourse.class, courseId);
		if (s != null) {
			entityManager.remove(s);
			return true ;
		}
		return false;
	}

	@Override
	public Admin findByUserId(String username) {
		// TODO Auto-generated method stub
		return entityManager.find(Admin.class, username);
	}

	@Override
	@Transactional
	public boolean updateStepStatus(int regId) {
		// TODO Auto-generated method stub
		Step s = entityManager.find(Step.class, regId);
		if (s != null) {
			s.setStatus(true);
			entityManager.merge(s);
			return true;
		}
		return false;
	}
}
