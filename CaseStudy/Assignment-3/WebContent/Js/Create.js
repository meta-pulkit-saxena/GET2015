/**
 * This javascript file contains all the code related to the Create.htmml file.
 */

function validate () {
	var make = document.getElementById("make").value;
	var model = document.getElementById("model").value;
	var engine = document.getElementById("engine").value;
	var fuel = document.getElementById("fuel").value;
	var milage = document.getElementById("milage").value;
	var price = document.getElementById("price").value;
	var roadtax = document.getElementById("roadtax").value;
	var onroad = document.getElementById("onroad").value;
	var count = true;
	if(make == "") {
		count = false;
		document.getElementById("make-error").innerHTML = "Enter make";
		return false;
	}
	if(model == "") {
		count = false;
		document.getElementById("model-error").innerHTML = "Enter model";
		return false;
	}
	if(engine == "") {
		count = false;
		document.getElementById("engine-error").innerHTML = "Enter engine";
		return false;
	}
	if(fuel == "") {
		count = false;
		document.getElementById("fuel-error").innerHTML = "Enter fuel capacity";
		return false;
	}
	if(milage == "") {
		count = false;
		document.getElementById("milage-error").innerHTML = "Enter milage";
		return false;
	}
	if(price == "") {
		count = false;
		document.getElementById("price-error").innerHTML = "Enter price";
		return false;
	}
	if(roadtax == "") {
		count = false;
		document.getElementById("roadtax-error").innerHTML = "Enter roadtax";
		return false;
	}
	if(onroad == "") {
		count = false;
		document.getElementById("onroad-error").innerHTML = "Enter onroad";
		return false;
	}
	if(count) {
		return true;
	}
}