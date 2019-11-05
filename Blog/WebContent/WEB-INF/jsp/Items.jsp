<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>苏赞隆的博客</title>

<script src="js/jquery-3.4.1.min.js" charset="UTF-8"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<script src="js/bootstrap.min.js" charset="utf-8"></script>



</head>
<body >
	<div class="row" >
		<div class="col-md-11 " >
			<div class="panel panel-default" >
				<div class="panel-heading" >
					<div style="text-align:center;font:bold 25px 宋体">${item.title }</div>
					<div style="text-align:right;font:bold 15px 宋体">
						最后编辑时间：<fmt:formatDate value="${item.createtime }" pattern="yyyy-MM-dd"/><br><br>
						
						<a href="${pageContext.request.contextPath }/editItemsSubmit.action?id=${item.id }">
							<button type="button" class="btn btn-success">修改</button>
						</a>
						<a href="${pageContext.request.contextPath }/deleteItems.action?id=${item.id }">
							<button type="button" class="btn btn-danger">删除</button>
						</a>
					</div>
				</div>
				<div class="panel-body">
					<br>${item.contexts }<br><br><br>
				</div>
			</div>

			
		</div>
	</div>
	

</body>
</html>