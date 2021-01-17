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
login2.jsp<br>
userid:${xxx.userid}<br>
passwd:${xxx.passwd}<br><br> 

<% LoginDTO dto = (LoginDTO) request.getAttribute("xxx");  %>
@ModelAttribute
userid:<%= dto.getUserid() %> <br>
passwd:<%= dto.getPasswd() %> <br>  
  
</body>
</html>