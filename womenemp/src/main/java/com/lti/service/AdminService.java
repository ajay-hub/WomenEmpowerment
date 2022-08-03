package com.lti.service;

import java.util.List;

import com.lti.beans.Admin;

public interface AdminService {
	
	public boolean addAdmin(Admin admin);
	public List<Admin> fetchEach();
	public Admin fetchUser(String userNameAdmin);
	public boolean updateStatus(int regId);
	public boolean deleteUser(int regId);
	boolean deleteCourse(int courseId);
	boolean updateCourseStatus(int courseId);
	public Admin findByUserId(String username);
	public boolean updateStepStatus(int regId);


}
