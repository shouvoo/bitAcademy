<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	/* String str = "tt1.jsp"; */ /* include 시 주소를 변수로 대입할수 없다!!! */
	int a = 10;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		난 TOT :  <%=request.getParameter("name")  %>, <%=a %>
		<br>
		<%@ include file="tt1.jsp" %>
		<br>
		<%@ include file="tt2.jsp" %>
	</body>
</html>