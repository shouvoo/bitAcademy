<%@page import="java.util.ArrayList"%>
<%@page import="model.StudVO"%>
<%@page import="model.StudDAO"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	
	ArrayList<StudVO> list = new StudDAO().list();

	
	
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>id</td><td>성별</td><td>이메일</td>
		
	</tr>
	<% for(StudVO vo: list) {%>
	<tr>
		<td><a href="detail.jsp?id=<%=vo.getId() %>"><%=vo.getId() %></a></td>
		<td><%=vo.getGender() %></td>
		<td><%=vo.getEmail() %></td>
	</tr>
	<%} %>
	
	<tr>
		<td colspan="3" align="right">
			<a href="joinForm.jsp">회원가입</a>
		</td>
	</tr>
</table>
</body>
</html>
