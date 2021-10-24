package com.hdw.testing.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hdw.testing.bean.CalculateCompensationTransactionBean;
import com.hdw.testing.bean.EmployeeBean;
import com.hdw.testing.bean.FullTimeEmployeeBean;
import com.hdw.testing.bean.PartTimeEmployeeBean;
import com.hdw.testing.repository.EmployeeBeanRepository;
import com.hdw.testing.repository.FullTimeEmployeeBeanRepository;
import com.hdw.testing.repository.PartTimeEmployeeBeanRepository;

@Controller
public class InsertEmployeeController {

	@Autowired
	EmployeeBeanRepository employeeRepository;
	FullTimeEmployeeBeanRepository fullTimeEmployeeBeanRepository;
	PartTimeEmployeeBeanRepository partTimeEmployeeBeanRepository;
	
	@GetMapping("/")
	public String welcome(Map<String, Object> model,HttpSession session,HttpServletRequest request) {
		return "insertEmployee";
	}
	
	@PostMapping(value="/doinsertemployee")
	public String doRegister(HttpServletRequest request,HttpSession session) throws Exception{	
		request.setCharacterEncoding("UTF-8");
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String typeName = request.getParameter("typeName");
	 	String firstName = request.getParameter("firstName");
	 	String lastName = request.getParameter("lastName");
	 	String timeres = request.getParameter("birthday");
		Date birthday = (Date) dateFormat.parse(timeres);
		Double compensation = Double.parseDouble(request.getParameter("compensation"));
		
		int empId = 0;
		EmployeeBean employee = employeeRepository.findByEmpId(empId);
		if(employee == null) {
			if(typeName.equals("1")) {
				FullTimeEmployeeBean fTimeEm = new FullTimeEmployeeBean(firstName, lastName, birthday, compensation);
				fTimeEm.setEmployeeId("");
				fTimeEm.setFirstName(firstName);
				fTimeEm.setLastName(lastName);
				fTimeEm.setBirthday(birthday);
				fTimeEm.setSalary(compensation);
				fullTimeEmployeeBeanRepository.save(fTimeEm);
			}else {
				PartTimeEmployeeBean pTimeEm = new PartTimeEmployeeBean(firstName, lastName, birthday, compensation);
				pTimeEm.setFirstName(firstName);
				pTimeEm.setLastName(lastName);
				pTimeEm.setBirthday(birthday);
				pTimeEm.setCompensation(compensation);
				partTimeEmployeeBeanRepository.save(pTimeEm);
			}
		}
		
		Iterable<EmployeeBean> listEmployeeBean = employeeRepository.findAll();
		request.setAttribute("listEmployeeBean", listEmployeeBean);
		return "listAllEmployee";	
	}
}
