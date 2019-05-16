<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<form action="login">
		<input type="submit" value="login" />
	</form>
	<form action="logout">
		<input type="submit" value="logout" />
	</form>
	<form action="go">
		<input type="submit" value="go" />
	</form>
</body>
</html>
