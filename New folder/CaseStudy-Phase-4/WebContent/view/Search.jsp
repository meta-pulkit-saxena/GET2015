<%@page import="com.meta.vehicledekho.model.Vehicle"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="view/Css/Search.css">
<script src="view/Js/Search.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<img alt="No Logo Found" src="view/Resources/Logo.jpg" class="logo">
		<div class="part">
			<a href="HomeServlet">Home</a>
		</div>
	</header>
	<section>
			<div id="searchdiv" class="search">
				<form onsubmit="return validate()" action="/CaseStudy-Phase-4/SearchServlet" method="post"> 
					<table class="create-table">
						<tr>
							<td colspan="2">Search Car</td>
						</tr>
						<tr>
							<td>Make</td>
							<td>
								<select text="text" id="make" name="make" onchange="createModel()">
								<option value="select make">Select Make</option>
								<% List<String> makeArray = (List<String>)request.getAttribute("make"); 
								for( String str: makeArray) {
								%>
									<option value="<%=str%>"><%=str%></option>
								<%} %>
								</select>
							</td>
						</tr>
						<tr>
							<td></td>
							<td><label id="make-error" class="error"></label></td>
						</tr>
						<tr>
							<td></td>
							<td><label id="model-error" class="error"></label></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" id="searchButton" value="Search Car"></td>
						</tr>
					</table>
				</form>
				<div class="result" id="result">
					<table>
						<tr>
							<td>MAKE</td>
							<td>MODEL</td>
							<td>DETAILS LINK</td>
							<td>EDIT LINK</td>
						</tr>
					<%List<Vehicle> list = (List<Vehicle>)request.getAttribute("vehicleList");
					if(list != null) {
						for(Vehicle vehicle: list) {
					%>
							<tr>
								<td><%=vehicle.getMake()%>
								<td><%=vehicle.getModel()%></td>
								<td><a href="/CaseStudy-Phase-4/DetailsServlet?vehicle_id=<%=vehicle.getVehicleId()%>"><img alt="No details image" src="view/Resources/view.png"></a></td>
								<td><a href="/CaseStudy-Phase-4/EditServlet?vehicle_id=<%=vehicle.getVehicleId()%>"><img alt="No edit image" src="view/Resources/edit.png"></a></td>
							</tr>
					<%} 
						}
					%>
					</table>
				</div>
			</div>	   
	</section>
	<footer> </footer>
</body>
</html>