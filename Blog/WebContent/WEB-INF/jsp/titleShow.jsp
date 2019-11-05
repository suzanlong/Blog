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
			background-attachment: fixed;"  >


	<div class="row">
		<div class="col-md-2 col-md-offset-1" >
			<br><br><br><br>
			<a href="${pageContext.request.contextPath }/insertItems.action">
				<button type="button" class="btn btn-success">新增</button>
			</a><br><br>
			<ul class="list-group">
				<c:forEach items="${itemsList }" var="item">
				<a class="list-group-item" href="${pageContext.request.contextPath }/blogmain.action?id=${item.id }"
						 style="font:bold 17px 宋体;color:black;text-align:center;">${item.title }</a>
			</c:forEach>
			</ul>
		</div>
		<br><br>
		<div class="col-md-6" >
			<jsp:include page="Items.jsp"/>
		</div>
	</div>
	
	
</body>
</html>