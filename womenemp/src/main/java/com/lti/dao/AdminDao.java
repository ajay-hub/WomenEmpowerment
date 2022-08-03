package com.lti.dao;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.NgoCourse;
import com.lti.beans.Step;
import com.lti.beans.User;

public interface AdminDao {
	
	boolean addAdmin(Admin admin);
	public List<Admin> fetchAll();
	Admin fetchUser(String userNameAdmin);
	boolean updateStatus(int regId);
	boolean deleteUser(int regId);
	boolean deleteCourse(int courseId);
	boolean updateCourseStatus(int courseId);
	Admin findByUserId(String username);
	NgoCourse fetchUserById(int regId);
	boolean updateStepStatus(int regId);
	

}
