<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
	function 활용하는 예제

 --%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="msg" value="fn test"/>
	fn:length(msg) : <c:out value="${fn:length(msg)}" /><br>
	fn:length(msg) : <c:out value="${fn:substring(msg, 3, 6)}" /><br>
	fn:length(msg) : <c:out value="${fn:substring(msg, 6, -1)}" /><br>
</body>
</html>