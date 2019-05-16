<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
	<title>${room.user_id}'s Chat</title>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <style>
    	body{
		  font-family: 'Raleway', sans-serif;
		  background: #E9ECE9;
		}
		.comments-main{
		  background: #FFF;
		}
		.comment time, .comment:hover time,.icon-rocknroll, .like-count {
		  -webkit-transition: .25s opacity linear;
		  transition: .25s opacity linear;
		}
		.comments-main ul li{
		  list-style: none;
		}
		.comments .comment {
		  padding: 5px 10px;
		  background: #00AF90;
		}
		.comments .comment:hover time{
		  opacity: 1;
		}
		.comments .user-img img {
		  width: 50px;
		  height: 50px;
		}
		.comments .comment h4 {
		  display: inline-block;
		  font-size: 16px;
		}
		.comments .comment h4 a {
		  color: #404040;
		  text-decoration: none;
		}
		.comments .comment .icon-rocknroll {
		  color: #545454;
		  font-size: .85rem;
		}
		.comments .comment .icon-rocknroll:hover {
		  opacity: .5;
		}
		.comments .comment time,.comments .comment .like-count,.comments .comment .icon-rocknroll {
		  font-size: .75rem;
		  opacity: 0;
		}
		.comments .comment time, .comments .comment .like-count {
		  font-weight: 300;
		}
		.comments .comment p {
		  font-size: 13px;
		}
		.comments .comment p .reply {
		  color: #BFBFA8;
		  cursor: pointer;
		}
		.comments .comment .active {
		  opacity: 1;
		}
		.icon-rocknroll {
		  background: none;
		  outline: none;
		  cursor: pointer;
		  margin: 0 .125rem 0 0;
		}
		.comments .comment:hover .icon-rocknroll,.comments .comment:hover .like-count {
		  opacity: 1;
		}
		.comment-box-main{
		  background: #CA1D5F;
		}
		@media (min-width: 320px) and (max-width: 480px){
		  .comments .comment h4 {
		    font-size: 12px;
		  }
		  .comments .comment p{
		    font-size: 11px;
		  }
		  .comment-box-main .send-btn button{
		    margin-left: 5px;
		  }
		}
    </style>
    <script>
	    	function chatList(room_seq){
	    		$.ajax({
	    			url: "chatList",
	    			data: {"room_seq":room_seq}, /* 자바스크립트에서 자바로 넘어가는 데이터 */
	    			type: "get",
	    			success: function(data){ /* data = 서버(자바)가 클라이언트로 보내준 데이터(JSON) */
	    				console.log(JSON.stringify(data));
	    				var chat = "";
	    				for (var i = 0; i < data.length; i++) {
	    					var user_id = data[i].user_id;
							var indate = data[i].indate;
							var message = data[i].message;
							chat += '<li> \
									<div class=\"row comments mb-2\"> \
										<div class=\"col-md-2 col-sm-2 col-3 text-center user-img\"> \
									    	<img id=\"profile-photo\" src=\"http://nicesnippets.com/demo/man01.png\" class\"rounded-circle\" /> \
										</div> \
										<div class=\"col-md-9 col-sm-9 col-9 comment rounded mb-2\"> \
											<h4 class=\"m-0\">' + user_id + '</h4> \
										    <time class=\"text-white ml-3\">' + indate + '</time> \
										    <p class=\"mb-0 text-white\">' + message + '</p> \
										</div> \
									</div> \
								</li> \
		    				';
						}
	    				document.querySelector("#chatBox div ul").innerHTML = chat;
	    			}
	    		});
	    	}
    </script>
</head>
<body>
	<h1>${room.name}(${room.user_id})</h1>
	<h2><a href="list">채팅 목록으로</a></h2>
	<button onclick="chatList(${room.room_seq})">테스트</button>
	
	<div class="container">
		<div id="chatBox" class="row mt-5">
			<div class="col-md-6 offset-md-3 col-sm-6 offset-sm-3 col-12 comments-main pt-4 rounded">
				<ul class="p-0">
				</ul>
				<div class="row comment-box-main p-3 rounded-bottom">
			  		<form action="message" method="post">
			  		<div class="col-md-9 col-sm-9 col-9 pr-0 comment-box">
			  		  <input type="hidden" name="room_seq" value="${room.room_seq}" />
					  <input type="text" name="message" class="form-control" placeholder="comment..." />
		  				<button class="btn btn-info">Send</button>
			  		</div>
			  		</form>
				</div>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row mt-5">
			<div class="col-md-6 offset-md-3 col-sm-6 offset-sm-3 col-12 comments-main pt-4 rounded">
				<ul class="p-0">
					<c:forEach var="chat" items="${chatList}">
					<c:if test="${chat.user_id != sessionScope.user_id}">
					<li>
						<div class="row comments mb-2">
							<div class="col-md-2 col-sm-2 col-3 text-center user-img">
						    	<img id="profile-photo" src="http://nicesnippets.com/demo/man01.png" class="rounded-circle" />
							</div>
							<div class="col-md-9 col-sm-9 col-9 comment rounded mb-2">
								<h4 class="m-0"><a href="#">${chat.user_id}</a></h4>
							    <time class="text-white ml-3">${chat.indate}</time>
							    <p class="mb-0 text-white">${chat.message}</p>
							</div>
						</div>
					</li>
					</c:if>
					
					<c:if test="${chat.user_id == sessionScope.user_id}">
					<ul class="p-0">
						<li>
							<div class="row comments mb-2">
								<div class="col-md-2 offset-md-2 col-sm-2 offset-sm-2 col-3 offset-1 text-center user-img">
							    	<img id="profile-photo" src="http://nicesnippets.com/demo/man02.png" class="rounded-circle" />
								</div>
								<div class="col-md-7 col-sm-7 col-8 comment rounded mb-2">
									<h4 class="m-0"><a href="#">${chat.user_id}</a></h4>
								    <time class="text-white ml-3">${chat.indate}</time>
								    <p class="mb-0 text-white">${chat.message}</p>
								</div>
							</div>
						</li>
					</ul>
					</c:if>
					</c:forEach>
				</ul>
<%-- 				<div class="row comment-box-main p-3 rounded-bottom">
			  		<form action="message" method="post">
			  		<div class="col-md-9 col-sm-9 col-9 pr-0 comment-box">
			  		  <input type="hidden" name="room_seq" value="${room.room_seq}" />
					  <input type="text" name="message" class="form-control" placeholder="comment..." />
		  				<button class="btn btn-info">Send</button>
			  		</div>
			  		</form>
				</div> --%>
			</div>
		</div>
	</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</html>
