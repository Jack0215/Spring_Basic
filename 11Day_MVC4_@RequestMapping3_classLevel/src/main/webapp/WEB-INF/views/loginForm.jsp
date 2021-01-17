<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 화면</h1>
<form action="login" method="POST"> <!-- action은 controller를 찾아가게된다. -->
									<!-- controller에 servlet같은 함수를 만들어야한다. -->
									<!-- method가 post 혹은 get에 따른 처리도 해야한다. -->
아이디:<input type="text" name="userid"><br>
비밀번호:<input type="text" name="passwd"><br>
<input type="submit" value="로그인">
</form>
<!-- <a href="http://localhost:8079/RequestMapping/main.jsp">이동하기</a> 안됨 --> 
<a href="main">이동하기</a>
</body> 
</html>