package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PG_STEP_REG")
public class Step{

	@Id
	@Column(name="Registration_ID")
	private int regId;
	
	@Column(name="No_of_Children")
	private int noOfChild;
	
	@Column(name="Income_Certificate")
	private String incomeCertificate;
	
	@Column(name="Birth_Certificate")
	private String birthCertificate;
	
	@Column(name="STEP_Training_Sector")
	private String trainingSector;

	@Column(name="STEP_Ngo_Id")
	private int ngoId;
	
	@Column(name="Status")
	private boolean status;
	
	@OneToOne
	@JoinColumn(name="Username")
	User user;
	
	@ManyToOne
	@JoinColumn(name="Course_ID")
	NgoCourse ngoCourse;

	public Step(int regId, int noOfChild, String incomeCertificate, String birthCertificate, String trainingSector,
			int ngoId, boolean status, User user, NgoCourse ngoCourse) {
		super();
		this.regId = regId;
		this.noOfChild = noOfChild;
		this.incomeCertificate = incomeCertificate;
		this.birthCertificate = birthCertificate;
		this.trainingSector = trainingSector;
		this.ngoId = ngoId;
		this.status = status;
		this.user = user;
		this.ngoCourse = ngoCourse;
	}

	public Step() {
		super();
		// TODO Auto-generated constructor stub
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public NgoCourse getNgoCourse() {
		return ngoCourse;
	}

	public void setNgoCourse(NgoCourse ngoCourse) {
		this.ngoCourse = ngoCourse;
	}

	@Override
	public String toString() {
		return "Step [regId=" + regId + ", noOfChild=" + noOfChild + ", incomeCertificate=" + incomeCertificate
				+ ", birthCertificate=" + birthCertificate + ", trainingSector=" + trainingSector + ", ngoId=" + ngoId
				+ ", status=" + status + ", user=" + user + ", ngoCourse=" + ngoCourse + "]";
	}

	

}
