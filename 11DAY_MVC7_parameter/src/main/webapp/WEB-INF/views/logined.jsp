<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1> <br>
<br>
<%String userid = (String)request.getAttribute("userid"); %>
<%String passwd = (String)request.getAttribute("passwd"); %>

<h2>안녕하세요? <%=userid %> 님!!</h2> <br>
<h3>비밀번호는 <%=passwd %> 입니다.</h3> 
</body>
</html>
