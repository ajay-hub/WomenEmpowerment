package com.lti.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin_Table")
public class Admin {
	
	
	private String name;
	
	@Id
	private String userNameAdmin;
	
	private String birthDate;
	private String password;
	private Double mobileNumber;
	public Admin(String name, String userNameAdmin, String birthDate, String password, Double mobileNumber) {
		super();
		this.name = name;
		this.userNameAdmin = userNameAdmin;
		this.birthDate = birthDate;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	public Admin() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserNameAdmin() {
		return userNameAdmin;
	}
	public void setUserNameAdmin(String userNameAdmin) {
		this.userNameAdmin = userNameAdmin;
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
		return "Admin [name=" + name + ", userNameAdmin=" + userNameAdmin + ", birthDate=" + birthDate + ", password="
				+ password + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	

}
