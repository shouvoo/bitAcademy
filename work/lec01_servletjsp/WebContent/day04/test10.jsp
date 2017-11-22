<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//다중 조건 처리하기
	
	/* type 의 값에 따라서 아래와 같이 출력
	s : 슈퍼 계정
	u : 일반사용자 계정
	s 또는 u 가 아닐경우 잘못된 접근 */
%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="type" value="Q" />
	
	<c:choose>
		<c:when test="${type == 'S'}">
			<h1>관리자 계정</h1>
		</c:when>
		
		<c:when test="${type == 'U'}">
			<h1>일반 사용자 계정</h1>
		</c:when>	
		
		<c:otherwise>
			<h1>잘못된 접근</h1>
		</c:otherwise>	
	</c:choose>
</body>
</html>