<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教师列表</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/foundation.min.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/foundation.min.js"></script>
<script src="../js/modernizr.js"></script>
</head>
<body>
	<center>
		<button type="button" class="button">用户管理</button>
	</center>
	<hr>
	<div align="right">
		<form action="searchStu.jsp" method="post">
			<input type="text" name="search"><input
				class="button tiny round" type="submit" value="搜索">
		</form>
	</div>
	<center>
		<button class="button tiny round"
			onclick="document.getElementById('text').style.display='none'">隐藏</button>
		<button class="button tiny round"
			onclick="document.getElementById('text').style.display='block'">显示</button>
		<table width="95%" height="125" border="1" id="text"
			style="table-layout: fixed">
			<thead>
				<tr>
					<th width="15%" height="46" scope="col">教工号</th>
					<th width="15%" height="46" scope="col">姓名</th>
					<th width="15%" height="46" scope="col">生日</th>
					<th width="15%" height="46" scope="col">性别</th>
					<th width="15%" scope="col">授课专业</th>
					<th width="15%" scope="col">所属学院</th>
					<th width="15%" scope="col">任课班级</th>
					<th width="15%" scope="col">编辑</th>
					<th width="15%" scope="col">删除</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Teacher> list = new ArrayList<Teacher>();
				list = DAOFactory.getTeacherDAOInstance().listAllTeacher();
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Teacher tea = (Teacher)iterator.next();
			%>
				<tr>
					<td align="center"><%=tea.getNum()%></td>
					<td align="center"><%=tea.getName()%></td>
					<td align="center"><%=tea.getBirthday()%></td>
					<td align="center"><%=tea.getSex()%></td>
					<td align="center"><%=tea.getMajor()%></td>
					<td align="center"><%=tea.getCollege()%></td>
					<td align="center"><%=tea.getGrade()%></td>
					<td align="center"><input type="button"
						class="button tiny round" align="center" value="编辑"
						onClick="location.href='../admin/editTea.jsp?num=<%=tea.getNum()%>'"></td>
					<td align="center"><a class="button tiny round"
						href="../UserServlet?operation=del&name=<%=tea.getName()%>&num=<%=tea.getNum()%>"
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