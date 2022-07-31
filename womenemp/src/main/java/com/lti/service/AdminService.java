package com.lti.service;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.User;



public interface AdminService {
	
	public boolean addAdmin(Admin admin);
	public List<Admin> fetchEach();
	public Admin fetchUser(String userNameAdmin);
	public boolean updateStatus(int regId);
	public boolean deleteUser(int regId);
	


}
