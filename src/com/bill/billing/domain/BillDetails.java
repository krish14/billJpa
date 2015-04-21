package com.bill.billing.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bill_details")
public class BillDetails {
	
	@Id
	@Column(name = "bill_id")
	@GeneratedValue
	private Integer billId;
	
	@Column(name = "bill_date")
	private Date billDate;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "doctor_id")
	private Integer doctorID;
	
	
	public Integer getBillId() {
		return this.billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public Date getBillDate() {
		return this.billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getDoctorID() {
		return this.doctorID;
	}
	public void setDoctorID(Integer doctorID) {
		this.doctorID = doctorID;
	}
	
	

}
