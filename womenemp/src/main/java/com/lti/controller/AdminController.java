package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.beans.Step;
import com.lti.service.AdminService;

//{
//    "name":"Ajay CHoudhari",
//    "userNameAdmin":"Ajay",
//    "birthDate":"15Feb",
//    "password":"FyWorld69",
//    "mobileNumber":987654326
//}
@CrossOrigin
@RestController
@RequestMapping("/admin-api")

public class AdminController {

	@Autowired
	AdminService adminService;
	

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody Admin admin) {
		adminService.addAdmin(admin);
		return "Admin Record  Added Successfully!";
	}

	@RequestMapping(path = "/fetch", method = RequestMethod.GET)
	public List<Admin> fetchAll() {
		List<Admin> list = adminService.fetchEach();
		return list;
	}
	
	@RequestMapping(path = "/admin/{userNameAdmin}", method = RequestMethod.GET)
	public Admin fetch(@PathVariable("userNameAdmin") String userNameAdmin) {
		return adminService.fetchUser(userNameAdmin);
	}
	
	
	@PostMapping("/updateStatus/{ngoId}")
	public boolean updateemp1(@PathVariable("ngoId") int ngoId )
	{	
		return adminService.updateStatus(ngoId);
	}

	
}
