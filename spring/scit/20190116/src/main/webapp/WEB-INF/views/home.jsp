<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Home</title>
	</head>
<body>
	<form action="fileUpload" method="post" enctype="multipart/form-data"> 
		<input type="file" name="uploadFile" />
		<input type="submit" value="업로드"/>
	</form>
	
	<a href="fileDownload?downloadFile=${fileName}">${fileName} 다운로드</a>
</body>
</html>
