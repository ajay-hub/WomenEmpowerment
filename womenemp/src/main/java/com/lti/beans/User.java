package com.lti.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PG_USER")
public class User {

	@Id
	private String username;
	private String name;
	private String birthDate;
	private String password;
	private Double mobileNumber;
	private int age;
	private String spouseName;
	private Double salary;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String username, String name, String birthDate, String password, Double mobileNumber, int age,
			String spouseName, Double salary) {
		super();
		this.username = username;
		this.name = name;
		this.birthDate = birthDate;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.spouseName = spouseName;
		this.salary = salary;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSpouseName() {
		return spouseName;
	}


	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", name=" + name + ", birthDate=" + birthDate + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + ", age=" + age + ", spouseName=" + spouseName + ", salary="
				+ salary + "]";
	}

}
