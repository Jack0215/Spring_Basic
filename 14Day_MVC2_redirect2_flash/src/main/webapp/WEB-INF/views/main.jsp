<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P> <br> <br>
userid:${userid } <br> <br>
<%String userid = (String) request.getAttribute("userid"); %>
<%=userid %>


</body>
</html>
  