package com.hdw.testing.bean;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeBean {

	@Id
	@Column(name = "employeeId")
	String employeeId;
	
	@Column(name = "firstName")
	String firstName;
	
	@Column(name = "lastName")
	String lastName;
	
	@Column(name = "birthday")
	Date birthday;
	
	@OneToOne
	EmployeeTypeBean employeeType;
	
	public EmployeeBean(String firstName, String lastName, Date birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	
	public EmployeeBean() {
		super();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public EmployeeTypeBean getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeTypeBean employeeType) {
		this.employeeType = employeeType;
	}
	
	
}
