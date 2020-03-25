<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="cc.ileiwang.zfedusystem.vo.*"%>

<jsp:useBean id="DAOFactory"
	class="cc.ileiwang.zfedusystem.factory.DAOFactory"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生-修改密码</title>
</head>

<script type="text/javascript">
function fun(f)
{
	if(f.password==f.repassword)
		{
			return true;
		}
	else
		{
			return false;
			alert("两次输入端密码不同，请重新输入！");
		}
}

</script>
<body background="/ZFEduSystem/img/bg.jpg">
	<center>
		<form action="changePass.jsp" method="post"
			onsubmit="return fun(this)">
			学号：<input type="text" name="num"><br> 原密码:<input
				type="password" name="oldpassword"><br> 新密码：<input
				type="password" name="password"><br> 再次输入：<input
				type="password" name="repassword"><br> <input
				type="submit" name="修改" value="修改"> <input type="reset"
				name="重置" value="重置">
		</form>
	</center>

	<%
		String num = request.getParameter("num");
	%>

	<h3><%=num %></h3>
</body>
</html>