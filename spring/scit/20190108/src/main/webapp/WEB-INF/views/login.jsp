<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Login Page</title>
	<script	src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js" type="text/javascript"></script>
	<script	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src="resources/js/index.js"></script>
	<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
	<form action="loginMember" method="post">
		<h1>Login Page</h1><font color="red">${message}</font><br />
		<span class="input"></span>
		<input type="text" name="id" placeholder="Account name" value="${id}"/>
		<span id="passwordMeter"></span>
		<input type="password" name="pw" id="password" placeholder="Password" value="${member.pw}" />
		<button type="submit" value="Login" title="Submit form" class="icon-arrow-right">
		<span>Login</span>
		</button>
	</form>
</body>

</html>
