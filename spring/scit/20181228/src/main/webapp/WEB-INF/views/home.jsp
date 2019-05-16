<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ page session="false" %> 지우는 것이 좋다 --%> 
<html>
<head>
	<title>Home</title>
</head>
<body>
<P>  The time on the server is ${serverTime}. </P>
	<form action="test" method="get" >
		ID:<input type="text" name="id" />
		PW:<input type="password" name="pw" />
		<input type="submit" value="보내기" /> 
	</form>
</body>
</html>
