<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>删除教师</title>
</head>
<body>
	<center>
		<font size="10px" color="blue"><script type="text/javascript">document.write("删除教师")</script></font>
	</center>
	<hr>

	<%
	String num = request.getParameter("num");
	Teacher tea = DAOFactory.getTeacherDAOInstance().findTeacherByNum(num);
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
						type="text" id="name" value="<%=tea.getName() %>">
				</label></td>
			</tr>
			<tr>
				<td align="center">生日： <label> <input name="birthday"
						type="text" id="birthday" value="<%=tea.getBirthday() %>">
				</label></td>
			</tr>
			<tr>
				<td align="center">性别： <label> <input name="sex"
						type="text" id="sex" value="<%=tea.getSex()%>">
				</label></td>
			</tr>
			<tr>
				<td align="center">专业： <label> <input name="major"
						type="text" id="major" value="<%=tea.getMajor()%>"></label></td>
			</tr>
			<tr>
				<td align="center">学院： <label> <input name="college"
						type="text" id="college" value="<%=tea.getCollege()%>"></label></td>
			</tr>
			<tr>
				<td align="center">班级： <label> <input name="grade"
						type="text" id="grade" value="<%=tea.getGrade()%>"></label></td>
			</tr>
		</table>
		<form name="deleteStuform" method="post"
			action="/ZFEduSystem/DeleteServlet">
			<input type="hidden" name="type" value="tea"> <input
				type="hidden" name="num" value="<%=tea.getNum() %>"> <input
				type="submit" name="提交" value="确定删除">
		</form>
	</center>
</body>
</html>