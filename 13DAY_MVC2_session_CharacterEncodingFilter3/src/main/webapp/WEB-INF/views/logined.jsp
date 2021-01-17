<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<% LoginDTO dto = (LoginDTO)session.getAttribute("login"); %>

로그인 되었습니다.
반갑습니다. <%=dto.getUserid() %> 님
비밀번호는 <%=dto.getPasswd() %>입니다.
<a href="logout">로그아웃</a>
</form>
</body>
</html>
