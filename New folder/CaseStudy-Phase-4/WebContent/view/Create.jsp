<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Css/Create.css">
<script type="text/javascript" src="Js\Create.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<header>
		<img alt="No Logo Found" src="Resources/Logo.jpg" class="logo">
		<div class="part">
			<a href="/CaseStudy-Phase-4/HomeServlet">Home</a> <a href="/CaseStudy-Phase-4/SearchServlet">Search</a>
		</div>
	</header>
	<section>
		<form id="createform" class="create" onsubmit="return validate()" action="/CaseStudy-Phase-4/CreateServlet" method="post">
			<table class="create-table">
				<tr>
					<td colspan="2">Create Car</td>
				</tr>
				<tr>
					<td>Make</td>
					<td><input text="text" id="make" name="make"></td>
	
				</tr>
				<tr>
					<td></td>
					<td><label id="make-error" class="error"></label></td>
				</tr>
				<tr>
					<td>Model</td>
					<td><input text="text" id="model" name="model"></td>
	
				</tr>
				<tr>
					<td></td>
					<td><label id="model-error" class="error"></label></td>
				</tr>
				<tr>
					<td>Engine(CC)</td>
					<td><input text="text" id="engine" name="engine"></td>
	
				</tr>
				<tr>
					<td></td>
					<td><label id="engine-error" class="error"></label></td>
				</tr>
				<tr>
					<td>Fuel Capacity</td>
					<td><input text="text" id="fuel" name="fuel"></td>
	
				</tr>
				<tr>
					<td></td>
					<td><label id="fuel-error" class="error"></label></td>
				</tr>
				<tr>
					<td>Milage</td>
					<td><input text="text" id="milage" name="milage"></td>
	
				</tr>
				<tr>
					<td></td>
					<td><label id="milage-error" class="error"></label></td>
				</tr>
				<tr>
					<td>Ex-Showroom Price</td>
					<td><input text="text" id="price" name="price"></td>
	
				</tr>
				<tr>
					<td></td>
					<td><label id="price-error" class="error"></label></td>
				</tr>
				<tr>
					<td>RoadTax</td>
					<td><input text="text" id="roadtax" name="roadtax"></td>
	
				</tr>
				<tr>
					<td></td>
					<td><label id="roadtax-error" class="error"></label></td>
				</tr>
				<tr>
					<td>On-Road price</td>
					<td><input text="text" id="onroad" name="onroad"></td>
				</tr>
				<tr>
					<td></td>
					<td><label id="onroad-error" class="error"></label></td>
				</tr>
				<tr>
					<td>Ac</td>
					<td><Select id="ac" name="ac">
							<option value="not selected">Select option</option>
							<option value="true">true</option>
							<option value="false">false</option>
						</Select>
					</td>
				</tr>
				<tr>
					<td></td>
					<td><label id="ac-error" class="error"></label></td>
				</tr>
								<tr>
					<td>Power Steering</td>
					<td><Select id="steering" name="steering">
							<option value="not selected">Select option</option>
							<option value="true">true</option>
							<option value="false">false</option>
						</Select>
					</td>
				</tr>
				<tr>
					<td></td>
					<td><label id="steering-error" class="error"></label></td>
				</tr>
								<tr>
					<td>Ac</td>
					<td><Select id="kit" name="kit">
							<option value="not selected">Select option</option>
							<option value="true">true</option>
							<option value="false">false</option>
						</Select>
					</td>
				</tr>
				<tr>
					<td></td>
					<td><label id="kit-error" class="error"></label></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" id="submitform" value="Create Car"></td>
				</tr>
			</table>
		</form>
	</section>
	<footer></footer>
</body>
</html>