<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>删除管理员信息</title>
</head>
<body>
	<center>
		<font size="10px" color="blue"><script type="text/javascript">document.write("修改学生信息")</script></font>
	</center>
	<hr>

	<%
	String num = request.getParameter("num");
	Admin stu = DAOFactory.getAdminDAOInstance().findAdminByNum(num);
%>
	<center>
		<hr>
		<table width="35%" height="250" border="1">
			<tr>
				<td align="center">学号：<label> <input name="num"
						type="text" id="num" value="<%=num%>" readonly="true">
				</label>
				</td>
			</tr>
			<tr>
			<tr>
				<td align="center">姓名： <label> <input name="name"
						type="text" id="name" value="<%=stu.getName() %>">
				</label></td>
			</tr>
			<tr>
				<td align="center">生日： <label> <input name="birthday"
						type="text" id="birthday" value="<%=stu.getBirthday() %>"></label></td>
			</tr>
			<tr>
				<td align="center">性别： <label> <input name="sex"
						type="text" id="sex" value="<%=stu.getSex()%>"></label></td>
			</tr>
		</table>
		<form name="deleteAdminform" action="/ZFEduSystem/DeleteServlet"
			method="post">
			<input type="hidden" name="type" value="admin"> <input
				type="hidden" name="num" value="<%=stu.getNum() %>"> <input
				type="submit" name="提交" value="确定删除">
		</form>
	</center>
</body>
</html>