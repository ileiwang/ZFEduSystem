<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List,java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/foundation.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/foundation.min.js"></script>
<script src="js/modernizr.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript">
	function validate(f)
	{
		if(!(/^\w{5,15}$/.test(f.num.value)))
		{
			alert("用户名需要5-15位字符！");
			f.num.focus();
			return false;
		}
		if(!(/^\w{5,15}$/.test(f.password.value)))
		{
			alert("密码需要5-15位字符！");
			f.password.focus();
			return false;
		}
		return true;
	}
</script>
<script>document.createElement("myHero")</script>
<style>
myHero {
	display: block;
	background-color: #ddd;
	padding: 40px;
	font-size: 16px;
}
</style>
</head>
<% request.setCharacterEncoding("utf-8");%>
<body background="img/bg.jpg">
	<center>
		<button type="button" class="button">用户登录</button>
		<myHero>
		<form action="LoginServlet" method="post" onsubmit="return validate(this)">
			学号：<input type="text" placeholder="请输入学号" name="num">
			密码：<a data-toggle="tooltip" data-placement="bottom" title="忘记密码？" href="findPass.jsp">忘记密码?</a>
			<input type="password" placeholder="请输入密码" name="password"> <span>记住密码</span>
			<div class="switch tiny round">
			<input id="rempass" type="checkbox" checked>
			<label for="rempass"></label></div>
			用户类型： 
			<select name="type" id="type">
				<option value="student">学生</option>
				<option value="teacher">教师</option>
				<option value="admin">管理员</option>
			</select> 
			<br>
			<br>
			<input type="submit" class="button tiny round active" name="登录" value="登录">
			<input type="reset" class="button tiny round active" name="重置" value="重置">
		</form>
		</myHero>
	</center>
	<script>
		$(document).ready(function(){
		    $('[data-toggle="tooltip"]').tooltip();   
		});
	</script>
</body>
</html>