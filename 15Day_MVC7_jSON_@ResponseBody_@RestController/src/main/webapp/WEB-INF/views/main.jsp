<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">

$(function() { 
	$("#eee").on("click",function(){
		$.ajax({
			url : "eee",
			type : "get",
			dataType : "text",
			data : {
				mesg:"hello",
			},
			success: function (data, status, xhr) {
				$("#result").text(data); 
				
			},
			error: function (xhr, status, error) {
				consol.log(error);
			} 
			});
		});
	
	$("#fff").on("click",function(){
		$.ajax({
			url : "fff",
			type : "post",
			dataType : "text",
			data : {
				mesg:"hello",
			},
			headers:{ //post방식 전송시 추가, 받는쪽에선 requst.body
				"Content-Type":"application/text"
			},
			success: function (data, status, xhr) {
				$("#result").text(data); 
				
			},
			error: function (xhr, status, error) {
				consol.log(error);
			} 
			});
		});
});
</script>
<body>
<button id="eee">eee</button> <br> <br>
<button id="fff">fff</button> <br>
<div id="result"></div>  
</body> 
</html>
