package com.dacproject.SHCP.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User_Roles {

	@Id
	@GeneratedValue
	private int roleId;
	@OneToOne(targetEntity=User.class) 
	private int userId;
	private String type;


	
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public User_Roles(int userId, String type) {
		super();
		this.userId = userId;
		this.type = type;
	}
	
	
	
	
}
