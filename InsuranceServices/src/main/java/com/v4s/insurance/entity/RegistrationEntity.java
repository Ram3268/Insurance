package com.v4s.insurance.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class RegistrationEntity {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	@Column(name="fName")
	private String firstName;
	@Column(name="lName")
	private String lastName;
	@Column(unique=true)
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="retype")
	private String retype;
	
	
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
	
}
