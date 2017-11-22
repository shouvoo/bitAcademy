<%@page import="model.StudVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		
		<style type="text/css">
			body
			{
				background-size: 100%;
			}
		</style>
		
	</head>
	<body background="../img/bike3.jpg">
		<table align="center" border="1" bgcolor="#999999">
			<tr>
				<td><%=request.getParameter("name") %></td>
				<td><%=request.getParameter("jumin") %></td>
				<td><%=request.getParameter("id") %></td>
				<td><%=request.getParameter("pw") %></td>
				<td><%=request.getParameter("gender") %></td>
				<td><%=request.getParameter("grade") %></td>
				<td><%=request.getParameter("friend") %></td>
				<td><%=request.getParameter("hobby") %></td>
				<td><%=request.getParameter("email") %></td>
				<td><%=request.getParameter("content") %></td>
			</tr>
		</table>
	</body>
</html>