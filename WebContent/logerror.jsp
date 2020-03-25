<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录失败</title>
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
<body background="img/bg.jpg">
	<%
		String s = request.getParameter("error");
		if (s != null) {
	%>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<center>
				<div class="alert alert-danger alert-dismissable fade show">
					<strong><%=s%></strong>
					<button type="button" class="close" data-dismiss="alert">&times;</button>
				</div>
				<br>
				<h3>
					<a class="button tiny round" href="login.jsp">重新登录</a>
				</h3>
			</center>
		</div>
	</div>
	<%
		}
	%>
</body>
</html>