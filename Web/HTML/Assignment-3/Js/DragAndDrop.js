/**
 *  This js file contains java script code associated with DragAndDrop.html file.
 */

//  AllowDrop Event function.

function allowDrop(ev) 
{
    ev.preventDefault();
}

// Drag Function.

function drag(ev) 
{
    ev.dataTransfer.setData("text", ev.target.id);
}

// Drop Function.

function drop(ev)
{
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
}
