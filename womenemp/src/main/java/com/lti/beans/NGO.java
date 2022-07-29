package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NGO_Registration")
public class NGO {
	
	@Id
	@GeneratedValue
	@Column(name="NG0_ID")
	private int ngoId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="Training_Sector")
	private int trainingSector;
	
	@Column(name="Course_Id")
	private int courseId;

	public NGO(int ngoId, String name, String location, int trainingSector, int courseId) {
		super();
		this.ngoId = ngoId;
		this.name = name;
		this.location = location;
		this.trainingSector = trainingSector;
		this.courseId = courseId;
	}

	public NGO() {
		super();
	}

	public int getNgoId() {
		return ngoId;
	}

	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
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

	public int getTrainingSector() {
		return trainingSector;
	}

	public void setTrainingSector(int trainingSector) {
		this.trainingSector = trainingSector;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "NGO [ngoId=" + ngoId + ", name=" + name + ", location=" + location + ", trainingSector="
				+ trainingSector + ", courseId=" + courseId + "]";
	}
	
	
	
}
