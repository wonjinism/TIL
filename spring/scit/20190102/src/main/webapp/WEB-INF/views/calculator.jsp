<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>계산기</title>
	<script>
		function checkForm(){
			var x = document.getElementById("x").value;
			var y = document.getElementById("y").value;
			
			if(isNaN(x) || isNaN(y)){
				alert("숫자만 입력할 수 있습니다.");
				return false;
			} else if(x == "" || y =="") {
				alert("두 개의 숫자값 모두 입력해야 합니다.")
				return false;
			}
			return true;
		}
	</script>
</head>
<body>
	<h1>계산기</h1>
	<form onsubmit="return checkForm()" action="logic" id="myForm">
		<input type="text" name="x" id="x" value="${result}" /><font color="red">${warning}</font><br />
		<input type="text" name="y" id="y" /><br />
		<button name="logic" value="plus">+</button>
		<button name="logic" value="minus">-</button>
		<button name="logic" value="times">*</button>
		<button name="logic" value="divide">/</button>
	</form>
</body>
</html>
