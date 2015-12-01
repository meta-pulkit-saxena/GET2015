/**
 *  This file contains all the javascript funtions related to the Question2.html
 */

function show() {
	$('span#text').show();
}

function hide() {
	$('span#text').hide();
}

function toggle() {
	if ($('span#text').is(":visible")) {
		$('span#text').hide();
		$('#change-button').val('Show');
	} else {
		$('span#text').show();
		$('#change-button').val('Hide');
	}
}