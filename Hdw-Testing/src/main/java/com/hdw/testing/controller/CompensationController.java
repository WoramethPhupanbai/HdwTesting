package com.hdw.testing.controller;

import javax.servlet.http.HttpServletRequest;

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
	CalculateCompensationTransactionBeanRepository calculateCompensationTransactionBeanRepository;
	
	@GetMapping("/compensation")
	public String CalculateHistory(HttpServletRequest request){
		String empId = request.getParameter("empId");
		Iterable<CalculateCompensationTransactionBean> listcalCompen = calculateCompensationTransactionBeanRepository.findAll();
		request.setAttribute("listcalCompen", listcalCompen);
		return "calculateHistory";
	}
}
