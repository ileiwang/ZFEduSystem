<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="cc.ileiwang.zfedusystem.vo.*"%>

<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory"></jsp:useBean>
<%  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生主界面</title>
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
<body style="padding-top: 10px;">
	<%
	String num = (String)session.getAttribute("num");
	Student stu = DAOFactory.getStudentDAOInstance().findStuByNum(num);
	String name = stu.getName();
	String base = "/ZFEduSystem/student/";
%>
	<%-- <div align="right"><h5>欢迎<strong><%=name %></strong>同学！</h5></div> --%>
	<center>
		<button type="button" class="button">
			欢迎<strong><%=name %></strong>同学！
		</button>
	</center>
	<div align="right">
		<form action="LogoutServlet" method="post">
			<input class="button tiny round" type="hidden" name="operation"
				value="logout"> <input class="button tiny round"
				type="submit" name="submit" value="注销">
		</form>
	</div>
	<nav class="top-bar" data-topbar> <section
		class="top-bar-section">
	<ul class="right">
		<li class="active"><a data-toggle="tooltip"
			data-placement="bottom" title="主页" href="#"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-home"></i>主页</a></li>
		<li><a data-toggle="tooltip" data-placement="bottom" title="查询成绩"
			href="/ZFEduSystem/student/viewScore.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-torso"></i>成绩查询</a></li>
		<li><a data-toggle="tooltip" data-placement="bottom" title="查询课表"
			href="/ZFEduSystem/student/viewCourse.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-magnifying-glass"></i>课表查询</a></li>
		<li><a data-toggle="tooltip" data-placement="bottom" title="进入博客"
			href="/ZFEduSystem/student/blogindex.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-magnifying-glass"></i>个人博客</a></li>
		<li><a data-toggle="tooltip" data-placement="bottom" title="帐号管理"
			href="/ZFEduSystem/student/changePass.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-magnifying-glass"></i>帐号管理</a></li>
	</ul>
	</section> </nav>
	<!-- <h3><a href="viewScore.jsp">查询成绩</a></h3>
<h3><a href="viewCourse.jsp">查询课表</a></h3>
<h3><a href="changePass.jsp">修改密码</a></h3>
<h3><a href="blogindex.jsp">进入博客</h3> -->

	</center>
</body>
</html>