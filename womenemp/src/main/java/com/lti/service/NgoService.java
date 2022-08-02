package com.lti.service;

import java.util.List;

import com.lti.beans.Ngo;
import com.lti.beans.NgoCourse;
import com.lti.beans.User;

public interface NgoService {

	public boolean add(Ngo ngo);
	public List<Ngo> fetchEach();
	public Ngo fetchNgo(String username);
	public Ngo findByUserId(String username);
	public List<NgoCourse> fetchAllByStatus();
}
