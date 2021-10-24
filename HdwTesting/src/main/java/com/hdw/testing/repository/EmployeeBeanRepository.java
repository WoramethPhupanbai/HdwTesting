package com.hdw.testing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hdw.testing.bean.EmployeeBean;
import com.hdw.testing.bean.PartTimeEmployeeBean;

public interface EmployeeBeanRepository extends CrudRepository<EmployeeBean,Long>{
public List<EmployeeBean> findAll();
public EmployeeBean findByEmpId(int employeeId);
}
