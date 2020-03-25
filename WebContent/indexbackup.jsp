<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List,java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页</title>
<script type="text/javascript">
	function validate(f)
	{
		if(!(/^\w{5,15}$/.test(f.num.value)))
		{
			alert("User id must 5-15");
			f.num.focus();
			return false;
		}
		if(!(/^\w{5,15}$/.test(f.password.value)))
		{
			alert("Password must 5-15");
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
		<h2>
			<font color="red" size="16px">用户登录</font>
		</h2>
	</center>
	<center>
		<form action="LoginServlet" method="post"
			onsubmit="return validate(this)">
			学号：<input type="text" name="num"><br> 密码：<input
				type="password" name="password"><a href="findPass.jsp">忘记密码?</a><br>
			类型： <select name="type" id="type">
				<option value="student">学生</option>
				<option value="teacher">教师</option>
				<option value="admin">管理员</option>
			</select> <br> <input type="submit" name="登录" value="登录"> <input
				type="reset" name="重置" value="重置">
		</form>
	</center>
</body>
</html>