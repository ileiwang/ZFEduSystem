<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List,java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>找回失败</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/foundation.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.css">
<script src="js/jquery.min.js"></script>
<script src="js/foundation.min.js"></script>
<script src="js/vendor/modernizr.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<% request.setCharacterEncoding("utf-8");%>
<body background="img/bg.jpg">
	<div class="container">
		<div class="alert alert-danger alert-dismissable fade show">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			555，找回密码失败,&nbsp;<a class="btn btn-info btn-outline-primary"
				href="findPass.jsp">重新输入</a>&nbsp;相关信息！
		</div>
	</div>
</body>
</html>