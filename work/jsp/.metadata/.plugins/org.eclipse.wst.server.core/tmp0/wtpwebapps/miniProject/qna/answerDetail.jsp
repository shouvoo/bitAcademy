<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<title>QNA 답글 상세</title>
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
		<table class="table">
			<tbody>
				<tr>
					<th>날짜 :</th>
					<td><fmt:formatDate value="${qna.anRegDate}" pattern="yyyy년 MM월 dd일 HH시mm분ss초" /></td>
				</tr>
				<tr>
					<th>내용 :</th>
					<td><textarea disabled="disabled" id="writeContents" rows="5" cols="95">${qna.anComment}</textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
					<c:if test="${user.getId() eq 'admin'}">
						<a href="${pageContext.request.contextPath}/qna/answermodifyform?no=${qna.no}">답글수정</a>
					</c:if>
					<a href="${pageContext.request.contextPath}/qna/detail?no=${qna.no}">원글보기</a></td>
				</tr>
			</tbody>
		</table>
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