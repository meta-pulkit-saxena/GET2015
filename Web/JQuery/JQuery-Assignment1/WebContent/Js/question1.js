/**
 * This file contains all the javascript funtions related to the Question1.html.
 */

window.onload = function onload() {
  document.getElementById("text").style.visibility = "hidden"
};


function show() {
	document.getElementById("text").style.visibility = "visible";
}

function hide() {
	document.getElementById("text").style.visibility = "hidden";
}

function toggle() {
	if(document.getElementById("text").style.visibility == "hidden") {
		document.getElementById("text").style.visibility = "visible";
		document.getElementById("change-button").innerHTML = "hide";
	} else {
		document.getElementById("text").style.visibility = "hidden";
		document.getElementById("change-button").innerHTML = "show";
	}
}