<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>주문하신 내역</title>
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

<h1 class="text-center display-4">주문하신 내역</h1>
<div class="container">
	<div class="row justify-content-center">
		<a class="btn btn-primary m-3 d-block" href="orderConfirm">주문 결정</a>
		<a class="btn btn-primary m-3 d-block" href="customer">메뉴 추가</a>
	</div>
	<div class="row">
		<div class="col-md-12">
			<c:if test="${directOrderList ne null}">
				<c:forEach var="order" items="${directOrderList}">
					<div class="card" style="width: 18rem;">
						<img src="${order['image']}" class="card-img-top" alt="${order['image']}"></a>
						<div class="card-body">
							<h5 class="card-title">${order['menu_name']}</a></h5>
							<p class="card-text">${order['original_price']}</p>
							<input type="text" name="quantity" value="${order['quantity']}"/>
							<a href="updateCart?menu_seq=${menu.menu_seq}&quantity=" class="btn btn-primary">변경</a>
							<a href="removeCart?menu_seq=${menu.menu_seq}" class="btn btn-primary">제거</a>
						</div>
					</div>
				</c:forEach>
			</c:if>
			<c:if test="${directOrderList eq null}">
				<c:forEach var="order" items="${sessionScope.orderList}">
					<div class="card" style="width: 18rem;">
						<img src="${order['image']}" class="card-img-top" alt="${order['menu_name']}"></a>
						<div class="card-body">
							<h5 class="card-title">${order['menu_name']}</a></h5>
							<p class="card-text">${order['original_price']}</p>
							<input type="text" name="quantity" value="${order['quantity']}"/>
							<a href="updateCart?menu_seq=${menu.menu_seq}&quantity=" class="btn btn-primary">변경</a>
							<a href="removeCart?menu_seq=${menu.menu_seq}" class="btn btn-primary">제거</a>
						</div>
					</div>
				</c:forEach>
			</c:if>
		</div>
	</div>
</div>
</body>
</html>