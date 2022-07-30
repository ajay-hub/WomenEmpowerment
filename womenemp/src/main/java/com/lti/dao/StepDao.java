package com.lti.dao;

import java.util.List;

import com.lti.beans.Step;



public interface StepDao {

	
	boolean addStep(Step step);
	public List<Step> fetchAll();
	public Step fetchStep (int ngoId);

}
