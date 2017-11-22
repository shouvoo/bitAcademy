<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	<c:forEach var="i" begin="1" end="10">
		${i }<br>
	</c:forEach>
	
	생년월일 : 
	<select>
		<c:forEach var="i" begin="1970" end="2010">
			<option>${i }</option>
		</c:forEach>
	</select>
	
	<%
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		pageContext.setAttribute("list", list);
	 %>
	
	<%-- <c:set var="cnt" value="1" />
	<c:forEach var="s" items="${list}">
		<c:if test="${cnt != 1 }">,</c:if>${s}
		<c:set var="cnt" value="${cnt+1 }" />
	</c:forEach> --%>
	
	<c:forEach var="s" items="${list}" varStatus="loop">
		<%-- <br>${loop.first}-${loop.last}-${loop.count}-${s} --%>
		<c:if test="${loop.first == false}">,</c:if>${s}
	</c:forEach>
	
</body>
</html>
























