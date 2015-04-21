package com.bill.stock.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manufacturer_details")
public class ManufacturerDetails {
	
	@Id
	@GeneratedValue
	@Column(name="manufacturer_id")
	private Integer manufacturerId;
	
	@Column(name="manufacturer_name")
	private String manufacturerName;
	
	@Column(name="manufacturer_sort_name")
	private String manufacturerShortName;
	
	
	public Integer getManufacturerId() {
		return this.manufacturerId;
	}
	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public String getManufacturerName() {
		return this.manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getManufacturerShortName() {
		return this.manufacturerShortName;
	}
	public void setManufacturerShortName(String manufacturerShortName) {
		this.manufacturerShortName = manufacturerShortName;
	}
	
	
	

}
