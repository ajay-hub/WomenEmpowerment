package com.lti.beans;

public class NgoCourseDTO {
	
	private int courseId;
	
	private String courseTrainingSector;
	private String courseName;
	private String courseDetails;
	private String courseDuration;
	private String username;

	public NgoCourseDTO() {
		super();
	}
	public NgoCourseDTO(int courseId, String courseTrainingSector, String courseName, String courseDetails,
			String courseDuration, String username) {
		super();
		this.courseId = courseId;
		this.courseTrainingSector = courseTrainingSector;
		this.courseName = courseName;
		this.courseDetails = courseDetails;
		this.courseDuration = courseDuration;
		this.username = username;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "NgoCourseDTO [courseId=" + courseId + ", courseTrainingSector=" + courseTrainingSector + ", courseName="
				+ courseName + ", courseDetails=" + courseDetails + ", courseDuration=" + courseDuration + ", username="
				+ username + "]";
	}


}
