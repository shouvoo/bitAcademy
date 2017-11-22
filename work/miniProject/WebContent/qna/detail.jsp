<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QNA 상세</title>

<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" type="text/css">

<style type="text/css">
	#writeContents
	{
		resize: none;
	}
</style>

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
					<th>글번호 : </th>
					<td>${qna.no}</td>
				</tr>
				<tr>
					<th>제목 :</th>
					<td>${qna.title}</td>
				</tr>
				<tr>
					<th>글쓴이 :</th>
					<td>${qna.writer}</td>
				</tr>
				<tr>
					<th>날짜 :</th>
					<td><fmt:formatDate value="${qna.regDate}" pattern="yyyy년 MM월 dd일 HH시mm분ss초" /></td>
				</tr>
				<tr>
					<th>내용 :</th>
					<td><textarea disabled="disabled" id="writeContents" rows="5" cols="95">${qna.content}</textarea></td>
				</tr>
				
				<tr>
					<td colspan="2" align="right">
					<a href="${pageContext.request.contextPath}/qna/list">목록</a>
					<c:if test="${user.getId() eq 'admin'}">
					<c:choose>
					<c:when test="${empty qna.anComment}">
					<a href="${pageContext.request.contextPath}/qna/answerForm?no=${qna.no}">답글</a>
					</c:when>
					<c:otherwise>
					<a href="${pageContext.request.contextPath}/qna/answerForm?no=${qna.no}">답글수정</a>
					</c:otherwise>
					</c:choose>
					</c:if>
					<c:if test="${user.getId() eq qna.writer}">
					<a href="${pageContext.request.contextPath}/qna/modifyForm?no=${qna.no}">수정</a>
					<a href="${pageContext.request.contextPath}/qna/delete?no=${qna.no}">삭제</a>
					</c:if>
					</td>
					
				</tr>
			</tbody>
		</table>
	
	<br>
	<c:if test="${not empty qna.anComment}">
		<div>
			<h3>
				답글내용
			</h3>
		</div>
		<div>
		<table class="table">
			<tbody>
				<tr>
					<th>날짜 :</th>
					<td>
					<fmt:formatDate value="${qna.anRegDate}" pattern="yyyy년 MM월 dd일 HH시mm분ss초" />
					</td>
				</tr>
				<tr>
					<th>내용 :</th>
					<td>
					<textarea disabled="disabled" id="writeContents" rows="5" cols="95">${qna.anComment}</textarea>
					</td>
				</tr>
			</tbody>
		</table>
		</div>
	</c:if>
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