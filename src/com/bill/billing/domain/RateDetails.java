package com.bill.billing.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bill.stock.domain.Basedata;
import com.bill.stock.domain.BatchDetails;

@Entity
@Table(name="rate_details")
public class RateDetails {
	
	@Id
	@GeneratedValue
	@Column(name="product_rate_id")
	private Integer productRateId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="cost_individual_rate")
	private Integer costIndividualRate;
	
	@Column(name="selling_individual_rate")
	private Integer sellingIndividualRate;
	
	@Column(name="ratedetails")
	private Date rateDetails;
	
	@ManyToOne(targetEntity=BatchDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_batch", referencedColumnName="product_batch")
	private BatchDetails productBatchParent;
	
	@ManyToOne(targetEntity=Basedata.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_id", referencedColumnName="product_id")
	private Basedata productIdParent;
	
	
	public Integer getProductRateId() {
		return this.productRateId;
	}
	public void setProductRateId(Integer productRateId) {
		this.productRateId = productRateId;
	}
	
	public BatchDetails getProductBatchParent() {
		return this.productBatchParent;
	}
	public void setProductBatchParent(BatchDetails productBatchParent) {
		this.productBatchParent = productBatchParent;
	}
	public Basedata getProductIdParent() {
		return this.productIdParent;
	}
	public void setProductIdParent(Basedata productIdParent) {
		this.productIdParent = productIdParent;
	}
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getCostIndividualRate() {
		return this.costIndividualRate;
	}
	public void setCostIndividualRate(Integer costIndividualRate) {
		this.costIndividualRate = costIndividualRate;
	}
	public Integer getSellingIndividualRate() {
		return this.sellingIndividualRate;
	}
	public void setSellingIndividualRate(Integer sellingIndividualRate) {
		this.sellingIndividualRate = sellingIndividualRate;
	}
	public Date getRateDetails() {
		return this.rateDetails;
	}
	public void setRateDetails(Date rateDetails) {
		this.rateDetails = rateDetails;
	}
	
	

}
