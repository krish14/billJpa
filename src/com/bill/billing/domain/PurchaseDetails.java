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
import com.bill.stock.domain.DateDetails;

@Entity
@Table(name="pruchase_details")
public class PurchaseDetails {

	@Id
	@GeneratedValue
	@Column(name = "purchase_id")
	private Integer purchaseId;
	
	@Column(name = "product_name")
	private String 	productName;
	
	@Column(name = "product_quantatiy")
	private Integer productQuantatiy;
		
	@Column(name = "shop_name")
	private String 	shopName;
	
	@Column(name = "date")
	private Date 	dateTime;

	@ManyToOne(targetEntity=Basedata.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_id", referencedColumnName="product_id")
	private Basedata productIdParent;

	@ManyToOne(targetEntity=RateDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_rate_id", referencedColumnName="product_rate_id")
	private RateDetails productRateIdParent;
	
	@ManyToOne(targetEntity=DateDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_date_id", referencedColumnName="product_date_id")
	private DateDetails productDateIdParent;
	
	@ManyToOne(targetEntity=BatchDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="product_batch", referencedColumnName="product_batch")
	private BatchDetails productBatchParent;
	
	@ManyToOne(targetEntity=BillDetails.class, cascade=CascadeType.ALL)
	@JoinColumn(name="bill_id", referencedColumnName="bill_id")
	private BillDetails billIdParent;
	
	
	public Integer getPurchaseId() {
		return this.purchaseId;
	}
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}
	
	public BillDetails getBillIdParent() {
		return this.billIdParent;
	}
	public void setBillIdParent(BillDetails billIdParent) {
		this.billIdParent = billIdParent;
	}
		
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductQuantatiy() {
		return this.productQuantatiy;
	}
	public void setProductQuantatiy(Integer productQuantatiy) {
		this.productQuantatiy = productQuantatiy;
	}
	
	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Date getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public Basedata getProductIdParent() {
		return this.productIdParent;
	}
	public void setProductIdParent(Basedata productIdParent) {
		this.productIdParent = productIdParent;
	}
	public RateDetails getProductRateIdParent() {
		return this.productRateIdParent;
	}
	public void setProductRateIdParent(RateDetails productRateIdParent) {
		this.productRateIdParent = productRateIdParent;
	}
	public DateDetails getProductDateIdParent() {
		return this.productDateIdParent;
	}
	public void setProductDateIdParent(DateDetails productDateIdParent) {
		this.productDateIdParent = productDateIdParent;
	}
	public BatchDetails getProductBatchParent() {
		return this.productBatchParent;
	}
	public void setProductBatchParent(BatchDetails productBatchParent) {
		this.productBatchParent = productBatchParent;
	}
		
	
}
