package com.hdw.testing.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "calculateCompensationTransactionBean")
public class CalculateCompensationTransactionBean {

	@Id
	
	@Column(name = "calculateResult")
	double calculateResult;
	
	@Column(name = "datetime")
	Timestamp datetime;
	
	@OneToOne
	EmployeeBean employee = new EmployeeBean();
	
	public EmployeeBean getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}
	public double getCalculateResult() {
		return calculateResult;
	}
	public void setCalculateResult(double calculateResult) {
		this.calculateResult = calculateResult;
	}
	public Timestamp getDatetime() {
		return datetime;
	}
	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}
	
	public CalculateCompensationTransactionBean(EmployeeBean employee, double calculateResult, Timestamp datetime) {
		super();
		this.employee = employee;
		this.calculateResult = calculateResult;
		this.datetime = datetime;
	}
	
	
	public CalculateCompensationTransactionBean() {
		super();
	}
	public double calculateCompensation(){
		PartTimeEmployeeBean partTimeEmployeeBean = null;
		partTimeEmployeeBean.getCompensation();
		this.getCalculateResult();
		return 0;
	}
}
