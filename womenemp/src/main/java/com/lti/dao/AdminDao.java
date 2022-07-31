package com.lti.dao;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.User;

public interface AdminDao {
	
	boolean addAdmin(Admin admin);
	public List<Admin> fetchAll();
	Admin fetchUser(String userNameAdmin);
	boolean updateStatus(int regId);
	boolean deleteUser(int regId);
	

}
