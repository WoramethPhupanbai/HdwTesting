package com.hdw.testing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hdw.testing.bean.EmployeeTypeBean;

public interface EmployeeTypeBeanRepository  extends CrudRepository<EmployeeTypeBean,Long>{
	public List<EmployeeTypeBean> findAll();
}
