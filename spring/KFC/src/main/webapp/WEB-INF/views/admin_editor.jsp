<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Admin</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
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
			<c:if test="${status eq null}">
				<form action="insertMenu">
					<table class="table table-bordered">
					<thead>
						<tr>
							<th>menu_type</th>
							<th>menu_name</th>
							<th>menu_description</th>
							<th>original_price</th>
							<th>promotion_price</th>
					    	<th>promotion_type</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:if test="${menu.menu_type ne null}">
						    	<td>${menu.menu_type}</td>						
				    		</c:if>
							<c:if test="${menu.menu_type eq null}">
								<td>
									<select name="menu_type">
									   <option value="0">1+1 치킨</option>
									   <option value="1" selected="selected">치킨</option>
									   <option value="2">치킨버킷</option>
									   <option value="3">치킨박스</option>
									   <option value="4">햄버거</option>
									   <option value="5">햄버거박스</option>
									   <option value="6">햄버거세트</option>
									   <option value="7">사이드</option>
									   <option value="8">음료</option>
									</select>
								</td>
							</c:if>
							<td><input type="text" name="menu_name" value="${menu.menu_name}" /></td>
							<td><textarea name="menu_description">${menu.menu_description}</textarea></td>
							<td><input type="text" name="original_price" value="${menu.original_price}" /></td>
							<td><input type="text" name="promotion_price" value="${menu.promotion_price}" /></td>
							<c:if test="${menu.promotion_type ne null}">
						    	<td>${menu.promotion_type}</td>						
				    		</c:if>
							<c:if test="${menu.promotion_type eq null}">
								<td>
							    	<select name="promotion_type">
									   <option value="0">프로모션 없음</option>
									   <option value="8">점장 프로모션</option>
									   <option value="9">신상품 프로모션</option>
									</select>
								</td>
							</c:if>
				    	</tr>
				    	<tr>
					    	<th>image</th>
					    	<td colspan="5"><input style="width: 100%;" type="text" name="image" value="${menu.image}" /></td>						
				    	</tr>
			    	</tbody>
					</table>
					<input type="hidden" name="menu_seq" value="${menu.menu_seq}" />
					<input type="hidden" name="release_date" value="${menu.menu_release_date}" />
					<input class="btn btn-primary" type="submit" value="추가" />
					<a class="btn btn-primary" href="admin">취소</a>
				</form>
				
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
			    		<a class="btn btn-primary" href="removeMenu?menu_seq=${menu.menu_seq}">삭제</a>
		    		</td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
			</c:if>
			
			<c:if test="${status eq 'edit'}">
				<form action="updateMenu">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>menu_type</th>
								<th>menu_name</th>
								<th>menu_description</th>
								<th>original_price</th>
								<th>promotion_price</th>
						    	<th>promotion_type</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>${menu.menu_type}</td>
								<td>${menu.menu_name}</td>
								<td>${menu.menu_description}</td>
								<td>${menu.original_price}</td>
								<td><input type="text" name="promotion_price" value="${menu.promotion_price}" /></td>
								<td>
							    	<select name="promotion_type">
									   <option value="0">프로모션 없음</option>
									   <option value="8">점장 프로모션</option>
									   <option value="9">신상품 프로모션</option>
									</select>
								</td>
					    	</tr>
					    	<tr>
						    	<th>image</th>
						    	<td colspan="5"><input style="width: 100%;" type="text" name="image" value="${menu.image}" /></td>						
					    	</tr>
				    	</tbody>
						</table>
						<input type="hidden" name="menu_seq" value="${menu.menu_seq}" />
						<input type="hidden" name="release_date" value="${menu.release_date}" />
						<input class="btn btn-primary" type="submit" value="수정" />
						<a class="btn btn-primary" href="admin">취소</a>
				</form>
			</c:if>
		</div>
	</div>
</div>
</body>
</html>
