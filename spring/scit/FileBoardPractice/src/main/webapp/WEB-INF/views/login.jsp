<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

	<form action="selectMember" method="post">
	ID:<input type="text" name="id" value="${member.id}"><font color="red">${message}</font><br>
	PW:<input type="text" name="pw" value="${member.pw}"><br>
	<input type="submit" value="로그인하기">
	</form>



</body>
</html>