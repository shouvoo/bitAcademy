<%@page import="java.text.SimpleDateFormat"%>
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

<div class="container">	
	<div class="header">
		<c:import url="/include/topMenu.jsp"></c:import><!-- 외부사이트를 인클루드 할수있음 -->
	</div>
	
	<div class="content">
		<table>
		<tbody>
			<tr>
				<th>번호</th>
				<td><c:out value="${board.no}"/></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><c:out value="${board.title}"/></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><c:out value="${board.content}"/></td>
			</tr>
			<tr>
				<th>등록일시</th>
				<td><c:out value="${board.regDate}"/></td>
			</tr>
			<c:forEach items="${fileBoard}" var="fileBoard">
				<tr>
					<th>파일이름</th>
					<td><a href="${pageContext.request.contextPath}/common/down?filePath=${fileBoard.filePath}&sName=${fileBoard.systemName}&dName=${fileBoard.oriName}"><c:out value="${fileBoard.oriName}"/></a></td>
				</tr>
			</c:forEach>
		</tbody>	
	</table>
	
	<form method="post" action="${pageContext.request.contextPath}/board/writecomment.do">
		<table>
			<tbody>
				<tr>
					<input type="hidden" name="no" value="${board.no}" />
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
		
	<a href="${pageContext.request.contextPath}/board/list.do">목록</a>
	<a href="${pageContext.request.contextPath}/board/modifyform.do?no=${board.no}">수정</a>
	<a href="${pageContext.request.contextPath}/board/delete.do?no=${board.no}">삭제</a> 
	
	
	<table border=1>
		<tbody>
				<tr>
					<th>번호</th>
					<th>작성자</th>
					<th>내용</th>
					<th>등록일시</th>
				</tr>
				<c:forEach items="${commnetBoard}" var="comment">
				<tr>
					<td><c:out value="${comment.no}"/></td>
					<td><c:out value="${comment.writer}"/></td>
					<td><c:out value="${comment.content}"/></td>
					<td><c:out value="${comment.regDate}"/></td>
					<td><a href="${pageContext.request.contextPath}/board/commentmodifyform.do?no=${comment.no}&commentNo=${comment.commentNo}">수정</a></td>
					<td><a href="${pageContext.request.contextPath}/board/commentdelete.do?no=${comment.no}&commentNo=${comment.commentNo}">삭제</a></td> 
				</tr>
				</c:forEach>
				<tr>
					<c:if test="${empty commnetBoard}">
						<h1>댓글이 존재하지 않습니다!!!</h1>
					</c:if>
				</tr>
		</tbody>	
	</table>
	</div>
	
	<div class="footer">
		<c:import url="/include/footer.jsp"></c:import>
	</div>
	
</div>


	
	
	
</body>
</html>













