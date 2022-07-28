package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.User;
import com.lti.service.UserService;


@RestController
@RequestMapping("/user-api")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody User user) {
		userService.add(user);
		return "User Record  Added Successfully!";
	}

}
