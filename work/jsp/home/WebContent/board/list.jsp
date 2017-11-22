
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%
List<BoardDomain> list = 
		(List<BoardDomain>)request.getAttribute("list");
%>  --%>   
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
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
	</thead>	
		<tbody>	
			<c:forEach var="i" begin="0" end="${list.size()}">	
				<tr>
					<td><c:out value="${list[i].no}"/></td>
					<td><a href="${pageContext.request.contextPath}/board/detail.do?no=${list[i].no}">${list[i].title}</a></td>
					<td><c:out value="${list[i].writer}"/></td>
					<td><c:out value="${list[i].content}"/></td>
					<td><c:out value="${list[i].regDate}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:if test="${not empty user}">
		<a href="${pageContext.request.contextPath}/board/writeform.do">글쓰기</a>
	</c:if>
	</div>
	
	<div class="footer">
		<c:import url="/include/footer.jsp"></c:import>
	</div>
	
</div>
</body>
</html>




