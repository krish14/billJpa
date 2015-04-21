package com.bill.user.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_authorization")
public class Authorization {
	
	@Id
	@Column(name = "USER_ROLE_ID")
	private Integer userRoleId;
	
	@Column(name = "ROLE", length=11)
	private String  role;

	//for one to one mapping the child element to parent 
	@OneToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID",referencedColumnName="USER_ID")
	private  User  userIdParent;
	
	
	public User getUserIdParent() {
		return this.userIdParent;
	}

	public void setUserIdParent(User userIdParent) {
		this.userIdParent = userIdParent;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	

}
