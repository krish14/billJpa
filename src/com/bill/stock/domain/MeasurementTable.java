package com.bill.stock.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="measurement_table")
public class MeasurementTable {
	
	@Id
	@Column(name="product_measurement_id")
	private Integer productMeasurementId;
	
	@Column(name="product_measurement")
	private Integer productMeasurement;
	
	@Column(name="product_unit")
	private String productUnit;
	
	
	public Integer getProductMeasurementId() {
		return this.productMeasurementId;
	}
	public void setProductMeasurementId(Integer productMeasurementId) {
		this.productMeasurementId = productMeasurementId;
	}
	public Integer getProductMeasurement() {
		return this.productMeasurement;
	}
	public void setProductMeasurement(Integer productMeasurement) {
		this.productMeasurement = productMeasurement;
	}
	public String getProductUnit() {
		return this.productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	
	

}
