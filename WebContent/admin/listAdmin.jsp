<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员列表</title>
</head>
<body>
	<center>
		<font size="10px" color="blue"><script type="text/javascript">document.write("用户管理")</script></font>
	</center>
	<hr>
	<div align="right">
		<form action="searchStu.jsp" method="post">
			<input type="text" name="search"><input type="submit"
				value="搜索">
		</form>
	</div>
	<center>
		<center>
			<button
				onclick="document.getElementById('text').style.display='none'">隐藏</button>
			<button
				onclick="document.getElementById('text').style.display='block'">显示</button>
			<table width="95%" height="125" border="1" id="text"
				style="table-layout: fixed">
				<tr>
					<th width="15%" height="46" scope="col">工号</th>
					<th width="15%" height="46" scope="col">姓名</th>
					<th width="15%" height="46" scope="col">生日</th>
					<th width="15%" height="46" scope="col">性别</th>
					<th width="15%" scope="col">编辑</th>
					<th width="15%" scope="col">删除</th>
				</tr>
				<%
				List<Admin> list = new ArrayList<Admin>();
				list = DAOFactory.getAdminDAOInstance().listAllAdmin();
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Admin admin = (Admin)iterator.next();
			%>
				<tr>
					<td align="center"><%=admin.getNum()%></td>
					<td align="center"><%=admin.getName()%></td>
					<td align="center"><%=admin.getBirthday()%></td>
					<td align="center"><%=admin.getSex()%></td>
					<td align="center"><input type="button" align="right"
						value="编辑"
						onClick="location.href='/ZFEduSystem/admin/editAdmin.jsp?num=<%=admin.getNum()%>'"></td>
					<td align="center"><a
						href="/ZFEduSystem/admin/delAdmin.jsp?num=<%=admin.getNum()%>"
						onclick='return window.confirm("确定删除吗？")'>删除</a></td>
				</tr>
				<%
				}
			%>
			</table>
		</center>
</body>
</html>