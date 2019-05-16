<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Join</title>
</head>
<body>
	<h1>회원가입</h1>
    <form action="signUp" method="post">
		<input type="text" name="user_id" placeholder="username" value="${user_id}"/><font color="red">${warning}</font><br />
		<input type="password" name="user_password" placeholder="password"/>
		<button>create</button>
		<p class="message">Already registered? <a href="home">Sign In</a></p>
    </form>
</body>
</html>
