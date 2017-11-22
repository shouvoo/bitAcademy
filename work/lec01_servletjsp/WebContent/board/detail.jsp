<%@page import="java.text.SimpleDateFormat"%>
<%@page import="board.BoardDomain"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<th>번호</th>
				<td><c:out value="${board[0].no}"/></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><c:out value="${board[0].title}"/></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><c:out value="${board[0].content}"/></td>
			</tr>
			<tr>
				<th>등록일시</th>
				<td><c:out value="${board[0].regDate}"/></td>
			</tr>
		</tbody>	
	</table>
	
	<form method="post" action="${pageContext.request.contextPath}/board/writecomment">
		<table>
			<tbody>
				<tr>
					<input type="hidden" name="no" value="${board[0].no}" />
					<th>댓글 작성자 : </th>
					<td>
						<input type="text" name="writer">
					</td>
					<th>댓글 내용 : </th>
					<td>
						<input type="text" name="content">
					</td>
					<td><button type="submit">댓글 등록</button></td>
				</tr>
			</tbody>	
		</table>	
	</form>
		
	<a href="${pageContext.request.contextPath}/board/list">목록</a>
	<a href="${pageContext.request.contextPath}/board/modifyform?no=${board[0].no}">수정</a>
	<a href="${pageContext.request.contextPath}/board/delete?no=${board[0].no}">삭제</a> 
	
	
	<table border=1>
		<tbody>
				<c:forEach items="${board[1]}" var="comment">
				<tr>
					<th>번호</th>
					<td><c:out value="${comment.no}"/></td>
					<th>작성자</th>
					<td><c:out value="${comment.writer}"/></td>
					<th>내용</th>
					<td><c:out value="${comment.content}"/></td>
					<th>등록일시</th>
					<td><c:out value="${comment.regDate}"/></td>
				</tr>
				</c:forEach>
				<tr>
				<c:if test="${empty board[1]}">
					<h1>댓글이 존재하지 않습니다!!!</h1>
				</c:if>
				</tr>
		</tbody>	
	</table>
	
	
</body>
</html>













