<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List,java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>找回成功</title>
</head>
<% request.setCharacterEncoding("utf-8");%>
<body background="img/bg.jpg">
	<%String pass = request.getParameter("pass"); %>
	<center>
		<h2>
			<font color="red" size="16px">恭喜，找回成功！</font>
		</h2>
	</center>
	<center>
		<h2>
			你的密码为：<%=pass %></h2>
		<h3>
			<a href="/ZFEduSystem/login.jsp">重新登录</a>
		</h3>
	</center>
</body>
</html>