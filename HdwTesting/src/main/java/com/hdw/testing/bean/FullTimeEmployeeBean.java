package com.hdw.testing.bean;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "fullTimeEmployeeBean")
public class FullTimeEmployeeBean extends EmployeeBean{

	@Id
	@Column(name = "salary")
	double salary;

	public double getSalary() {
		return salary;
	}	

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public FullTimeEmployeeBean(String firstName, String lastName, Date birthday, double salary) {
		super(firstName, lastName, birthday);
		this.salary = salary;
	}

	public FullTimeEmployeeBean(String firstName, String lastName, Date birthday) {
		super(firstName, lastName, birthday);
	}
	
	
	
	
}
