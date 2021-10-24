<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
<%@ page import="com.hdw.testing.bean.*"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%List<CalculateCompensationTransactionBean> listcalCompen = (List<CalculateCompensationTransactionBean>)request.getAttribute("listcalCompen");
String datenow = (String)session.getAttribute("datenow");
SimpleDateFormat datefor = new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sm = new SimpleDateFormat("HH:mm");
Date dateNow = datefor.parse(datenow);
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
							<tbody>							
							<table>															
								<thead>
									<tr>
										<th scope="col">ลำดับ</th>
										<th scope="col">รหัสพนักงาน</th>
										<th scope="col">ชื่อ - นามสกุล</th>
										<th scope="col">ผลคำนวณ</th>
										<th scope="col">วันเวลา</th>
									</tr>
								</thead>
								<%int count=0; %>
								<%for(CalculateCompensationTransactionBean calCompen : listcalCompen){ %>
								<tbody>
									<tr>
										<td><%=count+1 %></td>
										<td><%=calCompen.getEmployee().getFirstName() %></td>
										<td><%=calCompen.getEmployee().getFirstName() %> <%=calCompen.getEmployee().getLastName() %></td>
										<td><%=calCompen.getCalculateResult() %></td>
										<td><%=calCompen.getDatetime() %></td>
									</tr>
								</tbody>
								
							</table>	
							<%} %>					
						</tbody>
						</table>
						<a href="listAllEmployee.jsp">listAllEmployee</a>
						<!-- .cart -->
					</div>
				</div>
				<!-- .container --> </main>
</body>
</html>