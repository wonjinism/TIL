<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Main Page</title>
	<script>
		function join(){
			var action = document.getElementById("mainForm");
			action.action = "join";
			action.submit();
		}
		
		function login(){
			var action = document.getElementById("mainForm");
			action.action = "login";
			action.submit();
		}
		
		function logout(){
			var action = document.getElementById("mainForm");
			action.action = "logout";
			action.submit();
		}
	</script>
</head>
<body>
	<c:if test="${sessionScope.id != null}">
		<h2>${sessionScope.id}님 환영합니다.</h2>
	</c:if>
	<h1>Main Page</h1>
	<form id="mainForm" action="none" method="get">
		<c:if test="${sessionScope.id == null}">
			<input type="submit" value="Join" onclick="join()"/>
			<input type="submit" value="Login" onclick="login()"/>
		</c:if>
		<c:if test="${sessionScope.id != null}">		
			<input type="submit" value="logout" onclick="logout()"/>
		</c:if>
	</form>
</body>

</html>
