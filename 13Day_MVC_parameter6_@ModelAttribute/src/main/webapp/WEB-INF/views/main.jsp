<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
${xxx}<br><br>
<% ArrayList<String> list = (ArrayList<String>) request.getAttribute("xxx"); %>
<%= list %>
</body>
</html>
