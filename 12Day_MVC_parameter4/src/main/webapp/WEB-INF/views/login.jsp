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
login.jsp<br>
id:${loginDTO.userid}<br>
passwd:${loginDTO.passwd}
<% LoginDTO dto2 = (LoginDTO) request.getAttribute("loginDTO"); %>
ModelAndView
userid:<%= dto2.getUserid() %>
passwd:<%= dto2.getPasswd() %>  
</body>
</html>