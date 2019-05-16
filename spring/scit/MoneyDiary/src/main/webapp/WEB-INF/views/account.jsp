<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Account</title>
	<style>
		ul li {
			list-style: none;
			display: inline-block;
		}
	</style>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		var selectFlag = '2';
		$(function(){
			init();
			$('#transaction_btn').on('click', function(){
				var serializeArray = $('#transactionInput_form').serializeArray();
				var jsonObject = serializeObject(serializeArray);
				newTransaction(jsonObject);				
			});			
		});

		// json 객체로 만들어 주는 메소드		
		function serializeObject(serializeArray){
			var jsonObject = {};
			$.each(serializeArray, function(index, object){
				jsonObject[object.name] = object.value;
			});				
			return jsonObject;
		}
		
		function init(){
			$.ajax({
				url: 'transactionList',
				type: 'get',
				success: function(transactionList){
					console.log(transactionList); ////
						list(transactionList);
				}
			});
		}
		
		function list(transactionList){
			var content = '';					
			$.each(transactionList, function(index, transaction){
				if(selectFlag == 2){
					content += '<div class="transaction_wrap">';
					content += '<ul>';
					content += '<li class="transaction_eventDate">' + transaction.eventDate + '</li>';
					if(transaction.flag == '1'){
						content += '<li class="transaction_flag"><font color="blue">수입</font></li>';						
					} else{
						content += '<li class="transaction_flag"><font color="red">지출</font></li>';
					}
					content += '<li class="transaction_title">' + transaction.title + '</li>';
					content += '<li class="transaction_content">' + transaction.content + '</li>';
				
					if(transaction.flag == '1'){
						content += '<li class="transaction_amount"><font color="blue">' + transaction.amount + '</font></li>';
					}else{
						content += '<li class="transaction_amount"><font color="red">-' + transaction.amount + '</font></li>';
					}
					content += '<li class="transaction_btn"><button class="transaction_del_btn" button data-sno="' + transaction.accountSeq + '">삭제</button></li>';
					content += '</ul></div>';
				} else if(selectFlag == 0 && transaction.flag == '0'){
					content += '<div class="transaction_wrap">';
					content += '<ul>';
					content += '<li class="transaction_eventDate">' + transaction.eventDate + '</li>';
					content += '<li class="transaction_flag"><font color="red">지출</red></li>';
					content += '<li class="transaction_title">' + transaction.title + '</li>';
					content += '<li class="transaction_content">' + transaction.content + '</li>';
					content += '<li class="transaction_amount"><font color="red">-' + transaction.amount + '</font></li>';
					content += '<li class="transaction_btn"><button class="transaction_del_btn" button data-sno="' + transaction.accountSeq + '">삭제</button></li>';
					content += '</ul></div>';					
				} else if(selectFlag == 1 && transaction.flag == '1'){
					content += '<div class="transaction_wrap">';
					content += '<ul>';
					content += '<li class="transaction_eventDate">' + transaction.eventDate + '</li>';
					content += '<li class="transaction_flag"><font color="blue">수입</font></li>';
					content += '<li class="transaction_title">' + transaction.title + '</li>';
					content += '<li class="transaction_content">' + transaction.content + '</li>';
					content += '<li class="transaction_amount"><font color="blue">' + transaction.amount + '</font></li>';
					content += '<li class="transaction_btn"><button class="transaction_del_btn" button data-sno="' + transaction.accountSeq + '">삭제</button></li>';
					content += '</ul></div>';
				}
			});
			
			$('#transactionList').html(content);
			$('.transaction_del_btn').on('click', function(){
				var accountSeq = $(this).attr('data-sno');
				console.log(accountSeq); ////
				$.ajax({
					url: 'deleteTransaction',
					data: {
						accountSeq : accountSeq
					},
					type: 'post',
					success: function(result){
						if(result != 0){
							init();
						}
						else{
							alert('삭제에 실패했습니다. 관리자에게 문의하세요.');
						}
					}
				});
			});
		}
		
		function newTransaction(jsonObject){
			console.log(jsonObject); ////
			$.ajax({
				url: 'newTransaction',
				data: jsonObject,
				type: 'post',
				success: function(result){
					if(result != 0){
						init();
					}else{
						alert('추가 실패! 관리자에게 문의하세요!');
					}
				}
			});
		}
	</script>
</head>
<body>
	<div id="container">
		<header>
			<h1>Account</h1>
		</header>
		<section id="transactionInput_wrap">
			<form id="transactionInput_form" >
				<input type="hidden" name="id" value="${sessionScope.id}" />
				Title: <input type="text" name="title" /><br />
				DESC: <input type="text" name="content" /><br />
				<label for="flag_profit">수입</label>
				<input type="radio" id="flag_profit" name="flag" value="1" />
				<label for="flag_expense">지출</label>
				<input type="radio" id="flag_expense" name="flag" value="0" />
				<br />
				Amount: <input type="number" name="amount" /><br />
				Date: <input type="date" name="eventDate" placeholder="2019-02-25"/>
			</form>
			<button id="transaction_btn">입력</button>
		</section>
		<section id="transactionList_wrap">
			<nav>
				<ul>
					<li id="totalList"><button class="flag_btn" data-sno="2">전체</button></li>
					<li id="profitList"><button class="flag_btn" data-sno="1">수입</button></li>
					<li id="expenseList"><button class="flag_btn" data-sno="0">지출</button></li>
				</ul>
			</nav>
			<div class="transactionTitle_wrap">
				<ul>
					<li class="transaction_eventDate">날짜</li>
					<li class="transaction_flag">구분</li>
					<li class="transaction_title">제목</li>
					<li class="transaction_content">내용</li>
					<li class="transaction_amount">금액</li>
					<li class="transaction_del_btn"></li>
				</ul>
			</div>
			<div id="transactionList">
			</div>
		</section>
	</div>
</body>
</html>
