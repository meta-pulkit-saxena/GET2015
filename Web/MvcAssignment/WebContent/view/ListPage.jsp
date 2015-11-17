<%@page import="java.util.List"%>
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
	<div class="form">
		<table class="table">
			<%
				List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
				for (Employee employee : employeeList) {
			%>
			<tr>
				<td><%=employee.getEmployeeId()%></td>
				<td><%=employee.getName()%></td>
				<td><%=employee.getEmail()%></td>
				<td><a
					href="/MvcAssignment/EmployeeDetails?id=<%=employee.getEmployeeId()%>"><input
						type="button" name="details" value="View Details"></a></td>
				<td><a
					href="/MvcAssignment/EditController?id=<%=employee.getEmployeeId()%>"><input
						type="button" name="edit" value="Edit" id="button"></a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>