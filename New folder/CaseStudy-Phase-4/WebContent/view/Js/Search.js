/**
 * This javascript file contains all the code related to the Search.htmml file.
 */

function validate() {
	var make = document.getElementById("make").value;
	var model = document.getElementById("model").value;
	var count = true;
	if(make == "select make") {
		count = false;
		document.getElementById("make-error").innerHTML = "Select make";
		return false;
	}
	if(model == "select model") {
		count = false;
		document.getElementById("model-error").innerHTML = "Select model";
		return false;
	}
	if(count == true) {
		document.getElementById("result").style.visibility = "visible";
		return true;
	}
}


