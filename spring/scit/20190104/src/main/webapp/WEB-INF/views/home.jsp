<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%-- <%@ page session="false" %> --%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<form action="insertUser" method="post">
		ID:<input type="text" name="id" />
		PW:<input type="password" name="pw" />
		<input type="submit" value="회원 가입" />
	</form>
</body>
</html>
