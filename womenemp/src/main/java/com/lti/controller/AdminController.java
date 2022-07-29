package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.service.AdminService;


@CrossOrigin
@RestController
@RequestMapping("/admin-api")

public class AdminController {

	@Autowired
	AdminService adminService;
	

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody Admin admin) {
		adminService.add(admin);
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
}
