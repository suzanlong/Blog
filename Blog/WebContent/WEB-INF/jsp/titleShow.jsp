<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>博客列表展示</title>
<!-- bootstrap.min.js框架的引用 -->
<script src="js/jquery-3.4.1.min.js" charset="UTF-8"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<script src="js/bootstrap.min.js" charset="utf-8"></script>


</head>
	<body style="background:url(images/backgroud.png);
			background-repeat:no-repeat;
			background-size:100% 100%; 
			background-attachment: fixed;
			height:100%;"  >

	<nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="text-align: center;">
		
		<ul class="nav navbar-nav navbar-center" style="display: inline-block;float: none;">
			<li class="active"><a href="${pageContext.request.contextPath }/titleShow.action">文字博客</a></li>
			<li><a href="${pageContext.request.contextPath }/pic.action">图片日志</a></li>
		</ul>
		
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#"><span class="glyphicon glyphicon-user"></span> 注册</a>
			<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登陆</a>
		</ul>
		
	</nav>
	<br><br><br>
	
		<div class="row">
			<div class="col-md-2 col-md-offset-1" >
				<br><br><br><br>
				<a href="${pageContext.request.contextPath }/insertItems.action">
					<button type="button" class="btn btn-success">新增</button>
				</a><br><br>
				<div class="row" style="overflow-x:auto;overflow-y:auto;height:500px">
					<ul class="list-group">
					<c:forEach items="${itemsList }" var="item">
						<a class="list-group-item" href="${pageContext.request.contextPath }/blogmain.action?id=${item.id }"
								 style="font:bold 17px 宋体;color:black;text-align:center;">${item.title }</a>
					</c:forEach>
					</ul>
				</div>
			</div>
			<br><br>
			<div class="col-md-6" style="overflow-x:auto;overflow-y:auto;height:600px">
				<jsp:include page="Items.jsp"/>
			</div>
			<div class="col-md-2">
				<jsp:include page="myblog.html"/>
			</div>
		</div>
	
</body>
</html>