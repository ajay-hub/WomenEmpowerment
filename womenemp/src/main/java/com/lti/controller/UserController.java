package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.User;
import com.lti.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/user-api")

public class UserController {

	@Autowired
	UserService userService;
	

	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User userData){
		System.out.println(userData);
		User user = userService.findByUserId(userData.getUsername());
		if(user.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(user);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody User user) {
		userService.add(user);
		return "User Record  Added Successfully!";
	}

	@RequestMapping(path = "/fetch", method = RequestMethod.GET)
	public List<User> fetchAll() {
		List<User> list = userService.fetchEach();
		return list;
	}
	
	@RequestMapping(path = "/user/{username}", method = RequestMethod.GET)
	public User fetch(@PathVariable("username") String username) {
		return userService.fetchUser(username);
	}
}
