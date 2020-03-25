<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改教师信息</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/foundation.min.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/foundation.min.js"></script>
<script src="../js/modernizr.js"></script>
</head>
<body>
	<%
	String num = request.getParameter("num");
	Teacher tea = DAOFactory.getTeacherDAOInstance().findTeacherByNum(num);
%>
	<center>
		<br>
		<button type="button" class="button success">编辑教师信息</button>
		<hr>
		<div class="row">
			<div class="medium-12 columns">
				<div class="panel">
					<form name="editStuform" method="post"
						action="/ZFEduSystem/UpdateServlet">
						<input name="operation" type="hidden" id="operation" value="edit">
						<table width="35%" height="250" border="1">
							<tr>
								<td align="center">工号：<label> <input name="num"
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
								<td align="center">生日： <label> <input
										name="birthday" type="text" id="birthday"
										value="<%=tea.getBirthday() %>">
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
								<td align="center">学院： <label> <input
										name="college" type="text" id="college"
										value="<%=tea.getCollege()%>"></label></td>
							</tr>
							<tr>
								<td align="center">班级： <label> <input name="grade"
										type="text" id="grade" value="<%=tea.getGrade()%>"></label></td>
							</tr>
						</table>
						<input type="hidden" name="type" value="tea"> <input
							type="submit" name="提交" value="提交"> <input type="reset"
							name="重置" value="重置">
					</form>

				</div>
			</div>
	</center>
</body>
</html>