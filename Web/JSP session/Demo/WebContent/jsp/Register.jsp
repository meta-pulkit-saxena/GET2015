<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="../Css/JspCss.css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="../Register" name="register-form" method="post">
		<div class="form">
			<div class="form-heading">User Registration</div>
			<table class="table">
				<tr>
					<td>FirstName:</td> 
					<td><input type="text" name="first-name" placeholder="Enter First Name" /></td>
				</tr>
				<tr>
					<td>LastName:</td> 
					<td><input type="text" name="last-name" placeholder="Enter Last Name" /></td>
				</tr>
				<tr>
					<td>UserName:</td> 
					<td><input type="text" name="user-name" placeholder="Enter UserName" /></td>
				</tr>
				<tr>
					<td>Password :</td> 
					<td><input type="password" name="password" placeholder="Enter password"></td>
				</tr>
				<tr>
					<td>Email :</td> 
					<td><input type="text" name="email" placeholder="Enter email"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" class="button" id="submitButton" value="Register"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>