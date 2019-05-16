<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">

<head>
	<meta charset="UTF-8">
	<title>Board</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
	<style>
		#container {
			width: 90%;
			margin: 0 auto;
			padding-top: 10px;
		}
		h1 {
			text-align: center;
			margin-bottom: 10px;
			font-size: 24px;
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
</head>
<body>
	<div id="container">
		<h1>자유 게시판</h1>
		<c:if test="${message != null}">
			<br /><h1><font color="red">${message}</font></h1>
		</c:if>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>제목</th><th>게시자</th><th>조회수</th><th>등록일</th>
				</tr>
			</thead>
		<c:forEach var="board" items="${boardList}">
			<tr>
				<td class="title"><a href="boardDetail?boardseq=${board.boardseq}">${board.boardtitle}</a></td>
				<td>${board.id}</td>
				<td>${board.hitcount}</td>
				<td>${board.indate}</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>
