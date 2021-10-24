<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee</title>
</head>
<body>
<tr>
		<td>
                      <form name="frm" action="/doinsert" method="post">
                          <div>
                            <label><h2><b>ประเภทพนักงาน </b></h2></label>
                            <div>
                              <select name="typeName">
							    <option value="1">ประเภทพนักงานประจำ</option>
							    <option value="2">ประเภทพนักงานชั่วคราว</option>
							</select>
                            </div>
                          </div>
                          
                          <div>
                            <label><h2><b>ชื่อ </b></h2></label>
                            <div>
                              <input type="text"  name="firstName" placeholder="กรุณาระบุชื่อ">
                            </div>
                          </div>
                        
                          <div>
                              <label><h2><b>นามสกุล </b></h2></label>
                              <div>
                                <input type="text" name="lastName" placeholder="กรุณาระบุนามสกุล">
                              </div>
                            </div>
                            
                             <div>
                              <label><h2><b>วันเกิด </b></h2></label>
                              <div>
                                <input type="text" name="birthday" placeholder="ระบุวันเกิด">
                              </div>
                            </div>
                            <%  String typeName = request.getParameter("typeName");  %>
                     	<%if(typeName.equals("1")){ %>
                     	<div>
                              <label><h2><b>อัตราเงินเดือน </b></h2></label>
                              <div>
                                <input type="text" name="compensation" placeholder="ระบุจำนวนเงินเดือน">
                              </div>
                              <label><h2><b>บาท</b></h2></label>
                            </div>
                     	<%}else{ %>
                     	<div>
                              <label><h2><b>อัตราค่าตอบแทน </b></h2></label>
                              <div>
                                <input type="text" name="compensation" placeholder="ระบุค่าตอบแทน">
                              </div>
                              <label><h2><b>ต่อชั่วโมง</b></h2></label>
                            </div>
                     	<%} %>
                            
                 
                          <div>
                            <div>
                              <button type="submit" onClick="return validate(frm)">บันทึกข้อมูล</button>
                            </div>
                          </div>
                        </form>
                     
                  </td>
	</tr>
</body>
</html>