/**
 * This javaScript file contains javaScript code associated with Canvas.html file.
 */

window.onload =  function()	{
	var c = document.getElementById("Canvas");
	var ctx = c.getContext("2d");
	
	// Fill Style used
	
	ctx.fillStyle = "#FF0000";
	
	// Rectangle Filling Is used
	
	ctx.fillRect(20, 20, 250, 100);
}