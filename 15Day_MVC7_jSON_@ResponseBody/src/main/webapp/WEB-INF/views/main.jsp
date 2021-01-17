<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
$(function() { 
	$("#aaa").on("click",function(){
		$.ajax({
			url : "aaa",
			type : "get",
			dataType : "json",
			data : {
				mesg:"kkkk",
			},
			success: function (data, status, xhr) {
				$("#result").text(JSON.stringify(data)); 
				//stringify써서 데이터를 문자로 저장
			},
			error: function (xhr, status, error) {
				consol.log(error);
			} 
			});
		});
	
	$("#bbb").on("click",function(){
		$.ajax({
			url : "bbb",
			type : "get",
			dataType : "json",
			success: function (data, status, xhr) {
				console.log(data, data.length);
				for(var i=0; i< data.length; i++){
					console.log(data[i].userid, data[i].passwd);
				}
				$("#result").text(JSON.stringify(data)); 
				//stringify써서 데이터를 문자로 저장
			},
			error: function (xhr, status, error) {
				consol.log(error);
			} 
			});
		});
	
	$("#ccc").on("click",function(){
		$.ajax({
			url : "ccc",
			type : "get",
			dataType : "json",
			success: function (data, status, xhr) {
				console.log(data, data.length);
				console.log(data.one);
				console.log(data.two);
				$("#result").text(JSON.stringify(data)); 
				//stringify써서 데이터를 문자로 저장
			},
			error: function (xhr, status, error) {
				consol.log(error);
			} 
			});
		});

$("#ddd").on("click",function(){
	$.ajax({
		url : "ddd",
		type : "get",
		dataType : "text",
		data : {
			mesg:"kkkk",
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
</head>


<body>
	<button id="aaa">aaa호출:login호출</button>
	<button id="bbb">bbb호출:ArrayList호출</button>
	<button id="ccc">ccc호출:HashMap</button>
	<button id="ddd">ddd호출:String</button>
	<div id="result"></div>
</body>
</html>
