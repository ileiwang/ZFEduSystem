<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改学生信息</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/foundation.min.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/foundation.min.js"></script>
<script src="../js/modernizr.js"></script>
</head>
<body>
	<center>
		<font size="10px" color="blue"><script type="text/javascript">document.write("修改学生信息")</script></font>
	</center>

	<%
	String num = request.getParameter("num");
	Student stu = DAOFactory.getStudentDAOInstance().findStuByNum(num);
%>
	<center>
		<form name="editStuform" method="post"
			action="/ZFEduSystem/UpdateServlet">
			<input name="operation" type="hidden" id="operation" value="edit">
			<table width="35%" height="250" border="1">
				<tbody>
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
								type="text" id="birthday" value="<%=stu.getBirthday() %>">
						</label></td>
					</tr>
					<tr>
						<td align="center">性别： <label> <input name="sex"
								type="text" id="sex" value="<%=stu.getSex()%>">
						</label></td>
					</tr>
					<tr>
						<td align="center">专业： <label> <input name="major"
								type="text" id="major" value="<%=stu.getMajor()%>"></label></td>
					</tr>
					<tr>
						<td align="center">学院： <label> <input name="college"
								type="text" id="college" value="<%=stu.getCollege()%>"></label></td>
					</tr>
					<tr>
						<td align="center">班级： <label> <input name="grade"
								type="text" id="grade" value="<%=stu.getGrade()%>"></label></td>
					</tr>
				</tbody>
			</table>
			<input type="hidden" class="button tiny round" name="type"
				value="stu"> <input type="submit" class="button tiny round"
				name="提交" value="提交"> <input type="reset"
				class="button tiny round" name="重置" value="重置">
		</form>
	</center>
</body>
</html>