<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Admin</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
  <a class="navbar-brand" href="admin">Admin</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="addMenu">제품 추가 <span class="sr-only">(current)</span></a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<div class="container" style="margin-top: 80px;">
	<div class="row">
		<div class="col-md-12">
			<table class="table table-bordered">
				<thead>
				<tr>
					<th>seq</th>
					<th>type</th>
					<th>menu_name</th>
					<th>menu_description</th>
					<th>price</th>
					<th>discounted</th>
			    	<th>promo</th>
			    	<th>release_date</th>
			    	<th style="width: 150px;">admin</th>
				</tr>
				</thead>
				
				<tbody>
				<c:forEach var="menu" items="${menuList}">
				<tr>
					<td>${menu.menu_seq}</td>
					<td>${menu.menu_type}</td>
					<td>${menu.menu_name}</td>
					<td>${menu.menu_description}</td>
					<td>${menu.original_price}</td>
					<td>${menu.promotion_price}</td>
			    	<td>${menu.promotion_type}</td>
			    	<td>${menu.release_date}</td>		
			    	<td>
			    		<a class="btn btn-primary" href="editMenu?menu_seq=${menu.menu_seq}">수정</a>
			    		<a class="btn btn-primary" href="deleteMenu?menu_seq=${menu.menu_seq}">삭제</a>
		    		</td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
</body>
</html>
