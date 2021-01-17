<%@page import="java.util.List"%>
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
list:${xxx}
<% List<String> list = (List<String>) request.getAttribute("xxx"); %><br>
<%=list.size() %> <br><br>

</body>
</html> 
