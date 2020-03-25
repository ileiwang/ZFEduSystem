<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List,java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/foundation.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/foundation.min.js"></script>
<script src="js/modernizr.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>找回密码</title>
<script type="text/javascript">
	function validate(f)
	{
		if(!(/^\w{5,15}$/.test(f.num.value)))
		{
			alert("用户名必须5-15个字符！");
			f.num.focus();
			return false;
		}
		if(!(/^\w{5,15}$/.test(f.password.value)))
		{
			alert("密码必须5-15个字符！");
			f.password.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<% request.setCharacterEncoding("utf-8");%>
<body background="img/bg.jpg">

	<center>
		<button type="button" class="button">找回密码</button>
	</center>
	<center>
		<form action="FindPassServlet" method="post"
			onsubmit="return validate(this)">
			学号：<input type="text" name="num" placeholder="请输入学号"> 姓名：<input
				type="text" name="name" placeholder="请输入姓名"> 类型： <select
				name="type" id="type">
				<option value="student">学生</option>
				<option value="teacher">教师</option>
				<option value="admin">管理员</option>
			</select> <br> <br> <input type="submit"
				class="btn btn-outline-primary btn-sm" name="提交" value="提交">
			<input type="reset" class="btn btn-outline-primary btn-sm" name="重置"
				value="重置">
		</form>
	</center>
</body>
</html>