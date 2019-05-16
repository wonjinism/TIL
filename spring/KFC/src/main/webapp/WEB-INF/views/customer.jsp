<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Order</title>
	<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
	<style>
		.card{
			float: left;
			width: 300px;
			height: 450px;
			margin: 5 5px;
		}
		.cart_count{
			position: absolute;
			color: white;
			font-weight: bold;
			font-size: 15px;
			right: 28px;
			top: 13px;
		}
	</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
  <a class="navbar-brand" href="customer">주문하기</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="customer?type=">신제품<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="customer?type=">프로모션</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="customer?type=">치킨</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="customer?type=">프로모션</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="customer?type=">버거</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="customer?type=">사이드</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="customer?type=">음료</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
		<span style="font-size: 2.5em; color: red">
			<a class="cart" href="order" style="text-decoration: none;"><span class="fas fa-shopping-cart"></span></a>
			<span class="cart_count">${sessionScope.cart_count}</span>
		</span>
    </form>
  </div>
</nav>

<div style="margin-top: 80px;"></div>
<div class="container">
	<div class="row">
		<c:if test="${message ne null}">
			<div class="alert alert-warning alert-dismissible fade show" role="alert">
			  ${message}
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
			    <span aria-hidden="true">&times;</span>
			  </button>
			</div>
		</c:if>
	</div>
	<div class="row">
		<div class="col-md-12">
			<table class="table table-bordered">
				<c:forEach var="menu" items="${menuList}">
				<div class="card" style="width: 18rem;">
				  <a href="detail?menu_seq=${menu.menu_seq}"><img src="${menu.image}" class="card-img-top" alt="${menu.menu_name}"></a>
				  <div class="card-body">
				    <h5 class="card-title"><a href="detail?menu_seq=${menu.menu_seq}">${menu.menu_name}</a></h5>
				    <p class="card-text"><a href="detail?menu_seq=${menu.menu_seq}">${menu.menu_description}</a></p>
				    <p class="card-text">${menu.original_price}</p>
				    <a href="addCart?menu_seq=${menu.menu_seq}&menu_name=${menu.menu_name}&image=${menu.image}&quantity=1" class="btn btn-primary">장바구니 담기</a>
				    <a href="directOrder?menu_seq=${menu.menu_seq}&menu_name=${menu.menu_name}&image=${menu.image}&quantity=1" class="btn btn-primary">바로 구매</a>
				  </div>
				</div>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
</body>
</html>
