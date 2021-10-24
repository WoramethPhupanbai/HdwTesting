package com.hdw.testing.bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "calculateCompensationTransaction")
public class CalculateCompensationTransactionBean {

	@Column(name = "calculateResult")
	double calculateResult;
	
	@Column(name = "datetime")
	Timestamp datetime;
	
	@OneToOne(fetch = FetchType.EAGER)
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
		FullTimeEmployeeBean fullTimeEmployeeBean = null;
		fullTimeEmployeeBean.getSalary();
		PartTimeEmployeeBean partTimeEmployeeBean = null;
		partTimeEmployeeBean.getCompensation();
		this.getCalculateResult();
		return 0;
	}
}
