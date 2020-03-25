<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页面</title>
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
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<center>
				<button type="button" class="button">用户注册</button>
				<form action="RegisterServlet" method="post">
					学号：<input type="text" placeholder="请输入学号" name="num">
					类型： 
					<select name="type" id="type">
						<option value="student">学生</option>
						<option value="teacher">教师</option>
					</select> 
					姓名：<input type="text" placeholder="请输入姓名" name="name">
					密码：<input type="password" placeholder="请输入密码" name="password">
					生日：<input type="text" placeholder="请输入生日" name="birthday">
					性别：<input type="text" placeholder="请输入性别" name="sex">
					专业：<input type="text" placeholder="请输入专业" name="major">
					学院：<input type="text" placeholder="请输入学院" name="college"> 
					班级：<input type="text" placeholder="请输入班级" name="grade">
					<br>
					<br>
					<input class="button tiny round" type="submit" value="提交">
					<input class="button tiny round" type="reset" value="重置">
				</form>
			</center>
		</div>
	</div>
</body>
</html>