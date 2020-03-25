<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生列表</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/foundation.min.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/foundation.min.js"></script>
<script src="../js/modernizr.js"></script>
</head>
<body>
	<center>
		<button type="button" class="button">学生列表</button>
	</center>
	<form action="searchStu.jsp" method="post">
		<div class="row">
			<div class="large-6 columns">
				<div class="row collapse postfix-round">
					<div class="small-9 columns">
						<input type="text" name="search" placeholder="请输入搜索姓名或学号以搜索">
					</div>
					<div class="small-3 columns">
						<input type="submit" class="button postfix" value="搜索">
					</div>
				</div>
			</div>
		</div>
	</form>
	<!-- <div align="right">
<form action="searchStu.jsp" method="post"><input type="text" name="search"><input type="submit" class="button info tiny round" value="搜索"></form>
</div> -->
	<center>
		<button class="button tiny round"
			onclick="document.getElementById('text').style.display='none'">隐藏</button>
		<button class="button tiny round"
			onclick="document.getElementById('text').style.display='block'">显示</button>
		<table width="95%" height="125" border="1" id="text"
			style="table-layout: fixed">
			<thead>
				<tr>
					<th width="15%" scope="col">学号</th>
					<th width="15%" scope="col">姓名</th>
					<th width="15%" scope="col">生日</th>
					<th width="15%" scope="col">性别</th>
					<th width="15%" scope="col">专业</th>
					<th width="15%" scope="col">学院</th>
					<th width="15%" scope="col">班级</th>
					<th width="15%" scope="col">编辑</th>
					<th width="15%" scope="col">删除</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Student> list = new ArrayList<Student>();
				list = DAOFactory.getStudentDAOInstance().listAllStu();
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Student stu = (Student)iterator.next();
			%>
				<tr>
					<td align="center"><%=stu.getNum()%></td>
					<td align="center"><%=stu.getName()%></td>
					<td align="center"><%=stu.getBirthday()%></td>
					<td align="center"><%=stu.getSex() %></td>
					<td align="center"><%=stu.getMajor()%></td>
					<td align="center"><%=stu.getCollege()%></td>
					<td align="center"><%=stu.getGrade()%></td>
					<td align="center"><input type="button" align="right"
						class="button tiny round" value="编辑"
						onClick="location.href='/ZFEduSystem/admin/editStu.jsp?num=<%=stu.getNum()%>'"></td>
					<td align="center"><a class="button tiny round"
						href="/ZFEduSystem/admin/delStu.jsp?num=<%=stu.getNum()%>"
						onclick='return window.confirm("该用户将被删除，\n您确实要删除用户吗？")'>删除</a></td>
				</tr>
				<%
				}
			%>
			</tbody>
		</table>
	</center>
</body>
</html>