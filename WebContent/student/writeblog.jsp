<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新建博文</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../css/foundation.min.css">
<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet" href="../css/font-awesome.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/foundation.min.js"></script>
<script src="../js/vendor/modernizr.js"></script>
<script src="../js/popper.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</head>
<body background="img/bg.jpg">
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<center>
				<button type="button" class="button">新建博文</button>
				<form action="/ZFEduSystem/AddBlogServlet" method="post">
					标题<input type="text" placeholder="请输入标题" name="title"> 内容
					<textarea name="body" type="text" rows="10" cols="30"
						placeholder="请输入内容"></textarea>
					日期<input type="text" name="date"> <input
						class="button tiny round" type="submit" value="发布"> <input
						class="button tiny round" type="reset" value="丢弃"> <input
						type="hidden" name="num" value="<%=session.getAttribute("num")%>">
				</form>
			</center>
		</div>
	</div>

</body>
</html>