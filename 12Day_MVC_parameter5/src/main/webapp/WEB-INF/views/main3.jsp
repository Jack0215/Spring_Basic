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
 list:${stringList}
<% List<String> list2 = (List<String>) request.getAttribute("stringList");%>
<%=list2.size() %> <br> 
</body> 
</html> 
