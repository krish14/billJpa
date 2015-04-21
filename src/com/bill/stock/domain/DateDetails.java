package com.bill.stock.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="date_details")
public class DateDetails {

	@Id
	@GeneratedValue
	@Column(name="product_date_id")
	private Integer productDateId;
	
	@Column(name="mfg_date")
	private Date 	mfgDate;
	
	@Column(name="exp_date")
	private Date 	expDate;
	
	@Column(name="purchase_date")
	private Date	purchaseDate;
	
	@ManyToOne(targetEntity=BatchDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_batch", referencedColumnName="product_batch")
	private BatchDetails productBatchParent;
	
	@ManyToOne(targetEntity=Basedata.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_id", referencedColumnName="product_id")
	private Basedata productIdParent;

	
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
	public Integer getProductDateId() {
		return this.productDateId;
	}
	public void setProductDateId(Integer productDateId) {
		this.productDateId = productDateId;
	}	
	public Date getMfgDate() {
		return this.mfgDate;
	}
	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}
	public Date getExpDate() {
		return this.expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Date getPurchaseDate() {
		return this.purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
	
}
