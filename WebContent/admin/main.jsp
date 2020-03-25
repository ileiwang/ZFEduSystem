<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员首页</title>
<script type="text/javascript">
	$(document).ready(function() {
		$(".flip").click(function() {
			$(".operation").slideToggle("slow");
		});
	});
</script>

<style type="text/css">
div.operation, p.flip {
	margin: 0px;
	padding: 5px;
	text-align: center;
	background: #e5eecc;
	border: solid 1px #c3c3c3;
}

div.opeartion {
	height: 120px;
	display: none;
}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/foundation.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.css">
<script src="js/jquery.min.js"></script>
<script src="js/foundation.min.js"></script>
<script src="js/vendor/modernizr.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<!-- 	<center>
		<div class="operation">
			<a href="admin/listStu.jsp">显示所有学生</a><br> <a
				href="admin/listTea.jsp">显示所有教师</a><br> <a
				href="admin/listAdmin.jsp">显示所有管理员</a><br> <a
				href="admin/addUser.jsp">添加用户</a><br> <a
				href="admin/addCourse.jsp">添加课程</a><br>
		</div>
		<p class="flip">隐藏菜单</p>
	</center> -->

<body style="padding-top: 10px;">

	<nav class="top-bar" data-topbar> <section
		class="top-bar-section">
	<ul class="center">
		<li class="active"><a href="admin/main.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-home"></i>首页</a></li>
		<li><a href="admin/listStu.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-torso"></i>显示所有学生</a></li>
		<li><a href="admin/listTea.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-magnifying-glass"></i>显示所有教师</a></li>
		<li><a href="admin/listAdmin.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-torso"></i>显示所有管理员</a></li>
		<li><a href="admin/addUser.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-torso"></i>添加用户</a></li>
		<li><a href="admin/addCourse.jsp"
			style="text-decoration: none; font-size: 14px;"><i
				class="fi-torso"></i>添加课程</a></li>
	</ul>
	</section> </nav>
	<%
	Integer hitsCount = (Integer)application.getAttribute("hitCounter");
	if( hitsCount ==null || hitsCount == 0 ){
	 hitsCount = 1;
	}else{
	 hitsCount += 1;
	}
	application.setAttribute("hitCounter", hitsCount); 
%>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<div class="container">
			<button type="button" class="btn btn-primary" data-toggle="modal"
				data-target="#myModal">访问量</button>
			<div class="modal fade" id="myModal">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title">访问人数</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>
						<div class="modal-body"></div>
						<center>
							页面访问量为:
							<%= hitsCount%></center>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">关闭</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</center>
</body>
</html>