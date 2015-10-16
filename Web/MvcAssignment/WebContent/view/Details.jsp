<%@page import="model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="view/css/form.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Employee employee = (Employee) request.getAttribute("employee");
	%>
	<div class="form">
		<table class="table">
			<tr>
				<td>Name:</td>
				<td><label><%=employee.getName()%></label></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><label><%=employee.getEmail()%></label></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><label><%=employee.getAge()%></label></td>
			</tr>
			<tr>
				<td>EmployeeId:</td>
				<td><label><%=employee.getEmployeeId()%></label></td>
			</tr>
			<tr>
				<td>Date Of Registration:</td>
				<td><label><%=employee.getDateOfRegistration()%></label></td>
			</tr>
		</table>
	</div>
</body>
</html>