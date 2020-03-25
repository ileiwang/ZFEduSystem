<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教师详细页</title>
<style type="text/css">
a {
	color: blue;
	font-size: 15pt;
	margin: 15px;
}
</style>
</head>
<body>
	<center>
		<font size="10px" color="blue"><script type="text/javascript">document.write("搜索结果")</script></font>
	</center>
	<hr>
	<center>
		<center>
			<button
				onclick="document.getElementById('text').style.display='none'">隐藏</button>
			<button
				onclick="document.getElementById('text').style.display='block'">显示</button>
			<table width="95%" height="125" border="1" id="text"
				style="table-layout: fixed">
				<tr>
					<th width="15%" height="46" scope="col">学号</th>
					<th width="15%" height="46" scope="col">姓名</th>
					<th width="15%" height="46" scope="col">生日</th>
					<th width="15%" height="46" scope="col">性别</th>
					<th width="15%" scope="col">所授专业</th>
					<th width="15%" scope="col">所属学院</th>
					<th width="15%" scope="col">授课班级</th>
					<th width="15%" scope="col">编辑</th>
					<th width="15%" scope="col">删除</th>
				</tr>
				<%
					String num = (String)request.getParameter("search");
					Teacher tea = (Teacher)DAOFactory.getTeacherDAOInstance().findTeacherByNum(num);
			%>
				<tr>
					<td align="center"><%=tea.getNum()%></td>
					<td align="center"><%=tea.getName()%></td>
					<td align="center"><%=tea.getBirthday()%></td>
					<td align="center"><%=tea.getSex()%></td>
					<td align="center"><%=tea.getMajor()%></td>
					<td align="center"><%=tea.getCollege()%></td>
					<td align="center"><%=tea.getGrade()%></td>
					<td align="center"><input type="button" align="right"
						value="编辑"
						onClick="location.href='/ZFEduSystem/admin/editTea.jsp?num=<%=tea.getNum()%>'"></td>
					<td align="center"><a
						href="/ZFEduSystem/admin/delTea.jsp?num=<%=tea.getNum()%>"
						onclick='return window.confirm("确定删除该教师吗？")'>删除</a></td>
				</tr>
			</table>
		</center>
</body>
</html>