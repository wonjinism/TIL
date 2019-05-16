<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="insertMember" method="post">
	ID:<input type="text" name="id" value="${member.id}"><font color="red">${message}</font><br>
	PW:<input type="text" name="pw" value="${member.pw}"><br>
	이름:<input type="text" name="name" value="${member.name}"><br>
	핸드폰:<input type="text" name="phone" value="${member.phone}"><br>
	이메일:<input type="text" name="email" value="${member.email}"><br>
	생년월일:<input type="text" name="birthdate" value="${member.birthdate}"><br>
	<input type="submit" value="회원가입하기">
	</form>
</body>
</html>