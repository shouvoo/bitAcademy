<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int a = 10;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		난 aaa:<%=a %>, <%=request.getParameter("name") %>
		<br>
		<jsp:include page="bbb.jsp?age=19"> <!-- 파라미터 전달방법 1 -->
			<jsp:param value="99" name="kor"/> <!-- 파라미터 전달방법 2 -->
		</jsp:include>
		<jsp:include page="ccc.jsp"></jsp:include>
	</body>
</html>