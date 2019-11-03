<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>博客列表展示</title>
<style>
	a{
		text-decoration:none;
	}
</style>

</head>
	<body style="background:url(images/backgroud.png);
	background-repeat:no-repeat;
	background-size:100% 100%; 
	background-attachment: fixed;">
	
	<table width="600"  align="center" cellpadding="0" cellspacing="0" >
		<tr><td>
		<div style="text-align:right;">make by suzanlong</div>
		<div style="float:right">
		<a href="${pageContext.request.contextPath }/insertItems.action">
			<button >新增</button>
		</a>
		</div>
		<ul>
			<c:forEach items="${itemsList }" var="item">
			<li><a href="${pageContext.request.contextPath }/blogmain.action?id=${item.id }"
					 style="font:bold 25px 宋体;color:black;text-align:center;">${item.title }</a>
		</c:forEach>
		</ul>
	</td></tr></table>
</body>
</html>