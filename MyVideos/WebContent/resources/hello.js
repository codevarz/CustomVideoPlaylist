/**
 * http://usejsdoc.org/
 */
$(function() {
	console.log( "ready!" );
	console.log($("#playlist tbody tr").size());
	var items=[];
	var index = 0;
	var current=0;
	$("#playlist tbody tr").each(function(){
		items.push($(this).text());
		index++;
		$(this).html("<td><button onClick='loadCurrentVideo()' class='name'>Name"+index+"</ button></td>");
	});
	console.log(items[0].trim());

	$("#nextbtn").click(function(){
		current++;
		alert( current + "..." + items[current]);
	});

	$("#prevbtn").click(function(){
		current--;
		alert( current + "..." + items[current]);
	});

	function generateId(v_url){
		var regExp = /^.*(youtu\.be\/|v\/|u\/\w\/|embed\/|watch\?v=|\&v=)([^#\&\?]*).*/;
		var match = v_url.match(regExp);
		if (match && match[2].length == 11) {
			console.log(match[2]);
			return match[2];
		} else {
			return "error";
		}
	}
});