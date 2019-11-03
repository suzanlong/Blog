<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>苏赞隆的博客</title>
</head>
<body style="background:url(images/backgroud.png);
	background-repeat:no-repeat;
	background-size:100% 100%; 
	background-attachment: fixed;">
	<table width="600" align="center" cellpadding="0" cellspacing="0" >
		<tr><td>
			<div style="text-align:right;">make by suzanlong</div>
			<div style="text-align:center;font:bold 25px 宋体">${item.title }</div>
			<div style="text-align:right;font:bold 15px 宋体">
			最后编辑时间：<fmt:formatDate value="${item.createtime }" pattern="yyyy-MM-dd"/><br><br>
			
			<a href="${pageContext.request.contextPath }/editItemsSubmit.action?id=${item.id }">
				<button>修改</button>
			</a>
			<a href="${pageContext.request.contextPath }/deleteItems.action?id=${item.id }">
				<button>删除</button>
			</a>
			
			</div><br>&nbsp;&nbsp;&nbsp;&nbsp;${item.contexts }<br><br><br>
		</td></tr>
	</table>
	
	

</body>
</html>