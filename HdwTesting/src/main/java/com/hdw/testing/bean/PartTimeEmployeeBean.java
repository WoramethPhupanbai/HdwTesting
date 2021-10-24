package com.hdw.testing.bean;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "partTimeEmployeeBean")
public class PartTimeEmployeeBean extends EmployeeBean{

	@Id
	@Column(name = "compensation")
	double compensation;

	public double getCompensation() {
		return compensation;
	}

	public void setCompensation(double compensation) {
		this.compensation = compensation;
	}

	public PartTimeEmployeeBean(int employeeId, String firstName, String lastName, Date birthday, double compensation) {
		super(employeeId, firstName, lastName, birthday);
		this.compensation = compensation;
	}

	public PartTimeEmployeeBean(int employeeId, String firstName, String lastName, Date birthday) {
		super(employeeId, firstName, lastName, birthday);
	}
	
	public PartTimeEmployeeBean() {
		super();
	}
}
