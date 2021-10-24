package com.hdw.testing.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hdw.testing.bean.EmployeeBean;
import com.hdw.testing.bean.FullTimeEmployeeBean;
import com.hdw.testing.bean.PartTimeEmployeeBean;
import com.hdw.testing.repository.EmployeeBeanRepository;
import com.hdw.testing.repository.FullTimeEmployeeBeanRepository;
import com.hdw.testing.repository.PartTimeEmployeeBeanRepository;

@Controller
public class ListAllEmployeeController {
	@Autowired
	EmployeeBeanRepository employeeRepository;
	FullTimeEmployeeBeanRepository fullTimeEmployeeRepository;
	PartTimeEmployeeBeanRepository partTimeEmployeeRepository;
	
	@GetMapping("/listAllEmployee")
	public String CalculateHistory(HttpServletRequest request){
		Iterable<EmployeeBean> listEmployee = employeeRepository.findAll();
		request.setAttribute("listEmployee", listEmployee);
		return "listAllEmployee";
	}
}
