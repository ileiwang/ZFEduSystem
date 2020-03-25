<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.List,java.util.Iterator"%>
<%@ page import="cc.ileiwang.zfedusystem.vo.*"%>
<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory" scope="application" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加成绩</title>
<script>
function fun()
{
	alert("添加成功！");
}
</script>
</head>
<% request.setCharacterEncoding("utf-8");%>
<body background="/ZFEduSystem/img/bg.jpg">
	<center>
		<form action="addScore.jsp" method="post">
			学号：<input type="text" name="num"><br> 姓名：<input
				type="text" name="name"><br> C：<input type="text"
				name="c"><br> CPP：<input type="text" name="cpp"><br>
			JAVA：<input type="text" name="java"><br> Python:<input
				type="text" name="python"><br> <input type="submit"
				name="添加" value="添加" onclick='fun()'> <input type="reset"
				name="重置" value="重置">
		</form>
	</center>

	<%
	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String  c = request.getParameter("c");
	String cpp = request.getParameter("cpp");
	String java = request.getParameter("java");
	String  python = request.getParameter("python");
	Score score = new Score(num,name,c,cpp,java,python);
	DAOFactory.getTeacherDAOInstance().addScore(score,score.getNum(),score.getName());
%>
</body>
</html>