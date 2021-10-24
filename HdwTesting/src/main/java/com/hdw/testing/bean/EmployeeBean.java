package com.hdw.testing.bean;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class EmployeeBean {
	@TableGenerator(name = "employee", table = "employee", pkColumnName = "employeeId", valueColumnName = "GEN_VAL", pkColumnValue = "EMP-", initialValue = 001)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee")
	int employeeId;
	
	@Column(name = "firstName")
	String firstName;
	
	@Column(name = "lastName")
	String lastName;
	
	@Column(name = "birthday")
	Date birthday;
	
	@OneToOne(fetch = FetchType.EAGER)
	EmployeeTypeBean employeeType;
	
	public EmployeeBean(int employeeId, String firstName, String lastName, Date birthday) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public EmployeeBean() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
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
