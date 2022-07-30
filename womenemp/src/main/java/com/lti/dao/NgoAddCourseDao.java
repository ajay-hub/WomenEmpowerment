package com.lti.dao;

import java.util.List;

import com.lti.beans.NgoCourse;

public interface NgoAddCourseDao {

	boolean add(NgoCourse ngoCourse);
	List<NgoCourse> fetchEach();
	NgoCourse fetchCourse(int courseId);
}
