<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加用户</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/foundation.min.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/foundation.min.js"></script>
<script src="../js/modernizr.js"></script>
</head>
<body background="img/bg.jpg">
	<center>
		<center>
			<button type="button" class="button">添加用户</button>
		</center>
		<form action="/ZFEduSystem/RegisterServlet" method="post">
			学号：<input type="text" name="num"> 用户类型： <select name="type"
				id="type">
				<option value="student">学生</option>
				<option value="teacher">教师</option>
				<option value="admin">管理员</option>
			</select> 姓名：<input type="text" name="name"> 密码：<input type="password"
				name="password"> 生日：<input type="text" name="birthday">
			性别：<input type="text" name="sex"> 专业：<input type="text"
				name="major"> 学院：<input type="text" name="college">
			班级：<input type="text" name="grade"> <input type="submit"
				class="button tiny round" value="提交"> <input type="reset"
				class="button tiny round" value="重置">
		</form>
	</center>
</body>
</html>