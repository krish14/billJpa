package com.bill.user.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user_role_action_mapper")
public class UserRoleActionMapper {

	/**
	 * @param args
	 */

@Id
@Column(name = "id")
private Integer id;
@Column(name = "USE_ROLE")
private Integer userRole;
@Column(name = "ACTIONS")
private Integer actions;
@Column(name = "FLAG")
private Integer flag;


public Integer getId() {
	return this.id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getUserRole() {
	return this.userRole;
}
public void setUserRole(Integer userRole) {
	this.userRole = userRole;
}
public Integer getActions() {
	return this.actions;
}
public void setActions(Integer actions) {
	this.actions = actions;
}
public Integer getFlag() {
	return this.flag;
}
public void setFlag(Integer flag) {
	this.flag = flag;
}

}
