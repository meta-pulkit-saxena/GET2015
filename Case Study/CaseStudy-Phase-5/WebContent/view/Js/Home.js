/*
 * This javascript file contains all the code related to the home.htmml file.
 */

function onload(username) {
	if(username != null || username != "") {
		document.getElementById("login-button").style.visibility = "hidden";
	}
	
}

function displayLogin(username) {
	if(username !== null || username != " ") {
		document.getElementById("myform").style.visibility = "visible";
	}
}

function validate() {
	var username = document.getElementById("username").value.trim();
	var password = document.getElementById("password").value.trim();
	var count=0;
	if(username == "") {
		count = 1;
		document.getElementById("username-error").innerHTML = "Enter username";
		return false;
	}
	if(password == "") {
		count = 1;
		document.getElementById("password-error").innerHTML = "Enter password";
		return false;
	}
	if(count == 0) {
		sessionStorage.setItem(username, password);
		return true;
	}
}