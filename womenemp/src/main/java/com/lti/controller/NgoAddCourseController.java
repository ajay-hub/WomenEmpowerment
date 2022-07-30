package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Ngo;
import com.lti.beans.NgoCourse;
import com.lti.beans.User;
import com.lti.service.NgoAddCourseService;
import com.lti.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/ngoCourse-api")
public class NgoAddCourseController {

	@Autowired
	NgoAddCourseService ngoAddCourseService;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody NgoCourse course) {
		ngoAddCourseService.add(course);
		return "Ngo Added Successfully!";
	}

	@RequestMapping(path = "/fetch", method = RequestMethod.GET)
	public List<NgoCourse> fetchAll() {
		List<NgoCourse> list = ngoAddCourseService.fetchEach();
		return list;
	}
	
	@RequestMapping(path = "/fetch/{courseId}", method = RequestMethod.GET)
	public NgoCourse fetch(@PathVariable("courseId") int courseId) {
		return ngoAddCourseService.fetchCourse(courseId);
	}
}
