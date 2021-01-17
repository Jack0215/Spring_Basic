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
안녕하세요 ${sessionScope.login.userid} 님<br>
비밀번호는 ${loginDTO.passwd} 입니다.<br>
<% LoginDTO dto2 = (LoginDTO) request.getAttribute("loginDTO"); %>
ModelAndView <br>
userid:<%= dto2.getUserid() %> <br>
passwd:<%= dto2.getPasswd() %> <br> 

</body>
</html>