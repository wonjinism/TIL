<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>게시물 작성</title>
</head>
<body>

	<h1>게시판</h1>
	<form action="memberJoin" method="get">
		<input type="hidden" name="action" value="insertBoard" />
		메시지 : <input type="text" name="message" />
		<input type="submit" value="메시지 전송" />
	</form>

<!-- jstl을 사용해서 ArrayList를 렌더링, ArrayList가 null이면 나오지 않음. -->
	<table border='1px solid black'>
	<c:forEach var="board" items="${requestScope.boardList}">
		<tr><td>작성자 : ${board.username}</td><td>내용 : ${board.message}</td></tr>
	</c:forEach>
	</table>

</body>
</html>