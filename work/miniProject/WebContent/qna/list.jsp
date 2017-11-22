<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="navi" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QNA 목록</title>
<%@ include file="/include/basicInclude.jsp"%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/mainLayout.css"
	type="text/css">
</head>
<body>
	<div>
		<img alt="full screen background image"
			src="${pageContext.request.contextPath}/img/freeBoard/freeBoard.jpg"
			id="full-screen-background-image" />

	</div>

	<div class="header">
		<c:import url="/include/topMenu.jsp" />
	</div>

	<div class="content">
		<div id="wrapper">
			<div class="panel panel-default">
			  <div class="panel-heading">QNA</div>
			  <div class="panel-heading">전체 ${pageResult.count}개</div>
				<div align="center">
					<table class="table">
						<tbody>
							<tr>
								<td>글번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>작성일자</td>

							</tr>
							<c:forEach var="qna" items="${list}">
								<tr>
									<td>${qna.no}</td>
									<td><a href="${pageContext.request.contextPath}/qna/detail?no=${qna.no}">${qna.title}</a>
										<c:if test="${qna.qnabDay < 1}">
											<img alt="" src="../image/qna/new.gif">
										</c:if></td>

									<td>${qna.writer}</td>
									<td><fmt:formatDate value="${qna.regDate}" pattern="yyyy년 MM월 dd일 HH시mm분ss초" /></td>
								</tr>
								<c:if test="${not empty qna.anComment}">

									<tr>
										<td></td>
										<td><img alt="" src="../image/qna/reple.gif"> <a
											href="${pageContext.request.contextPath}/qna/answerDetail?no=${qna.no}">${qna.title}에
												대한 답글 입니다.</a> <c:if test="${qna.aqnabDay < 1}">
												<img alt="" src="../image/qna/new.gif">
											</c:if></td>
										<td>admin</td>
										<td><fmt:formatDate value="${qna.anRegDate}"
												pattern="yyyy년 MM월 dd일 HH시mm분ss초" /></td>
									</tr>
								</c:if>
							</c:forEach>
						</tbody>
					</table>
					<navi:qnapage data="${pageResult}" />
				</div>
				<c:if test="${not empty user}">
					<div align="center">
						<form action="${pageContext.request.contextPath}/qna/writeform">
							<button class="btn btn-info customWriteButton">글쓰기</button>
						</form>
					</div>
				</c:if>
				<div class="bottom">
					<c:import url="/include/bottom.jsp" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>