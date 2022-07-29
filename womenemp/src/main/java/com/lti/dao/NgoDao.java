package com.lti.dao;

import java.util.List;

import com.lti.beans.Ngo;

public interface NgoDao {
	boolean addNgo(Ngo user);
	public List<Ngo> fetchAll();
	public Ngo fetchNgo(String username);
	
}
