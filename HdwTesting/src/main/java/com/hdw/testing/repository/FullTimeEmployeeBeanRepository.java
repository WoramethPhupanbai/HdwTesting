package com.hdw.testing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hdw.testing.bean.FullTimeEmployeeBean;

public interface FullTimeEmployeeBeanRepository  extends CrudRepository<FullTimeEmployeeBean,Long>{
	public List<FullTimeEmployeeBean> findAll();
	
	public FullTimeEmployeeBean findByEmpId(int empId);
}
