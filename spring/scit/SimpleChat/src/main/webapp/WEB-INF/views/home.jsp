<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="signIn" method="post">
		<input type="text" name="user_id" placeholder="username" value="${user_id}" /><font color="red">${warning}</font><br />
		<input type="password" name="user_password" placeholder="password"/>
		<button>login</button>
		<p class="message">Not registered? <a href="join">Create an account</a></p>
	</form>
</body>
</html>
