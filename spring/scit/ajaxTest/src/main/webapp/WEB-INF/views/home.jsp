<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script>
		$(function(){
			$("#userId").on('keyup', function(){
				var userId = $('#userId').val();
				console.log(userId);
				
				$.ajax({
					url: 'createUser',  
					data: {
						userId : userId,
						password : '1234'
					}, 
					type: 'get',
					success: function(flag){
						if(flag == 'duplicated'){
							$('#message').html('Duplicated!');	
						}else if(flag == 'success'){
							$('#message').html('Good to go!');
						}
					}
				});
			});		
		});
	</script>
</head>
<body>
	<input type="text" id="userId" />
	<h3 id="message"></h3>
</body>
</html>