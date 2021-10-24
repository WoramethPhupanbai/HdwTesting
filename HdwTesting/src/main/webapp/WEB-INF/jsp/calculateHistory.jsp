<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
<%@ page import="com.hdw.testing.bean.*"%>
<%List<CalculateCompensationTransactionBean> listcalCompen = (List<CalculateCompensationTransactionBean>)request.getAttribute("listcalCompen");
/* DecimalFormat decimalFormat = new DecimalFormat("0.00"); */%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CalculateHistory</title>
</head>
<body>
<main>
						<table>													
							<body>
							<table>															
								<thread>
									<tr>
										<th scope="col">ลำดับ</th>
										<th scope="col">รหัสพนักงาน</th>
										<th scope="col">ชื่อ - นามสกุล</th>
										<th scope="col">ผลคำนวณ</th>
										<th scope="col">วันเวลา</th>
									</tr>
								</thread>
								<%int count=0; %>
								<%for(CalculateCompensationTransactionBean calCompen : listcalCompen){ %>
								<body>
									<tr>
										<td><%=count+1 %></td>
										<td><%=calCompen.getEmployee().getEmployeeId() %></td>
										<td><%=calCompen.getEmployee().getFirstName() %> <%=calCompen.getEmployee().getLastName() %></td>
										<td><%=calCompen.calculateCompensation() %></td>
										<td><%=calCompen.getDatetime() %></td>
									</tr>
								</body>
								
							</table>	
							<%} %>					
						</body>
						</table>
						<a href="listAllEmployee.jsp">listAllEmployee</a>
					</div>
				</div>
</body>
</html>