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

		<table>
		<tr><td>제목 : </td><td>${board.title}</td></tr>
		<tr><td>게시일: </td><td>${board.indate}</td></tr>
		<tr><td>게시자 : </td><td>${board.id}</td></tr>	
		<tr><td>내용 : </td><td>${board.content}</td></tr>
		
		<c:forEach var="file" items="${file}">
			
			<tr><td></td><td><a href="download?boardSeq=${board.boardSeq}">${file.orgname}</a></td></tr>
		
		</c:forEach>
		
		</table>
</body>
</html>