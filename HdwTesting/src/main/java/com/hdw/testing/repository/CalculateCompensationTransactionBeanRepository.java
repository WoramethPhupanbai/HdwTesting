package com.hdw.testing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hdw.testing.bean.CalculateCompensationTransactionBean;
import com.hdw.testing.bean.PartTimeEmployeeBean;

public interface CalculateCompensationTransactionBeanRepository extends CrudRepository<CalculateCompensationTransactionBean,Long>{
	public List<CalculateCompensationTransactionBean> findAll();
	public CalculateCompensationTransactionBean findByEmail(String email);
}
