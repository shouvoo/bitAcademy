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
	<h2>네이버 검색하기</h2>

	<form action="${pageContext.request.contextPath}/naverapi/search" method="post">
		검색어 : <input type="text" name="word" >
		<button>검색</button>
	</form>
	
	<c:choose>
		<c:when test="${empty list}">
			<h2>검색 결과가 없습니다</h2>
		</c:when>
		
		<c:otherwise>
			<table>
				<tr>
					<th>제목</th>
					<th>블로거 이름</th>
					<th>이동</th>
				</tr>
				
				<c:forEach var="item" items="${list}">
					<tr>
						<td>${item.title}</<td>
						<td>${item.bloggername}</<td>
						<td><a href="${item.bloggerlink}">${item.bloggerlink}</a></<td>
					</tr>
				</c:forEach>
			</table>
			
		</c:otherwise>
	</c:choose>
</body>
</html>









