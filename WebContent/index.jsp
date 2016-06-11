<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/SpringMVC/js/jquery-2.1.3.min.js"></script>
<script>
	$(function(){
		$("#post").click(function(){
			$("#post_form").attr("action",$(this).attr("href")).submit();
			return false;
		});
		
	});
</script>
</head>
<body>
	<a href="http://localhost:8080/SpringMVC/T/t_2" >GET</a>
	<a href="http://localhost:8080/SpringMVC/T/t_2" id="post">POST</a>
	
	
	<form method="post" id="post_form">
		<input name="name"  value="xiaofen"/>
		<br />
		<input name="pass"  value="root"/>
	</form>
</body>
</html>