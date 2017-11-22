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
	<c:set var="msg" value="test" />
	<c:set var="msg" value="<h1>test</h1>" />
	el msg : ${msg }<br>
	
	jstl msg : <c:out value="${msg}" /><br>
	homepage : <c:out value="${homepage }" default="홈페이지 없음" />
</body>
</html>