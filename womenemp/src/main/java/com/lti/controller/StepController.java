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

import com.lti.beans.NgoCourse;
import com.lti.beans.Step;
import com.lti.beans.StepDTO;
import com.lti.beans.User;
import com.lti.service.StepService;

@CrossOrigin("*")
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
	
	@PostMapping(path="/addStep")
	public boolean addStep(@RequestBody StepDTO s)
	{
		System.out.println(" inside controller " + s);
		User user = new User();
		user.setUsername(s.getUsername());
		
		NgoCourse ngocourse = new NgoCourse();
		ngocourse.setCourseId(s.getCourseId());
		
		
		
		Step step = new Step();
		step.setBirthCertificate(s.getBirthCertificate());
		step.setIncomeCertificate(s.getIncomeCertificate());
		step.setNgoId(s.getNgoId());
		step.setNoOfChild(s.getNoOfChild());
		step.setRegId(s.getRegId());
		step.setStatus(false);
		step.setTrainingSector(s.getTrainingSector());
		
		step.setUser(user);
		step.setNgoCourse(ngocourse);
		
		boolean username=stepService.add(step);
		boolean courseId=stepService.add(step);
		return username;
		
//		boolean courseId=stepService.add(step);
//		return courseId;
	}
	
}
	
//	@PostMapping(path="/addNgoCourseStep")
//	public boolean addNgoCourseStep(@RequestBody StepDTO s)
//	{
//		System.out.println(" inside controller " + s);
//		NgoCourse ngocourse = new NgoCourse();
//		ngocourse.setCourseId(s.getCourseId());
//		
//		Step step = new Step();
//		step.setBirthCertificate(s.getBirthCertificate());
//		step.setIncomeCertificate(s.getIncomeCertificate());
//		step.setNgoId(s.getNgoId());
//		step.setNoOfChild(s.getNoOfChild());
//		step.setRegId(s.getRegId());
//		step.setStatus(s.isStatus());
//		step.setTrainingSector(s.getTrainingSector());
//		
//		step.setNgoCourse(ngocourse);
//		
//		boolean courseId=stepService.add(step);
//		return courseId;
//	}
//
//}

//for_push
