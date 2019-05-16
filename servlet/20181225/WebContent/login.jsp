<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String username = (String)session.getAttribute("username");
%>
	<center><h1><%=username%>님 회원 가입을 환영합니다!</h1></center>
	<center><h1>${sessionScope.username}님 로그인을 해봅시다.</h1></center>
	<form action="memberJoin" method="post">
		<input type="hidden" name="action" value="loginMember" />
		계정 : <input type="text" name="username" id="username" /><br />
		비번 : <input type="password" name="password" id="password" /><br />
		<input type="submit" value="로그인" /> 
	</form>
</body>
</html>