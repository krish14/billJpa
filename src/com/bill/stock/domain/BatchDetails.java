package com.bill.stock.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batch_details")
public class BatchDetails {
	
	@Id
	@Column(name="product_batch")
	private String productBatch;
	
	@Column(name="product_id")
	private Integer productId;
	
	@Column(name="product_name")
	private String productName;
	
	
	public String getProductBatch() {
		return this.productBatch;
	}
	public void setProductBatch(String productBatch) {
		this.productBatch = productBatch;
	}
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
	

}
