package com.bill.billing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tax_setup_details")
public class TaxSetupDetails {
	
	@Id
	@GeneratedValue
	@Column(name="tax_id")
	private Integer taxId;
	
	@Column(name="tax_name")
	private String taxName;
	
	@Column(name="tax_desc")
	private String taxDesc;
	
	@Column(name="tax_percentage")
	private Integer taxPercentage;
	
	@Column(name="tax_flag")
	private Integer taxFlag;
	
	
	public Integer getTaxId() {
		return this.taxId;
	}
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
	public String getTaxName() {
		return this.taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public String getTaxDesc() {
		return this.taxDesc;
	}
	public void setTaxDesc(String taxDesc) {
		this.taxDesc = taxDesc;
	}
	public Integer getTaxPercentage() {
		return this.taxPercentage;
	}
	public void setTaxPercentage(Integer taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public Integer getTaxFlag() {
		return this.taxFlag;
	}
	public void setTaxFlag(Integer taxFlag) {
		this.taxFlag = taxFlag;
	}
	
	
	
	

}
