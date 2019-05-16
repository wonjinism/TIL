<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>로그인</title>
	<script>
		function submitForm(logic){
			document.getElementById("logic").value = logic; 
			document.getElementById("myForm").submit();
		}
	</script>
</head>
<body>
	<h1>계산기</h1>
	<form action="logic" id="myForm">
		<input type="text" name="x" value=${result}/><br />
		<input type="text" name="y" />
		<input type="hidden" name="logic" id="logic" /><br />
		<button type="button" onclick="submitForm('plus')">+</button>
		<button type="button" onclick="submitForm('minus')">-</button>
		<button type="button" onclick="submitForm('times')">*</button>
		<button type="button" onclick="submitForm('divide')">/</button>
	</form>
</body>
</html>
