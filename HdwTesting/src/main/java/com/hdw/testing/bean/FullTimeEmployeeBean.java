package com.hdw.testing.bean;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "fullTimeEmployee")
public class FullTimeEmployeeBean extends EmployeeBean{

	@Column(name = "salary")
	double salary;

	public double getSalary() {
		return salary;
	}	

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public FullTimeEmployeeBean(int employeeId, String firstName, String lastName, Date birthday, double salary) {
		super(employeeId, firstName, lastName, birthday);
		this.salary = salary;
	}

	public FullTimeEmployeeBean(int employeeId, String firstName, String lastName, Date birthday) {
		super(employeeId, firstName, lastName, birthday);
	}

	public FullTimeEmployeeBean() {
		super();
	}

	
	
	
	
}
