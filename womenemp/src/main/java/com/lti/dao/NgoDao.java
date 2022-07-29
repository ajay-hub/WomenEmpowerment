package com.lti.dao;

import java.util.List;

import com.lti.beans.Ngo;

public interface NgoDao {

	boolean addNGO(Ngo ngo);
	public List<Ngo> fetchAll();
	public Ngo fetchNGO(String username);
}
