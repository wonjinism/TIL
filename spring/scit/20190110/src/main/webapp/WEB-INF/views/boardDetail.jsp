<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">

<head>
	<meta charset="UTF-8">
	<title>Board Detail</title>
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
	</style>
	<script>
		function selectButton(tag){
			var boardAction = document.getElementById("boardAction")
			var buttonValue = tag.value.toLowerCase() + "Board";
			boardAction.action = buttonValue;
			if(buttonValue == "deleteBoard"){
				var check = confirm("정말 삭제하시겠습니까?");
				if(check == false){
					alert("삭제를 멈추자!");
					return false;
				}
			}
			boardAction.submit();
		}
	</script>
</head>
<body>
	<div id="container">
		<h2><font color="red">${message}</font></h2>
		<table class="table table-striped table-bordered table-hover">
			<tr>
				<th>제목</th>
				<td Colspan="4">${board.boardtitle}</td>
				<th>게시자</th>
				<td>${board.id}</td>
			</tr>
			<tr>
				<th>게시일</th><td Colspan="4">${board.indate}</td>
				<th>조회수</th><td>${board.hitcount}</td>
			</tr>
			<tr><th Colspan="7">내용</th></tr>
			<tr><td Colspan="7">${board.boardcontent}</td></tr>
		</table>
		<!-- 본인이 작성한 글이면 수정, 삭제할 수 있게 한다. -->
		<form id="boardAction" action="board" method="get">
			<input type="submit" value="돌아가기" />
			<c:if test="${board.id eq sessionScope.id}">
				<input type="hidden" name="id" value="${board.id}" />
				<input type="hidden" name="boardseq" value="${board.boardseq}" />
				<input type="submit" value="Edit" onclick="event.preventDefault(); selectButton(this)" />
				<input type="submit" value="Delete" onclick="event.preventDefault(); selectButton(this)" />
			</c:if>
		</form>
	</div>
</body>
</html>
