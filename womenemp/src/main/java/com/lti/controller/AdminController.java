package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.service.AdminService;

//{
//    "name":"Ajay CHoudhari",
//    "userNameAdmin":"Ajay",
//    "birthDate":"15Feb",
//    "password":"FyWorld69",
//    "mobileNumber":987654326
//}
@CrossOrigin()
@RestController
@RequestMapping("/admin-api")

public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody Admin adminData){
		System.out.println(adminData);
		Admin admin = adminService.findByUserId(adminData.getUserNameAdmin());
		if(admin.getPassword().equals(adminData.getPassword()))
			return ResponseEntity.ok(admin);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}

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
	
	
	@PostMapping("/updateStatus/{regId}")
	public boolean updateStatus(@PathVariable("regId")int regId )
	{	
		return adminService.updateStatus(regId);
	}

	@DeleteMapping(value = "/deleteUser/{regId}")
	public boolean deleteUser(@PathVariable("regId")int regId)  
	{	
		return adminService.deleteUser(regId);
	
	}
	
	@DeleteMapping(value = "/deleteCourse/{courseId}")
	public boolean deleteCourse(@PathVariable("courseId")int courseId)  
	{	
		return adminService.deleteCourse(courseId);
	
	}
	
	@GetMapping("/updateCourseStatus/{courseId}")
	public boolean updateCourseStatus(@PathVariable("courseId")int courseId )
	{	
		return adminService.updateCourseStatus(courseId);
	}
	
	@GetMapping("/updateStepStatus/{regId}")
	public boolean updateStepStatus(@PathVariable("regId")int regId )
	{	
		return adminService.updateStepStatus(regId);
	}
}
