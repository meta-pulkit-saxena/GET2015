/**
 * This javascript file contains all the code related to the Search.htmml file.
 */

function createModel() 
{
	var map = new Map();
	var value1 = ["Figo","EcoSport"];
	var value2 = ["Honda City","Brio"];
	var value3 = ["Celerio","Swift"];
	map.set("ford",value1);
	map.set("honda",value2);
	map.set("maruti suzuki",value3);
	var makeObject = document.getElementById("make").value;
	var modelObject = document.getElementById("model");
	switch(makeObject) 
	{
		case "ford" :
			var value = map.get("ford");
			var options = "<option>" + value[0] + "</option>" + "<option> "+ value[1] + "</option>";
			modelObject.innerHTML = options;
			break;
		case "honda" :
			var value = map.get("honda");
			var options = "<option>" + value[0] + "</option>" + "<option> "+ value[1] + "</option>";
			modelObject.innerHTML = options;
			break;
		case "maruti suzuki" :
			var value = map.get("maruti suzuki");
			var options = "<option>" + value[0] + "</option>" + "<option> "+ value[1] + "</option>";
			modelObject.innerHTML = options;
			break;
	}
}

function validate() {
	var make = document.getElementById("make").value;
	var model = document.getElementById("model").value;
	var count = true;
	if(make == "select make") {
		count = false;
		document.getElementById("make-error").innerHTML = "Select make";
	}
	if(model == "select model") {
		count = false;
		document.getElementById("model-error").innerHTML = "Select model";
	}
	if(count == true) {
		document.getElementById("result").style.visibility = "visible";
	}
}


