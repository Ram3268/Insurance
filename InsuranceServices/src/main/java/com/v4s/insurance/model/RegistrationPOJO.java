package com.v4s.insurance.model;

import java.util.Date;

public class RegistrationPOJO {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String retype;
	private Date dOB;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRetype() {
		return retype;
	}
	public void setRetype(String retype) {
		this.retype = retype;
	}
	public Date getdOB() {
		return dOB;
	}
	public void setdOB(Date date) {
		this.dOB = date;
	}
	
	

}
