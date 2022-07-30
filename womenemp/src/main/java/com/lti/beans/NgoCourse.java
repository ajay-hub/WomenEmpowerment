package com.lti.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Many NgoCourses to one NgoUserName

@Entity
@Table(name = "PG_NGO_COURSE")
public class NgoCourse {
	
	@Id
	private int courseId;
	
	private String courseTrainingSector;
	private String courseName;
	private String courseDetails;
	private String courseDuration;
	
	@ManyToOne
	@JoinColumn(name="NGO_User_Name")
	Ngo ngo;

	public NgoCourse(int courseId, String courseTrainingSector, String courseName, String courseDetails,
			String courseDuration, Ngo ngo) {
		super();
		this.courseId = courseId;
		this.courseTrainingSector = courseTrainingSector;
		this.courseName = courseName;
		this.courseDetails = courseDetails;
		this.courseDuration = courseDuration;
		this.ngo = ngo;
	}

	public NgoCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseTrainingSector() {
		return courseTrainingSector;
	}

	public void setCourseTrainingSector(String courseTrainingSector) {
		this.courseTrainingSector = courseTrainingSector;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public Ngo getNgo() {
		return ngo;
	}

	public void setNgo(Ngo ngo) {
		this.ngo = ngo;
	}

	@Override
	public String toString() {
		return "NgoCourse [courseId=" + courseId + ", courseTrainingSector=" + courseTrainingSector + ", courseName="
				+ courseName + ", courseDetails=" + courseDetails + ", courseDuration=" + courseDuration + ", ngo="
				+ ngo + "]";
	}
	
	
}
