package com.lti.service;

import java.util.List;

import com.lti.beans.Step;

public interface StepService {

	void add(Step step);

	List<Step> fetchEach();

	Step fetchStep(String username);

}
