<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="cc.ileiwang.zfedusystem.vo.*"
	import="java.util.*"%>

<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory"></jsp:useBean>
<%
	
%>
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
	<center>
		<button type="button" class="button">博文列表</button>
	</center>
	<form action="searchStu.jsp" method="post">
		<div class="row">
			<div class="large-6 columns">
				<div class="row collapse postfix-round">
					<div class="small-9 columns">
						<input type="text" name="search" placeholder="请输入搜索姓名或文章标题">
					</div>
					<div class="small-3 columns">
						<input type="submit" class="button postfix" value="搜索">
					</div>
				</div>
			</div>
		</div>
	</form>

	<center>
		<button class="button tiny round"
			onclick="document.getElementById('text').style.display='none'">隐藏</button>
		<button class="button tiny round"
			onclick="document.getElementById('text').style.display='block'">显示</button>
		<table width="95%" height="125" border="1" id="text"
			style="table-layout: fixed">
			<thead>
				<tr>
					<th width="15%" scope="col">标题</th>
					<th width="15%" scope="col">内容</th>
					<th width="15%" scope="col">日期</th>
					<th width="15%" scope="col">编辑</th>
					<th width="15%" scope="col">删除</th>
				</tr>
			</thead>
			<tbody>
				<%
					String num = (String)session.getAttribute("num");
					List<Blog> list = new ArrayList<Blog>();
					list = DAOFactory.getBlogDAOInstance().listAllByNum(num);
					Iterator iterator = list.iterator();
					while (iterator.hasNext()) {
						Blog blog = (Blog) iterator.next();
				%>
				<tr>
					<td align="center"><%=blog.getTitle()%></td>
					<td align="center"><%=blog.getBody()%></td>
					<td align="center"><%=blog.getDate()%></td>
					<td align="center"><input type="button" align="right"
						class="button tiny round" value="编辑"
						onClick="location.href='/ZFEduSystem/admin/editStu.jsp?num=<%=blog.getNum()%>'"></td>
					<td align="center"><a class="button tiny round"
						href="/ZFEduSystem/admin/delStu.jsp?num=<%=blog.getNum()%>"
						onclick='return window.confirm("该博文将被删除，\n您确实要删除博文吗？")'>删除</a></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</center>



</body>
</html>