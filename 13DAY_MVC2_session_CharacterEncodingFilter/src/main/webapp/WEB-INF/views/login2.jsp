<%@page import="java.util.HashMap"%>
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
<h1>
	로그인되었습니다.
</h1><br>
아이디 : ${userid}<br>
passwd:${passwd}<br>



<% String userid = (String) session.getAttribute("userid"); %>
<% String passwd = (String) session.getAttribute("passwd"); %>
ModelAndView <br>
userid:<%=userid %> <br>
passwd:<%=passwd %> <br>  

<a href="logout">로그아웃</a>
</body>
</html> 