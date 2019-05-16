<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1>회원 가입</h1>
	<form action="memberJoin" method="post">
		<input type="hidden" name="action" value="insertMember" />
		계정 : <input type="text" name="username" id="username" /><font color="red">${requestScope.message}</font><br />
		비번 : <input type="password" name="password" id="password" /><br />
		<input type="submit" value="가입하기" /> 
	</form>
</body>
</html>