<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改博客</title>

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
			<form id="itemForm" action="${pageContext.request.contextPath }/editItems.action?id=${items.id }"
				method="post">
				
				<div style="text-align:center;"  >
					<div class="col-md-6 col-md-offset-3">
					<input type="text" name="title" class="form-control" value="${items.title }"/>
					</div>
					<input type="submit" value="提交" class="btn btn-success"/><br><br><br>
				</div>
				
				<div class="panel panel-success">
					<div class="panel-heading">
						正文
					</div>
					<div class="panel-body">
						<textarea name="contexts" rows="24" class="form-control">${items.contexts }</textarea>
					</div>
				</div>
				
			</form>
		</div>
	</div>
</body>
</html>