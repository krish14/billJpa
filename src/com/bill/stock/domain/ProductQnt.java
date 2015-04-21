package com.bill.stock.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_qnt")
public class ProductQnt {
	
	@Id
	@Column(name="product_qnt_it")
	private Integer productQntId;
	
	@Column(name="product_qnt")
	private Integer productQnt;
	
	@ManyToOne(targetEntity=BatchDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_batch", referencedColumnName="product_batch")
	private Basedata productBatchParent;
	
	@ManyToOne(targetEntity=Basedata.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_id", referencedColumnName="product_id")
	private BatchDetails productIdParent;

	public Integer getProductQntId() {
		return this.productQntId;
	}
	public void setProductQntId(Integer productQntId) {
		this.productQntId = productQntId;
	}
	
	public Basedata getProductBatchParent() {
		return this.productBatchParent;
	}
	public void setProductBatchParent(Basedata productBatchParent) {
		this.productBatchParent = productBatchParent;
	}
	public BatchDetails getProductIdParent() {
		return this.productIdParent;
	}
	public void setProductIdParent(BatchDetails productIdParent) {
		this.productIdParent = productIdParent;
	}
	public Integer getProductQnt() {
		return this.productQnt;
	}
	public void setProductQnt(Integer productQnt) {
		this.productQnt = productQnt;
	}
	
	

}
