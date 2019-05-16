<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="//cdn.ckeditor.com/4.11.1/standard/ckeditor.js"></script>
    <script>
	    window.onload = function(){
	       ck = CKEDITOR.replace("editor"); // name과 일치 시켜야 함.
	    };
	    
	    /* CKEDITOR.replace('editor', {
	        uiColor: '#EEEEEE',
	        width:800,
	        height: 200,
	    }); */
	    
	    CKEDITOR.config.language = "ja"; // 언어 설정
    </script>
</head>
<body>
	<h1>${id}</h1>
    <form>
        <textarea name="editor" id="editor1" rows="10" cols="80">
			日本語ができる？
        </textarea>
    </form>
</body>
</html>
