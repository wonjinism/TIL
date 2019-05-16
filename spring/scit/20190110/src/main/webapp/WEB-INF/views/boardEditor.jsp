<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">

<head>
	<meta charset="UTF-8">
	<title>Board Editor</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
	<style>
		#container {
			width: 70%;
			margin: 0 auto;
			padding-top: 10px;
		}
		h2 {
			text-align: center;
		}
	    /* Bootstrap 수정 */
	    .table > thead {
	      background-color: #b3c6ff;
	    }
	    .table > thead > tr > th {
	      text-align: center;
	    }
	    .table-hover > tbody > tr:hover {
	      background-color: #e6ecff;
	    }
	    .table > tbody > tr > td {
	      text-align: center;
	    }
	    #boardAction table td input {
	    	width: 100%;
	    }
   	    #boardAction table td textarea {
	    	width: 100%;
	    	height: 100%;
	    }
	</style>
	<script>
		function changeAction(){
			var boardAction = document.getElementById("boardAction");
			boardAction.action = "updateBoard";
			boardAction.submit();
		}
	</script>
</head>
<body>
	<div id="container">
		<!-- form 태그를 jstl로 감싸주고  action 값을 바꿔주는 방법도 있다. -->		
		<form id="boardAction" action="insertBoard" method="post">			
			<h2><font color="red">${message}</font></h2>
			<table class="table table-striped table-bordered table-hover">
				<tr>
					<th>제목</th>
					<td Colspan="4">					
						<c:if test="${status == null}">
							${board.boardtitle}
						</c:if>
						<c:if test="${status eq 'editBoard'}">
							<input type="text" name="boardtitle" value="${board.boardtitle}" />
						</c:if>
					</td>
					<th>게시자</th>
					<td>${board.id}</td>
				</tr>
				<tr>
					<th>게시일</th><td Colspan="4">${board.indate}</td>
					<th>조회수</th><td>${board.hitcount}</td>
				</tr>
				<tr><th Colspan="7">내용</th></tr>
				<tr>
					<td Colspan="7">
						<c:if test="${status == null}">
							${board.boardcontent}
						</c:if>
						<c:if test="${status eq 'editBoard'}">
							<textarea name="boardcontent" placeholder="내용" rows="5">${board.boardcontent}</textarea>
						</c:if>
					</td>
				</tr>
			</table>
			<c:if test="${status == null}">
				<input type="submit" value="전송" />
			</c:if>
			<c:if test="${status eq 'editBoard'}">
				<input type="hidden" name="boardseq" value="${board.boardseq}" />
				<input type="hidden" name="id" value="${board.id}" />
				<input type="submit" value="수정" onclick="event.preventDefault(); changeAction();"/>
			</c:if>
		</form>
	</div>
</body>
</html>
