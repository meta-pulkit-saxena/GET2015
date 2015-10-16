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
		String name = "";
		String email = "";
		String age = "";
		String Id = "";
		String submitValue = "Register";
		String formAction = "/MvcAssignment/RegisterEmployee";
		Object employee = request.getAttribute("edit");
		if (employee instanceof Employee) {
			Employee oldEmployee = (Employee) employee;
			Id = "" + oldEmployee.getEmployeeId();
			name = oldEmployee.getName();
			email = oldEmployee.getEmail();
			age = "" + oldEmployee.getAge();
			submitValue = "Update";
			formAction = "/MvcAssignment/UpdateController";
		}
	%>
	<form action="<%=formAction%>" method="post">
		<div class="form">
			<table class="table">
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name" value="<%=name%>"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" value="<%=email%>"></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><input type="text" name="age" value="<%=age%>"></td>
				</tr>
				<tr>
					<td>EmployeeId:</td>
					<td><input type="text" name="id" value="<%=Id%>"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value="<%=submitValue%>" class="button"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>