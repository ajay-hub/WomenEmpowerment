package com.lti.service;

import java.util.List;

import com.lti.beans.NgoCourse;

public interface NgoAddCourseService {

	boolean add(NgoCourse ngoCourse);
	List<NgoCourse> fetchEach();
	NgoCourse fetchCourse(int courseId);
}
