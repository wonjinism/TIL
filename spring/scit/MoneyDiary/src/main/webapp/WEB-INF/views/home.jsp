<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		var contextPath;
		$(function(){
			sessionStorage.setItem('contextPath', '${pageContext.request.contextPath}');
			contextPath = sessionStorage.getItem('contextPath');
			
			$('#login_btn').on('click', function(){
				var serializeArray = $('form').serializeArray();
				console.log(serializeArray); ////
				var jsonObject = {};
				$.each(serializeArray, function(index, object){
					console.log(object.name + object.value); ////
					jsonObject[object.name] = object.value;
				});
				console.log(jsonObject); ////
				$.ajax({
					url: 'checkAccount',
					data: jsonObject,
					type: 'post',
					success: function(result){
						var text;
						if(result == '0'){
							text = ' 가입하지 않은 ID입니다.';
						}else if(result == '-1'){
							text = ' 비밀번호가 다릅니다.';
						}else if(result == '1'){
							window.location.href = 'account';
						}
						$('#warning').text(text);
					}
				});
			});
			$('#reg_btn').on('click', function(){
				window.location.href = "join";
			});
		});
	</script>
</head>
<body>
	<div id="container">
		<h1>로그인</h1>
		<form>
			ID: <input type="text" id="id" name="id" autofocus/><span id="warning" style="color: red"></span><br />
			PW: <input type="password" name="pw" /><br />
		</form>
		<button id="login_btn">로그인</button>
		<button id="reg_btn">회원가입</button>
	</div>
</body>
</html>
