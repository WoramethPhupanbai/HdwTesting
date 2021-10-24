<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
    <%@ page import="com.hdw.testing.bean.*"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%List<EmployeeBean> listEmployee = (List<EmployeeBean>)request.getAttribute("listEmployee");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListAllEmployee</title>
</head>
<body>
<main>												
							<body>
							<table>															
								<thread>
									<tr>
										<th scope="col">ลำดับ</th>
										<th scope="col">รหัสพนักงาน</th>
										<th scope="col">ชื่อ - นามสกุล</th>
										<th scope="col">อายุ</th>
										<th scope="col">ประเภท</th>
										<th scope="col"></th>
									</tr>
								</thread>
								<%int count=0; %>
								<%for(EmployeeBean allEmployee : listEmployee){ %>
								<body>
									<tr>
										<td><%=count+1 %></td>
										<td><%=allEmployee.getFirstName() %></td>
										<td><%=allEmployee.getFirstName() %> <%=allEmployee.getLastName() %></td>
										<%int years = 0;
									      int months = 0;
									      int days = 0;
									 
									      //create calendar object for birth day
									      Calendar birthDay = Calendar.getInstance();
									      birthDay.setTimeInMillis(allEmployee.getBirthday().getTime());
									 
									      //create calendar object for current day
									      long currentTime = System.currentTimeMillis();
									      Calendar now = Calendar.getInstance();
									      now.setTimeInMillis(currentTime);
									 
									      //Get difference between years
									      years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
									      int currMonth = now.get(Calendar.MONTH) + 1;
									      int birthMonth = birthDay.get(Calendar.MONTH) + 1;
									 
									      //Get difference between months
									      months = currMonth - birthMonth;
									 
									      //if month difference is in negative then reduce years by one 
									      //and calculate the number of months.
									      if (months < 0)
									      {
									         years--;
									         months = 12 - birthMonth + currMonth;
									         if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
									            months--;
									      } else if (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
									      {
									         years--;
									         months = 11;
									      }
									 
									      //Calculate the days
									      if (now.get(Calendar.DATE) > birthDay.get(Calendar.DATE))
									         days = now.get(Calendar.DATE) - birthDay.get(Calendar.DATE);
									      else if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
									      {
									         int today = now.get(Calendar.DAY_OF_MONTH);
									         now.add(Calendar.MONTH, -1);
									         days = now.getActualMaximum(Calendar.DAY_OF_MONTH) - birthDay.get(Calendar.DAY_OF_MONTH) + today;
									      } 
									      else
									      {
									         days = 0;
									         if (months == 12)
									         {
									            years++;
									            months = 0;
									         }
									      } %>
										<td><%=years%></td>
										<td><%=allEmployee.getEmployeeType().getTypeName()%></td>
										<td><a href="compensation?empId=<%=allEmployee.getEmployeeId()%>">คำนวณค่าตอบแทน</a></td>
									</tr>
								</body>
								<%} %>
							</table>						
						</body>
				</main>
</body>
</html>