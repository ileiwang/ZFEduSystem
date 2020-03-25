<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加课程</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/foundation.min.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/foundation.min.js"></script>
<script src="../js/modernizr.js"></script>
</head>
<body background="img/bg.jpg">
	<center>
		<center>
			<button type="button" class="button">添加课程</button>
		</center>
		<form action="/ZFEduSystem/AddCourseServlet" method="post">
			学号：<input type="text" name="num"> 专业：<input type="text"
				name="major"> 学院：<input type="text" name="college">
			班级：<input type="text" name="grade"> 星期： <select name="day"
				id="day">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
			</select> 1-2节：<input type="text" name="one"> 3-4节：<input type="text"
				name="two"> 5-6节：<input type="text" name="three">
			7-8节：<input type="text" name="four"> <input type="submit"
				class="button tiny round" value="提交"> <input type="reset"
				class="button tiny round" value="重置">
		</form>
	</center>
</body>
</html>