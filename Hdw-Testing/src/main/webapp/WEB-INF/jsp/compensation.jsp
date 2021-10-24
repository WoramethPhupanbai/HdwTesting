<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
    <%@ page import="com.hdw.testing.bean.*"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%EmployeeBean employee = (EmployeeBean)request.getAttribute("employee");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compensation</title>
</head>
<body>
<tr>
		<td>
			<form name="frm" action="/docompensation" method="post">
				<div>
					<label><h2><b>ชื่อ - นามสกุลผู้ทดสอบประเมินผลตอบแทน</b></h2></label>
					<label><h2><b><%=employee.getFirstName() %> <%=employee.getLastName() %></b></h2></label>
				</div>
				<div>
				 <%  String typeName = request.getParameter("typeName");  %>
					<label><h2><b>ประเภทพนักงาน</b></h2></label>
					<%if(typeName.equals("1")){  %>
						<label><h2><b>พนักงานประจำ</b></h2></label>
					<%}else{ %>
						<label><h2><b>พนักงานชั่วคราว</b></h2></label>
					<%} %>
					
				</div>
				<%if(typeName.equals("2")){  %>
	                <div>
						<label><h2><b>ระบุจำนวนชั่วโมงทำงาน </b></h2></label>
						<div>
							<input type="text" name="calculateresult">
						</div>
					</div>
				<%} %>
					<div>
	                     <div>
	                        <button type="submit" onClick="return validate(frm)">คำนวณ</button>
	                     </div>
	                </div>
	                <div>
	                <label><h2><b>ค่าตอบแทนคือ</b></h2></label>
						<label><h2><b>ค่าตอบแทนคือ <% %></b></h2></label>
						<label><h2><b>บาท </b></h2></label>
					</div>
			</form>
		</td>
	</tr>
</body>
</html>