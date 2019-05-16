<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.mainwrapp {
	width : 900px;
	margin:0 auto;
	text-align:center;
}
table {
	width : 800px;
	margin : 0 auto;
	border-collapse : collapse;
}
td {
	border-bottom : 1px solid black;
	border-top : 1px solid black;
}
.seq {
	width : 50px;
}
.name {
	width : 100px;
}
.regdate{
	width : 200px;
}
.review {
	width : 400px;
	text-align : left;
}
</style>
<script src="resources/jquery-3.1.1.min.js"></script>
<script>
$(function(){
	$("#regist").on('click', regist);
	init();
});

//모든 데이터 읽어옴
function init() {
	// Code Here
	$.ajax({
		url: 'reviewList',
		type: 'get',
		success: function(result){
			if(result != ""){
				output(result);
			}else{
				$('#reviewDiv').html('');
			}
		}
	});
}

// 서평 등록 
function regist(){
	var name = $("#name").val();
	var review = $("#review").val();
	
	if(name.length == 0 || review.length ==0) {
		alert("데이터를 입력해 주세요");
		return;
	}

	var reviewData = {
		 'name' : name
		,'review' : review
	}

	$.ajax({
		url: 'reviewWrite',
		data: reviewData,
		type: 'get',
		success: function(result){
			if(result != 0){
				init();
			}else{
				alert('등록에 실패했습니다. 관리자에게 문의하세요');
			}
		}
	});
}

function output(resp) {
	var data = '<table>';

	$.each(resp, function(index, item){
		data += '<tr class="reviewtr" data-sno="'+ item.seq +'" >';
		data += '	<td class="seq">' + item.seq + '</td>';
		data += '	<td class="name">' + item.name + '</td>';
		data += '	<td class="regdate">' + item.regdate + '</td>';
		data += '	<td class="review">' + item.review + '</td>';
		data += '	<td><input type="button" class="udpbtn" data-sno="'+item.seq +'"value="수정" /></td>';
		data += '	<td><input type="button" class="delbtn" data-sno="'+item.seq +'"value="삭제" /></td>';
		data += '</tr>';
	});
	// Code Here
	$('#reviewDiv').html(data);
	$('.udpbtn').on('click', udt);
	$('.delbtn').on('click', del);
}

// 서평 삭제
function del() {
	var delno = $(this).attr('data-sno');
	$.ajax({
		//Code Here
		url: 'reviewDelete',
		data: {seq : delno},
		type: 'get',
		success: function(result){
			if(result != 0){
				init();
			}else{
				alert('삭제에 실패했습니다. 관리자에게 문의하세요');
			}
		}
	});
}

function udt(){
	var udtno = $(this).attr('data-sno');
	var name = $('tr[data-sno="' + udtno + '"] .name').html();
	var review = $('tr[data-sno="' + udtno + '"] .review').html();

	$('#name').val(name);
	$('#review').val(review);
	$('#name').focus();
	$('#regist').val('수정');
	$('#regist').on('click', update);
}

function update(){
	var name = $('#name').val();
	var review = $('#review').val();
	
	var updateData = {
		"name" : name,
		"review" : review
	}
	
	$.ajax({
		url: 'update',
		data: updateData,
		type: 'get',
		success: function(result){
			if(result != 0){
				$('#data').val('');
				$('#review').val('');
				$('#regist').val('추가');
				$('#regist').on('click', regist);
				init();
			}else{
				alert('수정에 실패했습니다! 관리자 문의!');
			}
			
		}
	});
}
</script>
</head>
<body>
<div class="mainwrapp">
<h2> [ 오늘의 책 ]</h2>
<p>"오늘의 책"의 서평을 등록해 주세요.</p>

<img src="resources/book.jpg" />
<p>설민석의 조선왕조실록 : 설민석 (지은이) | 최준석 (그림) | 세계사 | 2016-07-25</p>
<form>
	이름 : <input type="text" id="name" name="name" placeholder="이름" /> &nbsp;
	서평 : <input type="text" id="review" name="review" style="width:400px;" placeholder="서평" />
	<input type="button" id="regist" value="등록" />
</form>
<div id="reviewDiv">
</div>
</div>
</body>
</html>