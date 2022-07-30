package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Step;
import com.lti.dao.StepDao;

@Service
public class StepServiceImpl implements StepService{

	@Autowired
	StepDao stepDao;

	public boolean add(Step step) {
		System.out.println("Step Reg Service Impl add");
		stepDao.addStep(step);
		return true;
	}

	@Override
	public List<Step> fetchEach(){
		// TODO Auto-generated method stub
		return stepDao.fetchAll();
	}


	@Override
	public Step fetchStep(int stepRegId) {
		// TODO Auto-generated method stub
		return stepDao.fetchStep(stepRegId);
	}

}
