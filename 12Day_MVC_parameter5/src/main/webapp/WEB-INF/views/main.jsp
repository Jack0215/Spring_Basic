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
list:${list}<br>
<% List<String> list = (List<String>) request.getAttribute("list");%><br>
첫번째 방문자:<%=list.get(0) %> <br>
두번째 방문자:<%=list.get(1) %><br>
세번째 방문자:<%=list.get(2) %><br>
네번째 방문자:<%=list.get(3)%><br>
다섯번째 방문자:<%=list.get(4) %><br>
</body>
</html> 
