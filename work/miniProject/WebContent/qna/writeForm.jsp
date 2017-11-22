<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QNA 글쓰기</title>
<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" type="text/css">
</head>
<body>
<div class="container">
	<div>
	  <img alt="full screen background image" src="${pageContext.request.contextPath}/img/freeBoard/freeBoard.jpg" id="full-screen-background-image" /> 

	</div>

	<div class="header">
		<c:import url="/include/topMenu.jsp" />
	</div>

	<div class="content">
	  <div id="wrapper">
	  	<div class="panel panel-default">
	<form action="${pageContext.request.contextPath}/qna/write" method="post">
	<div>
		<table>
			<tbody>
				<tr>
					<th>제목 :</th>
					<td><input type="text" name="title"/></td>
				</tr>
				<tr>
					<th>글쓴이 :</th>
					<td>${user.getId()}</td>
				</tr>
				<tr>
					<th>내용 :</th>
					<td><textarea cols="80" rows="6" name="content"
					>내용을 입력해주세요</textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><button type="submit" >등록</button></td>
				</tr>
			</tbody>
		</table>
	</div>
	</form>
	
	<div class="bottom">
		<c:import url="/include/bottom.jsp" />
	</div>
</div>
</div>
</div>
</div>

<script type="text/javascript">
	$("ul.nav.navbar-nav > li").removeClass("active");
	$("ul.nav.navbar-nav > li:eq(3)").addClass("active");
</script>
	
</body>
</html>