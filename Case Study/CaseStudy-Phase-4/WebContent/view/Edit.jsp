<%@page import="com.meta.vehicledekho.model.Car"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="view/Css/Edit.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<img alt="No Logo Found" src="view/Resources/Logo.jpg" class="logo">
		<div class="part">
			<a href="Home.html">Home</a> <a href="Search.html">Search</a>
		</div>
	</header>
	<section>
		<%Car car = (Car) request.getAttribute("details"); %>
			<form id="createform" class="create"  action="EditServlet?vehicle_id=<%=car.getVehicleId() %>" method="post">
				<table class="create-table">
					<tr>
						<td colspan="2">Edit Car</td>
					</tr>
					<tr>
						<td>Make</td>
						<td><input text="text" id="make" value="<%=car.getMake() %>" name="make"></td>
						
					</tr>
					<tr>
						<td>Model</td>
						<td><input text="text" id="model" value="<%=car.getModel() %>" name="model"></td>
						
					</tr>
					<tr>
						<td>Engine(CC)</td>
						<td><input text="text" id="engine" value="<%=car.getEngineInCC() %>" name="engine"></td>
						
					</tr>
					<tr>
						<td>Fuel Capacity</td>
						<td><input text="text" id="fuel" value="<%=car.getFuelCapacity() %>" name="fuel"></td>
						
					</tr>
					<tr>
						<td>Milage</td>
						<td><input text="text" id="milage" value="<%=car.getMileage() %>" name="milage"></td>
						
					</tr>
					<tr>
						<td>Ex-Showroom Price</td>
						<td><input text="text" id="price" value="<%=car.getPrice() %>" name="price"></td>
						
					</tr>
					<tr>
						<td>RoadTax</td>
						<td><input text="text" id="roadtax" value="<%=car.getRoadTax() %>" name="road-tax"></td>
						
					</tr>
					<tr>
						<td>Ac</td>
						<td><input text="text" id="ac" value="<%=car.isAc() %>" name="ac"></td>
						
					</tr>
					<tr>
						<td>Power Steering</td>
						<td><input text="text" id="steering" value="<%=car.isPowerSteering() %>" name="steering"></td>
						
					</tr>
					<tr>
						<td>Kit</td>
						<td><input text="text" id="kit" value="<%=car.isAccessoryKit() %>" name="kit"></td>
						
					</tr>
					<tr>
						<td colspan="2"><input type="submit" id="submitform" value="Update"></td>
					</tr>
				</table>
			</form>
	</section>
	<footer> </footer>
</body>
</html>