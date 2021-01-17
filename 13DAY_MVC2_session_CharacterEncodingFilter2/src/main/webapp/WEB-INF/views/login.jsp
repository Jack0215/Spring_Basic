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
안녕하세요. ${userid}님<br>
비밀번호는 ${passwd }입니다.<br>
<a href="logout">로그아웃</a>
</body>
</html>