<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Join Page</title>
	<script	src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js" type="text/javascript"></script>
	<script	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src="resources/js/index.js"></script>
	<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
	<form action="joinMember" method="post">
		<h1>Join Page</h1><br />
		<span class="input"></span>
		<input type="text" name="id" placeholder="Account name" value="${member.id}"/><font color="red">${message}</font>
		<span id="passwordMeter"></span>
		<input type="password" name="pw" id="password" placeholder="Password" value="${member.pw}" />
		<span class="input"></span>
		<input type="text" name="name" placeholder="Full name" value="${member.name}" />
		<span class="input"></span>	
		<input type="text" name="phone" value="${member.phone}" placeholder="Phone number" />
		<span class="input"></span>	
		<input type="email" name="email" placeholder="email address" value="${member.email}"/>
		<span class="input"></span>	
		<input type="text" name="birthdate" placeholder="Birthday" value="${member.birthdate}" />
		<button type="submit" value="Join" title="Submit form" class="icon-arrow-right">
		<span>Sign up</span>
		</button>
	</form>
</body>

</html>
