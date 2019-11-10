<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图片博客修改</title>
<script src="js/jquery-3.4.1.min.js" charset="UTF-8"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<script src="js/bootstrap.min.js" charset="utf-8"></script>

</head>
<body style="background:url(images/backgroud.png);
			background-repeat:no-repeat;
			background-size:100% 100%; 
			background-attachment: fixed;">

	<div class="row">
		<br><br>
		<div class="col-md-6 col-md-offset-3" >
			<form id="itemForm" action="${pageContext.request.contextPath }/picChangeSubmit.action?id=${blog.id }"
				method="post" enctype="multipart/form-data">
				
				<div style="text-align:center;"  >
					<div class="col-md-6 col-md-offset-3">
					</div>
					<input type="submit" value="提交" class="btn btn-success"/><br><br><br>
				</div>
				
				<div class="panel panel-success">
					<div class="panel-heading">
						正文
					</div>
					<div class="panel-body">
						<input type="file"  name="allpic_pic"/>
						<c:forEach items="${allPicList}" var="picItems">
							<c:if test="${picItems !=null}">
								<img src="/pic/${picItems}" height=600/>
								<br/>
							</c:if>
						</c:forEach>
						<textarea name="contexts" rows="24" class="form-control">${blog.contexts }</textarea>
					</div>
				</div>
				
			</form>
		</div>
	</div>
</body>
</html>