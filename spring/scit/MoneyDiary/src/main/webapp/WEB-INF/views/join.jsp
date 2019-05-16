<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>회원 가입</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		var contextPath;
		$(function(){
			// contextPath 찾기
			sessionStorage.setItem("contextPath", "${pageContext.request.contextPath}");
			contextPath = sessionStorage.getItem("contextPath");
			
			$('#reg_btn').on('click', function(){
				var serializeArray = $('form').serializeArray();
				console.log(serializeArray); ////
				var jsonObject = {};
				$.each(serializeArray, function(index, object){
					jsonObject[object.name] = object.value;
				});
				console.log(jsonObject); ////
				newAccount(jsonObject);
			});
		});
		
		function newAccount(account){
			$.ajax({
				url: 'newAccount',
				data: account,
				type: 'post',
				success: function(result){
					if(result != 0){
						window.location.replace(contextPath);
					}else{
						$('#warning').text(' 이미 존재하는 아이디입니다!');
					}
				}
			});
		}
	</script>
</head>
<body>
	<div id="container">
		<h1>회원가입</h1>
		<form>
			ID: <input type="text" name="id" autofocus/><span id="warning" style="color: red"></span><br />
			PW: <input type="password" name="pw" /><br />
		</form>
		<button id="reg_btn">회원가입</button>
	</div>
</body>
</html>
