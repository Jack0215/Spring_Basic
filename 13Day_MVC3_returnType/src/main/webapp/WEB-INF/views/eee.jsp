<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.dto.LoginDTO" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
${stringList} <br>

<% ArrayList<String> list = (ArrayList<String>) request.getAttribute("stringList"); %>
<%=list %>
</body> 
</html>