package com.hdw.testing.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.hdw.testing.bean.CalculateCompensationTransactionBean;
import com.hdw.testing.bean.EmployeeBean;
import com.hdw.testing.bean.FullTimeEmployeeBean;
import com.hdw.testing.bean.PartTimeEmployeeBean;
import com.hdw.testing.repository.EmployeeBeanRepository;
import com.hdw.testing.repository.CalculateCompensationTransactionBeanRepository;
import com.hdw.testing.repository.PartTimeEmployeeBeanRepository;

@Controller
public class CalculateHistoryController {
	@Autowired
	EmployeeBeanRepository employeeRepository;
	CalculateCompensationTransactionBeanRepository calculateCompensationTransactionRepository;
	PartTimeEmployeeBeanRepository partTimeEmployeeRepository;
	
	@PostMapping("/calculateHistory")
	public String CalculateHistory(HttpServletRequest request) throws ParseException{
		Iterable<CalculateCompensationTransactionBean> listcalCompen = calculateCompensationTransactionRepository.findAll();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String calculateresult = request.getParameter("calculateresult");
		CalculateCompensationTransactionBean calCompen = new CalculateCompensationTransactionBean();
		request.setAttribute("listcalCompen", listcalCompen );
		return "calculateHistory";
	}
}
