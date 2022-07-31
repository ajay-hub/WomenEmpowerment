package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Admin;

import com.lti.dao.AdminDao;


@Service
public class AdminServiceImpl implements AdminService {
	
	
	@Autowired
	AdminDao adminDao;

	public boolean addAdmin(Admin admin) {
		System.out.println("Admin service add");
		adminDao.addAdmin(admin);
		return true;
	}

	@Override
	public List<Admin> fetchEach() {
		// TODO Auto-generated method stub
		return adminDao.fetchAll();
	}

	@Override
	public Admin fetchUser(String userNameAdmin) {
		// TODO Auto-generated method stub
		return adminDao.fetchUser(userNameAdmin);
	}

	@Override
	public boolean updateStatus(int ngoId ) {
		// TODO Auto-generated method stub
		return adminDao.updateStatus(ngoId);
	}


	
}
