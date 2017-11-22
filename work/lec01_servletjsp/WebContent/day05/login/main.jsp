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
	<h1>메인 페이지</h1>
	<div>
		
		<c:choose>
			<c:when test="${empty user}">
				<a href="${pageContext.request.contextPath}/day05/login/loginform">로그인</a>
			</c:when>
			<c:otherwise>
				<h3>${user.id}</h3>
				<h3>${user.name}</h3>
				<h3>${user.pass}</h3>
				<a href="${pageContext.request.contextPath}/day05/login/logout">로그아웃</a>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>