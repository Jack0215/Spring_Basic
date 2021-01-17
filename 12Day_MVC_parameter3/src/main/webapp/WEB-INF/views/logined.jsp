<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
아이디:${userid} 
비밀번호:${passwd} 
<%=request.getAttribute("userid") %> 
</body>
</html>
