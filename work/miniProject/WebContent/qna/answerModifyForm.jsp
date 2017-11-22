<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
	#writeContents
	{
		resize: none;
	}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QNA 답글 수정</title>
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
	  	<form action="${pageContext.request.contextPath}/qna/answermodify" method="post">
		<table>
			<tbody>
			
				<tr>
					<th>날짜 :</th>
					<td><input type="hidden" name="anregDate" value="${qna.anRegDate}"/> ${qna.anRegDate}</td>
				</tr>
				<tr>
					<th>내용 :</th>
					<td><textarea name="anComment" id="writeContents" rows="5" cols="95">${qna.anComment}</textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
					<input type="hidden" name="no" value="${qna.no}">
					<button>수정완료</button>
					
					</td>
				</tr>
			</tbody>
		</table>
	  	</form>
		</div>
	<div class="bottom">
		<c:import url="/include/bottom.jsp" />
	</div>
</div>
</div>
</div>
</div>
</body>
</html>