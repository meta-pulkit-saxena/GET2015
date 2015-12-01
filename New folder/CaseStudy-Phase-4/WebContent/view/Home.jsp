<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Css/Home.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"  src="Js/Home.js">
</script>
<title>VehicleDhekho</title>
</head>
<body>
	<%
	String username = (String)session.getAttribute("admin");
	String url = "#";
	if(username != null) {
		url = "/CaseStudy-Phase-4/CreateServlet";
	}
	 %>
	 <script>
       onload(username);
    </script>
	<header> 
		<img alt="No Logo Found" src="Resources/Logo.jpg" class="logo">
		<div class="part">
			<a href="#">Home</a><a href="<%=url%>">Create</a><a href="/CaseStudy-Phase-4/SearchServlet">Search</a> 
			<label id="login-button" onclick="displayLogin()">Log In</label>
		</div>
	</header>
	<section>
		<form id="myform" class="log-in" onsubmit="return validate()" action="/CaseStudy-Phase-4/LoginServlet" method="post"><br>Log In
			<table class="log" align="center">
				<tr>
					<td colspan="2"><hr></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td>
						<input type="text" id="username" name="username">
					</td>
				</tr>
				<tr>
					<td> <label id="username-error" class="login-error"></label></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>
						<input type="password" id="password" name="password">
					</td>
				</tr>
				<tr>
					<td></td>
					<td><label id="password-error" class="login-error"></label></td>
				</tr>
				<tr>
					<td colspan="2"><hr></td>
				</tr>
				<tr>
				<td colspan="2">
					<input type="submit" id="submit" value="Log In">
				</td>
				</tr>
		</table>
	</form>
	</section>
	<footer> </footer>
</body>
</html>