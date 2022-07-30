package com.lti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.beans.Step;

public interface StepService {

	public boolean add(Step step);
	public List<Step> fetchEach();
	public Step fetchStep(int stepRegId);

}
