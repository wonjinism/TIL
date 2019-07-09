<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>

<% pageContext.setAttribute("newLine", "\n"); %>

<body>
	<form action="/guestbook/delete?no=${ param.no }" method="post">
		<table>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pwd"></td>
				<td><input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>
	<a href="/guestbook/">메인으로 돌아가기</a>
</body>
</html>