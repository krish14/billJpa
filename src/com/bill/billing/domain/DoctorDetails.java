package com.bill.billing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor_details")
public class DoctorDetails {
	
	@Id
	@Column(name="doctor_id")
	private Integer doctorId;
	
	@Column(name="doctor_name")
	private String doctorName;
	
	@Column(name="hospital_name")
	private String hospitalName;
	
	
	public Integer getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	

}
