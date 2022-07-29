package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Ngo;
import com.lti.dao.NgoDao;

@Service
public class NgoServiceImpl implements NgoService {

	@Autowired
	NgoDao NGODao;

	public boolean add(Ngo ngo) {
		System.out.println("NGO service add");
		NGODao.addNgo(ngo);
		return true;
	}

	@Override
	public List<Ngo> fetchEach() {
		// TODO Auto-generated method stub
		return NGODao.fetchAll();
	}

	@Override
	public Ngo fetchNgo(String NGOname) {
		// TODO Auto-generated method stub
		return NGODao.fetchNgo(NGOname);
	}

}
