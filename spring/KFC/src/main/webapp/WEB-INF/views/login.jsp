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
<div class="container">
    <div class="row justify-content-center align-items-center" style="height:100vh">
        <div class="col-4">
        	<div class="text-center display-3">Admin</div>
            <div class="card">
                <div class="card-body">
                    <form action="admin/access" method="post" autocomplete="off">
                        <div class="form-group">
                            <input type="text" class="form-control" name="account" value="${account}">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" name="password">
                        </div>
                        <button type="submit" class="btn btn-primary">Login</button><span class="ml-3"><font color="red">${message}</font></span>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
