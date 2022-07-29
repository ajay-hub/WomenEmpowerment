package com.lti.service;

import java.util.List;

import com.lti.beans.Ngo;

public interface NgoService {

	public boolean add(Ngo ngo);
	public List<Ngo> fetchEach();
	public Ngo fetchNgo(String username);
}
