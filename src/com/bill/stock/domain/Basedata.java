package com.bill.stock.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="basedata_medicine")
public class Basedata {
	

	@Id
	@Column(name="product_id")
	@GeneratedValue
	private Integer	productId;            
	
	@Column(name="product_name")
	private String	productName;          
	
	@Column(name="product_type")
	private String	productType;
	
	@Column(name="product_group")
	private String	productGroup;
	
	@Column(name="product_measurement")
	private Integer	productMeasurement;
	
	@Column(name="product_units")
	private String	productUnits;
	
	@Column(name="date")
	private Date dateTime;
	
	@ManyToOne(targetEntity=MeasurementTable.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_measurement_id", referencedColumnName="product_measurement_id")
	private MeasurementTable productMeasurementIdParent;
	
	@ManyToOne(targetEntity=ManufacturerDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="manufacturer_id", referencedColumnName="manufacturer_id")
	private ManufacturerDetails manufacturerIdParent;
	

	public Integer getProductId() {
		return this.productId;
	}
	
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductGroup() {
		return this.productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	
	public Integer getProductMeasurement() {
		return this.productMeasurement;
	}
	public void setProductMeasurement(Integer productMeasurement) {
		this.productMeasurement = productMeasurement;
	}
	public String getProductUnits() {
		return this.productUnits;
	}
	public void setProductUnits(String productUnits) {
		this.productUnits = productUnits;
	}
	public Date getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public MeasurementTable getProductMeasurementIdParent() {
		return this.productMeasurementIdParent;
	}

	public void setProductMeasurementIdParent(
			MeasurementTable productMeasurementIdParent) {
		this.productMeasurementIdParent = productMeasurementIdParent;
	}

	public ManufacturerDetails getManufacturerIdParent() {
		return this.manufacturerIdParent;
	}

	public void setManufacturerIdParent(ManufacturerDetails manufacturerIdParent) {
		this.manufacturerIdParent = manufacturerIdParent;
	} 
	
	


}
