<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
//사용자 저의 태크(custom tag)를 활용하기 위해서는 
	//태크에 대한 라이브러리를 참조할 수 있도록 지시자를 설정한다	
	
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 공유 설정을 대체하는 태그
			pageContext.setAttribute("a", "b");
			
			var 	->	a
			value	->	b
			scope 	->	pageContext (page, request, session, application)
			scope 속성이 생략되면 page가 기본 속성된다
	--%>
	<%-- <c:set var="a" value="b" scope="page"/> --%>
	<c:set var="a" value="b" scope="page"/>
	<!-- page 영역에 cnt 변수에 이름으로 1을 설정한다 -->
	<c:set var="cnt" value="1"/>
	<!-- page 영역에 cnt 변수에 값 : ?? -->
	cnt : ${cnt }<br>
	<!-- page 영역에 cnt 변수에 값을 1을 증가시킨다 -->
	<c:set var="cnt" value="${cnt + 1}"/>
	
	<!-- request 영역에 cnt 변수 이름으로 10을 설정한다 -->
	<c:set var="cnt" value="10" scope="request" />
	
	<!-- request 영역에 있는 cnt 변수의 값을 출력 : -->
	${requestScope.cnt}
</body>
</html>






