package com.lti.dao;

import java.util.List;

import com.lti.beans.Ngo;
import com.lti.beans.User;

public interface NgoDao {
	boolean addNgo(Ngo user);
	public List<Ngo> fetchAll();
	public Ngo fetchNgo(String username);
	Ngo findByUserId(String username);
	
}
