package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.NgoCourse;
import com.lti.dao.NgoAddCourseDao;

@Service
public class NgoAddCourseServiceImpl implements NgoAddCourseService {

	@Autowired
	NgoAddCourseDao NgoAddCourseDao;

	public boolean add(NgoCourse ngoCourse) {
		System.out.println("NGO service add");
		NgoAddCourseDao.add(ngoCourse);
		return true;
	}

	@Override
	public List<NgoCourse> fetchEach() {
		// TODO Auto-generated method stub
		return NgoAddCourseDao.fetchEach();
	}

	@Override
	public NgoCourse fetchCourse(int courseId) {
		// TODO Auto-generated method stub
		return NgoAddCourseDao.fetchCourse(courseId);
	}



}
