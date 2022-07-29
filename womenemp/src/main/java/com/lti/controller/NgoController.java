package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Ngo;
import com.lti.beans.User;
import com.lti.service.NgoService;
import com.lti.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/ngo-api")
public class NgoController {

	@Autowired
	NgoService ngoService;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody Ngo user) {
		ngoService.add(user);
		return "Ngo Added Successfully!";
	}

	@RequestMapping(path = "/fetch", method = RequestMethod.GET)
	public List<Ngo> fetchAll() {
		List<Ngo> list = ngoService.fetchEach();
		return list;
	}
	
	@RequestMapping(path = "/user/{username}", method = RequestMethod.GET)
	public Ngo fetch(@PathVariable("username") String username) {
		return ngoService.fetchNgo(username);
	}
}
