<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>로그인</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<form action="success">
		ID:<input type="text" name="id" />
		PW:<input type="password" name="pw" />
		<input type="submit" value="로그인" /> 
	</form>
</body>
</html>