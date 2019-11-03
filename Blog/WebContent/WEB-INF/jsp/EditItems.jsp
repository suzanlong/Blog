<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>修改博客</title>
</head>
<body style="background:url(images/backgroud.png);
	background-repeat:no-repeat;
	background-size:100% 100%;
	background-attachment: fixed;">
	<table width="600" align="center" cellpadding="0" cellspacing="0" >
		<tr><td>
		<form id="itemForm" action="${pageContext.request.contextPath }/editItems.action?id=${items.id }"
			method="post">
			
			<div style="text-align:center;">
				<input type="text" name="title" value="${items.title }"/>
				<input type="submit" value="提交" /><br><br><br>
			</div>

			<div style="text-align:center;">
				<textarea name="contexts" cols="100" rows="40">${items.contexts }</textarea>
			</div>
			
		</form>
	</td></tr></table>
</body>
</html>