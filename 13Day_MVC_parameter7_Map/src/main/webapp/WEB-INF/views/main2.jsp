<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html> 
<head>
	<title>Home</title>
</head>
<body>
${address}<br>
${username}<br>
<% String add = (String)request.getAttribute("address"); %>
<!-- 원래는 HashMap 처리를 해야했었음 근데, 그게 사라짐 -->
<% String user = (String)request.getAttribute("username"); %>
<%=add %> &nbsp <%=user %>

${list} <br>
<% ArrayList<String> list = (ArrayList<String>) request.getAttribute("listttt");
	for(int i=0; i<list.size(); i++){
		String a = list.get(i); %>
	
	<%=a %><br>
<%} %>
</body>
</html>
