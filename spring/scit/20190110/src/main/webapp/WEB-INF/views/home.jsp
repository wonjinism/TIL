<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<title>Main Page</title>
	<script>
		// 코드 개선
		function buttonSelect(tag) {
			var action = document.getElementById("mainForm");
			action.action = tag.value.toLowerCase();
			action.submit();
		}
// 		function join(){
// 			var action = document.getElementById("mainForm");
// 			action.action = "join";
// 			action.submit();
// 		}
// 		function login(){
// 			var action = document.getElementById("mainForm");
// 			action.action = "login";
// 			action.submit();
// 		}
// 		function logout(){
// 			var action = document.getElementById("mainForm");
// 			action.action = "logout";
// 			action.submit();
// 		}
// 		function board(){
// 			var action = document.getElementById("mainForm");
// 			action.action = "board";
// 			action.submit();
// 		}
	</script>
</head>
<body>
	<c:if test="${sessionScope.id != null}">
		<h2>${sessionScope.id}님 환영합니다.</h2>
	</c:if>
	<h1>Main Page</h1>
	<form id="mainForm" action="none" method="get">
		<c:if test="${sessionScope.id == null}">
			<input type="submit" value="Join" onclick="buttonSelect(this)"/>
			<input type="submit" value="Login" onclick="buttonSelect(this)"/>
		</c:if>
		<c:if test="${sessionScope.id != null}">		
			<input type="submit" value="board" onclick="buttonSelect(this)"/>
			<input type="submit" value="logout" onclick="buttonSelect(this)"/>
		</c:if>
	</form>
	<!-- <a> 태그의 href 속성 값으로도 action을 보낼 수 있음 -->
	<a href="board">게시판 바로가기</a> 
</body>
</html>
