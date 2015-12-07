<%@page import="com.meta.vehicledekho.model.Car"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="view/Css/Details.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<img alt="No Logo Found" src="view/Resources/Logo.jpg" class="logo">
		<div class="part">
			<a href="HomeServlet">Home</a> <a href="SearchServlet">Search</a>
		</div>
	</header>
	<section>
		<%Car car = (Car) request.getAttribute("details"); %>
			<form id="createform" class="create">
				<table class="create-table">
					<tr>
						<td colspan="2">Full details</td>
					</tr>
					<tr>
						<td>Make</td>
						<td><%=car.getMake() %></td>
					</tr>
					<tr>
						<td>Model</td>
						<td><%=car.getModel() %></td>
					</tr>
					<tr>
						<td>Engine(CC)</td>
						<td><%=car.getEngineInCC() %></td>
					</tr>
					<tr>
						<td>Fuel Capacity</td>
						<td><%=car.getFuelCapacity() %></td>
					</tr>
					<tr>
						<td>Milage</td>
						<td><%=car.getMileage() %></td>
						
					</tr>
					<tr>
						<td>Ex-Showroom Price</td>
						<td><%=car.getPrice() %></td>
						
					</tr>
					<tr>
						<td>RoadTax</td>
						<td><%=car.getRoadTax() %></td>
						
					</tr>
					<tr>
						<td>Ac</td>
						<td><%=car.isAc() %></td>
					</tr>
					<tr>
						<td>Power Steering</td>
						<td><%=car.isPowerSteering() %></td>
					</tr>
					<tr>
						<td>Kit</td>
						<td><%=car.isAccessoryKit() %></td>
					</tr>
				</table>
			</form>
	</section>
	<footer> </footer>

</body>
</html>