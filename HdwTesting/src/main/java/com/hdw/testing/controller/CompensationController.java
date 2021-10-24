package com.hdw.testing.controller;

import javax.servlet.http.HttpServletRequest;

import com.hdw.testing.bean.FullTimeEmployeeBean;
import com.hdw.testing.bean.PartTimeEmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hdw.testing.bean.CalculateCompensationTransactionBean;
import com.hdw.testing.bean.EmployeeBean;
import com.hdw.testing.repository.CalculateCompensationTransactionBeanRepository;
import com.hdw.testing.repository.EmployeeBeanRepository;
import com.hdw.testing.repository.FullTimeEmployeeBeanRepository;
import com.hdw.testing.repository.PartTimeEmployeeBeanRepository;

@Controller
public class CompensationController {

	@Autowired
	EmployeeBeanRepository employeeRepository;
	FullTimeEmployeeBeanRepository fullTimeEmployeeRepository;
	PartTimeEmployeeBeanRepository partTimeEmployeeRepository;
	CalculateCompensationTransactionBeanRepository calculateCompensationTransactionBeanRepository;
	

	@PostMapping("/docompensation")
	public String CalculateCompensation(HttpServletRequest request){
		int empId = Integer.parseInt(request.getParameter("empId"));
		EmployeeBean employee = employeeRepository.findByEmpId(empId);
		FullTimeEmployeeBean fullEmployee = fullTimeEmployeeRepository.findByEmpId(empId);
		PartTimeEmployeeBean partEmployee = partTimeEmployeeRepository.findByEmpId(empId);
		request.setAttribute("employee", employee);
		return "calculateHistory";
	}
}
