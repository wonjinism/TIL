<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">

<head>
	<meta charset="UTF-8">
	<title>Board</title>
</head>
<body>
	<c:if test="${message == null}">
		<h1>${sessionScope.id}님 환영합니다!</h1>
	</c:if>
	<c:if test="${message != null}">
		<h1><font color="red">${message}</font></h1>
	</c:if>
	<form action="insertBoard" method="post">
		제목:<input type="text" name="boardtitle" /><br />
		<textarea name="boardcontent" placeholder="내용" rows="5" cols="50"></textarea><br />
		<input type="submit" value="전송" />
	</form> 
</body>
</html>
