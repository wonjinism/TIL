<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>editor</title>
	</head>
	<script src="//cdn.ckeditor.com/4.11.1/standard/ckeditor.js"></script>
	
<body>
	<form action="fileUpload" method="post" enctype="multipart/form-data"> 
		<input type="file" name="uploadFile" />
		<input type="submit" value="업로드"/>
        <textarea name="editor" id="editor" rows="10" cols="80">
			This is my textarea to be replaced with CKEditor.
		</textarea>
        <script>
			// Replace the <textarea id="editor1"> with a CKEditor
			// instance, using default configuration.
	        CKEDITOR.replace( 'editor', {//해당 이름으로 된 textarea에 에디터를 적용
	            width:'100%',
	            height:'400px',
	            filebrowserImageUploadUrl: 'D:/upload/' //여기 경로로 파일을 전달하여 업로드 시킨다.
	        });
	         
	        CKEDITOR.on('dialogDefinition', function( ev ){
	            var dialogName = ev.data.name;
	            var dialogDefinition = ev.data.definition;
	          
	            switch (dialogName) {
	                case 'image': //Image Properties dialog
	                    //dialogDefinition.removeContents('info');
	                    dialogDefinition.removeContents('Link');
	                    dialogDefinition.removeContents('advanced');
	                    break;
	            }
	        });
		</script>
	</form>
</body>
</html>