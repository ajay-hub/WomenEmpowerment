package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Step;
import com.lti.service.StepService;

@CrossOrigin
@RestController
@RequestMapping("/step-api")
public class StepController {
	
	@Autowired
	StepService stepService;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public String add(@RequestBody Step step) {
		stepService.add(step);
		return "Ngo Added Successfully!";
	}

	@RequestMapping(path = "/fetch", method = RequestMethod.GET)
	public List<Step> fetchAll() {
		List<Step> list = stepService.fetchEach();
		return list;
	}
	
	@RequestMapping(path = "/step/{stepRegId}", method = RequestMethod.GET)
	public Step fetch(@PathVariable("stepRegId") int stepRegId) {
		return stepService.fetchStep(stepRegId);
	}
	


}
