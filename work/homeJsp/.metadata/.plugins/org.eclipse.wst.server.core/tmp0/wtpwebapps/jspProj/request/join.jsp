<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		id : <%=request.getParameter("id") %><br>
		pw : <%=request.getParameter("pw") %><br>
		이름 : <%=request.getParameter("name") %><br>
		email : <%=request.getParameter("email") %><br>
		취미 : <%=request.getParameter("hobby") %><br>
		취미들 : <%=Arrays.toString(request.getParameterValues("hobby")) %><br>
		param : <% Enumeration ee = request.getParameterNames();
			while(ee.hasMoreElements())
			{
				out.print(ee.nextElement() + " ,");
			}
			
		%><br>
	</body>
</html>