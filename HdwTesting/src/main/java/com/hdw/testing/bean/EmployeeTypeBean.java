package com.hdw.testing.bean;

import javax.persistence.*;

@Entity
@Table(name = "employeeType")
public class EmployeeTypeBean {

	@Column(name = "typeName")
	String typeName;
	
	@Column(name = "typeDetail")
	String typeDetail;
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeDetail() {
		return typeDetail;
	}
	public void setTypeDetail(String typeDetail) {
		this.typeDetail = typeDetail;
	}
}
