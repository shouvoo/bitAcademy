<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<div class="header">
		<c:import url="/include/topMenu.jsp" />
	</div>
	<div class="content">
		<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>	
		<tbody>
		<c:forEach var="board" items="${list}">
			<tr>
				<td>${board.no}</td>
				<td><a href="${pageContext.request.contextPath}/board/detail.do?no=${board.no}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td><td><fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd" /></td></td>
			</tr>		
		</c:forEach>
		</tbody>
		</table>
		<a href="${pageContext.request.contextPath}/board/writeform.do">글쓰기</a>
	</div>
	<div class="footer">
		<c:import url="/include/footer.jsp" />
	</div>
</div>

</body> 
</html>




