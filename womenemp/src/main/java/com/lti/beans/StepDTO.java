package com.lti.beans;

import javax.persistence.Column;

public class StepDTO {
	
	private int regId;
	private int noOfChild;
	private String incomeCertificate;
	private String birthCertificate;
	private String trainingSector;
	private int ngoId;
	@Column(columnDefinition="BOOLEAN DEFAULT false")
	private boolean status;
	private String username;
	private int courseId;
	
	@Override
	public String toString() {
		return "StepDTO [regId=" + regId + ", noOfChild=" + noOfChild + ", incomeCertificate=" + incomeCertificate
				+ ", birthCertificate=" + birthCertificate + ", trainingSector=" + trainingSector + ", ngoId=" + ngoId
				+ ", status=" + status + ", username=" + username + ", courseId=" + courseId + "]";
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public int getNoOfChild() {
		return noOfChild;
	}

	public void setNoOfChild(int noOfChild) {
		this.noOfChild = noOfChild;
	}

	public String getIncomeCertificate() {
		return incomeCertificate;
	}

	public void setIncomeCertificate(String incomeCertificate) {
		this.incomeCertificate = incomeCertificate;
	}

	public String getBirthCertificate() {
		return birthCertificate;
	}

	public void setBirthCertificate(String birthCertificate) {
		this.birthCertificate = birthCertificate;
	}

	public String getTrainingSector() {
		return trainingSector;
	}

	public void setTrainingSector(String trainingSector) {
		this.trainingSector = trainingSector;
	}

	public int getNgoId() {
		return ngoId;
	}

	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public StepDTO() {
		super();
	}

	public StepDTO(int regId, int noOfChild, String incomeCertificate, String birthCertificate, String trainingSector,
			int ngoId, boolean status, String username, int courseId) {
		super();
		this.regId = regId;
		this.noOfChild = noOfChild;
		this.incomeCertificate = incomeCertificate;
		this.birthCertificate = birthCertificate;
		this.trainingSector = trainingSector;
		this.ngoId = ngoId;
		this.status = status;
		this.username = username;
		this.courseId = courseId;
	}

}


//for_push
