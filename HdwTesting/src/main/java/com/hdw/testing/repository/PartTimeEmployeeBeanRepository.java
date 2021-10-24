package com.hdw.testing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hdw.testing.bean.PartTimeEmployeeBean;

public interface PartTimeEmployeeBeanRepository  extends CrudRepository<PartTimeEmployeeBean,Long>{
	public List<PartTimeEmployeeBean> findAll();
	public PartTimeEmployeeBean findByEmpId(int empId);
}
