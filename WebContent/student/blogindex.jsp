<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="cc.ileiwang.zfedusystem.vo.*"%>

<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory"></jsp:useBean>
<%  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人博客</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/ZFEduSystem/css/foundation.min.css">
<link rel="stylesheet" href="/ZFEduSystem/css/bootstrap.min.css">
<link rel="stylesheet" href="/ZFEduSystem/css/font-awesome.css">
<script src="/ZFEduSystem/js/jquery.min.js"></script>
<script src="/ZFEduSystem/js/foundation.min.js"></script>
<script src="/ZFEduSystem/js/vendor/modernizr.js"></script>
<script src="/ZFEduSystem/js/popper.min.js"></script>
<script src="/ZFEduSystem/js/bootstrap.min.js"></script>
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
			<strong><%=name %></strong>的博客
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
				class="fi-home"></i>博客首页</a></li>
		<li><a data-toggle="tooltip" data-placement="bottom" title="所有博文"
			href="/ZFEduSystem/student/bloglist.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-torso"></i>所有博文</a></li>
		<li><a data-toggle="tooltip" data-placement="bottom" title="新博文"
			href="/ZFEduSystem/student/writeblog.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-magnifying-glass"></i>新博文</a></li>
		<li><a data-toggle="tooltip" data-placement="bottom" title="博文管理"
			href="/ZFEduSystem/student/blogindex.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-magnifying-glass"></i>博文管理</a></li>
	</ul>
	</section> </nav>
	<!-- <h3><a href="viewScore.jsp">查询成绩</a></h3>
<h3><a href="viewCourse.jsp">查询课表</a></h3>
<h3><a href="changePass.jsp">修改密码</a></h3>
<h3><a href="blogindex.jsp">进入博客</h3> -->

	</center>
</body>
</html>