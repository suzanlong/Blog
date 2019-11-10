<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图片显示</title>

<script src="js/jquery-3.4.1.min.js" charset="UTF-8"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<script src="js/bootstrap.min.js" charset="utf-8"></script>

</head>
<body>
		<div class="row" >
		<div class="col-md-11 " >
			<div class="panel panel-default" >
				<div class="panel-heading" >
					<div style="text-align:center;font:bold 25px 宋体"></div>
					<div style="text-align:right;font:bold 15px 宋体">
						最后编辑时间：<fmt:formatDate value="${blog.createtime }" pattern="yyyy-MM-dd"/><br><br>
						
 						<a href="${pageContext.request.contextPath }/picChange.action?id=${blog.id }">
							<button type="button" class="btn btn-success">修改</button>
						</a>
						<a href="${pageContext.request.contextPath }/picDelete.action?id=${blog.id }">
							<button type="button" class="btn btn-danger">删除</button>
						</a>
					</div>
				</div>
				<div class="panel-body" >
						<c:forEach items="${allPicList}" var="picItems">
							<c:if test="${picItems !=null}">
								<img src="/pic/${picItems}" height=600/>
								<br/>
							</c:if>
						</c:forEach>

					<br>${blog.contexts }<br><br><br>
				</div>
			</div>

			
		</div>
	</div>
</body>
</html>