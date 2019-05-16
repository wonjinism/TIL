<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<!-- JSP에서 서버로 보낸 한글 메시지가 콘솔에 깨져서 보일 때는 ???-->
	<title>Home</title>
</head>
<body>
	<form action="login">
		<input type="submit" value="로그인 폼 이동하기"/>
	</form>
	
	<form action="calculator">
		<input type="submit" value="계산기로 가기"/>
	</form>
	
	<form action="chatting">
		<input type="submit" value="채팅으로 가기"/>
	</form>
</body>
</html>
