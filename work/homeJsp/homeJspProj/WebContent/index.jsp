<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	/// 김수한무 거북이와 두루미 삼천갑자 동박사 워리워리
	Date now = new Date();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>jspProj</title>
	</head>
	<body>
		나는 선생이여
		<%=now %>
		<a href="NowSer">NowSer</a>
		<br>baisc<br>
		<a href="basic/first.jsp">first</a>
		<a href="basic/monthDiary.jsp">monthDiary</a>
		<a href="basic/yearDiary.jsp">yearDiary</a>
		<br>request<br>
		
		<%
			String hungry = URLEncoder.encode("배고파", "UTF-8");
			//String decode = URLDecoder.decode(hungry, "UTF-8");
			
			//out.print("!!!!" + hungry);
			//out.print("!!!!" + decode);
			
			//%EB%B0%B0%EA%B3%A0%ED%8C%8C
		%>
		<a href="request/info.jsp?aaa=<%=URLEncoder.encode("배고파", "UTF-8") %>">info</a>
		
		<a href="request/join.jsp?id=qqq&pw=111&email=qqq@qqq.co.kr&
		name=<%=URLEncoder.encode("현구안뇽", "UTF-8") %>&
		hobby=sleep&hobby=song&hobby=fishing">join</a>
		
		<a href="request/joinForm.jsp">joinForm</a>
		
	</body>
</html>














