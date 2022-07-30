package com.lti.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PG_Admin_Table")
public class Admin {
	
	@Id
	private String userNameAdmin;
		
	private String name;

	private String birthDate;
	private String password;
	private Double mobileNumber;
	
	public Admin(String userNameAdmin, String name, String birthDate, String password, Double mobileNumber) {
		super();
		this.userNameAdmin = userNameAdmin;
		this.name = name;
		this.birthDate = birthDate;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserNameAdmin() {
		return userNameAdmin;
	}
	public void setUserNameAdmin(String userNameAdmin) {
		this.userNameAdmin = userNameAdmin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Admin [userNameAdmin=" + userNameAdmin + ", name=" + name + ", birthDate=" + birthDate + ", password="
				+ password + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
