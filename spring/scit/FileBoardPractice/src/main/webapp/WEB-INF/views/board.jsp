<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="boardWrite">
	<input type="submit" value="게시글쓰기">
	</form>
	
	<table>
	<c:forEach var="board" items="${board}">
	<tr>
	<td style="width:40%;">
	<a href="boardDetail?boardSeq=${board.boardSeq}">${board.title}</a>
	</td>
	<td style="width:20%;">${board.id}</td>
	<td>${board.indate}</td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="board?page=${navi.currentPage-1}">이전페이지&nbsp;</a>
	<c:forEach var="page" begin="${navi.startPageGroup}" end="${navi.endPageGroup}">
	<c:if test="${navi.currentPage==page}">
	<b><a href="board?page=${page}">&nbsp;${page}&nbsp;</a></b>
	</c:if>
	<c:if test="${navi.currentPage!=page}">
	<a href="board?page=${page}">&nbsp;${page}&nbsp;</a>
	</c:if>
	</c:forEach>
	<a href="board?page=${navi.currentPage+1}">&nbsp;다음페이지</a>


</body>
</html>