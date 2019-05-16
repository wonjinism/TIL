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
	
	<form action="contentWrite" method="post" enctype="multipart/form-data">
	<tr><td>제목 : </td><td>
	<input type="text" name="title"></td></tr>
	<tr><td>내용 : </td><td>
	<textarea name="content"></textarea></td></tr>
	<tr><td>첨부파일 : </td><td>
	<input type="file" name="file"></td></tr>
	<tr><td></td><td>
	<input type="submit" name="등록"></td></tr>
	</form>

	</table>
</body>
</html>