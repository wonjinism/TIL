<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href='https://fonts.googleapis.com/css?family=Open+Sans:700,600' rel='stylesheet' type='text/css'>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js" type="text/javascript"></script>
	<style>
		body{
		  font-family: 'Open Sans', sans-serif;
		  background:#3498db;
		  margin: 0 auto 0 auto;  
		  width:100%; 
		  text-align:center;
		  margin: 20px 0px 20px 0px;   
		}
		
		p{
		  font-size:12px;
		  text-decoration: none;
		  color:#ffffff;
		}
		
		h1{
		  font-size:1.5em;
		  color:#525252;
		}
		
		.box{
		  background:white;
		  width:300px;
		  border-radius:6px;
		  margin: 0 auto 0 auto;
		  padding:0px 0px 70px 0px;
		  border: #2980b9 4px solid; 
		}
		
		.email{
		  background:#ecf0f1;
		  border: #ccc 1px solid;
		  border-bottom: #ccc 2px solid;
		  padding: 8px;
		  width:250px;
		  color:#AAAAAA;
		  margin-top:10px;
		  font-size:1em;
		  border-radius:4px;
		}
		
		.password{
		  border-radius:4px;
		  background:#ecf0f1;
		  border: #ccc 1px solid;
		  padding: 8px;
		  width:250px;
		  font-size:1em;
		}
		
		.btn{
		  background:#2ecc71;
		  width:125px;
		  padding-top:5px;
		  padding-bottom:5px;
		  color:white;
		  border-radius:4px;
		  border: #27ae60 1px solid;
		  
		  margin-top:20px;
		  margin-bottom:20px;
		  float:left;
		  margin-left:16px;
		  font-weight:800;
		  font-size:0.8em;
		}
		
		.btn:hover{
		  background:#2CC06B; 
		}
		
		#btn2{
		  float:left;
		  background:#3498db;
		  width:125px;  padding-top:5px;
		  padding-bottom:5px;
		  color:white;
		  border-radius:4px;
		  border: #2980b9 1px solid;
		  
		  margin-top:20px;
		  margin-bottom:20px;
		  margin-left:10px;
		  font-weight:800;
		  font-size:0.8em;
		}
		
		#btn2:hover{ 
		background:#3594D2; 
		}
	</style>
	<script>

		//Fade in dashboard box
		$(document).ready(function(){
		    $('.box').hide().fadeIn(1000);
	    });
	
		function login(){
			var action = document.querySelector("#loginBox > input[type = 'hidden']");
			action.value = "login"; 
			console.log(action.value);
			document.getElementById("login").submit();
		}
		
		function join(){
			var action = document.querySelector("#loginBox > input[type = 'hidden']");
			action.value = "join"; 
			console.log(action);
			document.getElementById("login").submit();
		}
	</script>
</head>
<body>
	<form method="post" id="login" action="login">
	    <div class="box" id="loginBox">
	        <h1>Dashboard</h1>
	        <input type="hidden" name="action" value="none"/>
	        <input type="text" name="id" placeholder="username" class="email" />
	        <input type="password" name="pw" placeholder="password" class="email" />
            <input type="button" class="btn" value="Login" onclick="login()"/>
            <input type="button" id="btn2" value="Join" onclick="join()" />
	    </div>
	</form>
	<p>Forgot your password? <u style="color:#f1c40f;">Click Here!</u></p>
</body>
</html>