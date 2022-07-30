package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STEP_REG")
public class Step {
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="Income_Certificate")
	private String incomeCertificate;
	
	@Column(name="Birth_Certificate")
	private String birthCertificate;
	
	@Column(name="STEP_Training_Sector")
	private String trainingSector;
	
	@Id
	@Column(name="NGO_Id")
	private int ngoId;
	
	public Step(String userName, String incomeCertificate, String birthCertificate, String trainingSector, int ngoId) {
		super();
		this.userName = userName;
		this.incomeCertificate = incomeCertificate;
		this.birthCertificate = birthCertificate;
		this.trainingSector = trainingSector;
		this.ngoId = ngoId;
	}
	public Step() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	@Override
	public String toString() {
		return "STEP [userName=" + userName + ", incomeCertificate=" + incomeCertificate + ", birthCertificate="
				+ birthCertificate + ", trainingSector=" + trainingSector + ", ngoId=" + ngoId + "]";
	}
	
	

	

}
