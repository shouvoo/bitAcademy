<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	#writeContents
	{
		resize: none;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QNA 답글</title>
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
			</tbody>
		</table>

		<form action="${pageContext.request.contextPath}/qna/answer" method="post">
		<br>
		<div>
			<h3>
				답글내용
			</h3>
			<input type="hidden" name="no" value="${qna.no}">
		</div>
		<div>
		<table class="table">
			<tbody>
				
				<tr>
					<th>내용 :</th>
					<td>
					<textarea id="writeContents" cols="80" rows="6" name="anComment">${qna.anComment}</textarea>
					</td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
					<button type="submit" >등록</button>
					</td>
				</tr>
			</tbody>
		</table>
		</div>
		
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