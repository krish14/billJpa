package com.bill.user.domain;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//table name : user_authentication
@Entity
@Table(name = "user_authentication")
public class User {
	
@Id
@Column(name = "USER_ID", length=11)	
private Integer userId;

@Column(name = "USERNAME", length=50)
private String userName;

@Column(name = "PASSWORD", length=50)
private String password;

@Column(name = "ENABLED", length=11)
private Integer enabled;

public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getEnabled() {
	return enabled;
}
public void setEnabled(Integer enabled) {
	this.enabled = enabled;
}

	
}
