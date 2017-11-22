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
	<!-- 인클루드 방식(참조방식) -->
	
	<!-- 인클루드 방식(참조방식) -->
	<%-- <%@ include file="/include/topMenu.jsp" %>  --%>
	<%-- <jsp:include page="/include/topMenu.jsp"></jsp:include> --%> <!-- c:import 와 비슷하지만 외부사이트 인클루드 할수없음 -->
	
<div class="container">	
	<div class="header">
		<c:import url="/include/topMenu.jsp"></c:import><!-- 외부사이트를 인클루드 할수있음 -->
	</div>
	
	<div class="content">
			메인
		<h1 link="https://board?categoryno=1">자유게시판</h1>
		<h1 link="https://board?categoryno=2">질문게시판</h1>
		<h1 link="https://board?categoryno=3">문제게시판</h1>
		<h1 link="https://schdule">스케줄</h1>
		<h1 link="https://lunch">점심</h1>
		<h1>메인 바디 내용 부분</h1>
	</div>
	
	<div class="footer">
		<c:import url="/include/footer.jsp"></c:import>
	</div>
	
</div>
</body>
</html>