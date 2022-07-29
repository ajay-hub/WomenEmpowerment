package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PG_NGO_REG")
public class Ngo {

	@Id
	@Column(name="NGO_User_Name")
	private String username;

	@Column(name="NGO_Name")
	private String name;
	
	@Column(name="NGO_Location")
	private String location;
	
	@Column(name="NGO_Password")
	private String password;
	
	public Ngo(String username, String name, String location, String password) {
		super();
		this.username = username;
		this.name = name;
		this.location = location;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Ngo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
