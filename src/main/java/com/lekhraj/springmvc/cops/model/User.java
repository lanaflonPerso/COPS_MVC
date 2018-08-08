package com.lekhraj.springmvc.cops.model;

import java.util.Date;

public class User {
	private String userName;
	private String initial;
	private String role;
	String location;
	private Date createDate;
	

	public User(String userName, String initial, String role, String location, Date createDate) {
		super();
		this.userName = userName;
		this.initial = initial;
		this.role = role;
		this.location = location;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", initial=" + initial + ", role=" + role + ", location=" + location + ", createDate=" + createDate + "]";
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
