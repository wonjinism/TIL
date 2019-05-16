<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="resources/style.css">
    <script>
    	var root = "http://localhost:8888/todolist/";
    	function moveTodo(tag, id, type){
    		
    		$.ajax({
    			url: moveTodo,
    			data: {
    				id: id,
    				type: type
    				},
    			type: "post",
    			success: function(returnData){
    				if(returnData == "success"){
    					
    				}
    			}
    		});
    		
    		"moveTodo(this, " + id + ", 'DOING')";
    		
    		var todo = tag.parentElement;
    		tag.parentNode.remove(tag);
    		if(type == 'TODO'){
    			document.getElementById("doing").childElement.append();
    		}
//     		window.location.href = root + "moveTodo?id=" + id + "&type=" + type;
    	}
    </script> 
    <title>TODO 리스트</title>
</head>
<body>
    <header>
        <div class="createTodo">
        	<a href="newTodo">새로운 TODO 등록</a>
       	</div>
    </header>
    <section>
        <div id="todo" class="column">
            <div class="column_title">TODO</div>
            <c:forEach var="todo" items="${todoList}">
	            <c:if test="${todo.type eq 'TODO'}">
		            <div class="column_card">
		                <div class="todo_wrap">
		                    <span class="todo_title">${todo.title}</span><br />
		                    <span class="todo_info">
		                        <span>등록날짜: ${todo.regdate},&nbsp;</span>
		                        <span>${todo.name},&nbsp;</span>
		                        <span>우선순위 ${todo.seq}</span>
		                    </span>
		                </div>
		                <button class="btn btn_move" onclick="moveTodo(this, ${todo.id}, '${todo.type}')">→</button>
		            </div>
	            </c:if>
            </c:forEach>
        </div>
        <div id="doing" class="column">
            <div class="column_title">DOING</div>
         	<c:forEach var="todo" items="${todoList}">
	            <c:if test="${todo.type eq 'DOING'}">
		            <div class="column_card">
		                <div class="todo_wrap">
		                    <span class="todo_title">${todo.title}</span><br />
		                    <span class="todo_info">
		                        <span>등록날짜: ${todo.regdate},&nbsp;</span>
		                        <span>${todo.name},&nbsp;</span>
		                        <span>우선순위 ${todo.seq}</span>
		                    </span>
		                </div>
   		                <button class="btn btn_move" onclick="moveTodo(this, ${todo.id}, '${todo.type}')">→</button>
		            </div>
	            </c:if>
            </c:forEach>
        </div>
        <div id="done" class="column">
            <div class="column_title">DONE</div>
         	<c:forEach var="todo" items="${todoList}">
	            <c:if test="${todo.type eq 'DONE'}">
		            <div class="column_card">
		                <div class="todo_wrap">
		                    <span class="todo_title">${todo.title}</span><br />
		                    <span class="todo_info">
		                        <span>등록날짜: ${todo.regdate},&nbsp;</span>
		                        <span>${todo.name},&nbsp;</span>
		                        <span>우선순위 ${todo.seq}</span>
		                    </span>
		                </div>
		                <button class="btn btn_move" onclick="moveTodo(${todo.id}, '${todo.type}')">→</button>
		            </div>
	            </c:if>
            </c:forEach>
        </div>
    </section>
</body>
</html>