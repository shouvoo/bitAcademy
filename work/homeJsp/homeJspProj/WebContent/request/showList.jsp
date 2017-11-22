<%@page import="model.StudVO"%>
<%@page import="model.StudDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%	
	ArrayList<StudVO> dbList = new StudDAO().getData();
	int len = dbList.size();
	/* for (StudVO db : dbList) 
	{
		out.print(db.getName());
	} */
%>
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
	
	<body background="../img/bike2.jpg">
	
		<table border="1" align="center" bgcolor="#999999" style='filter: Alpha(Opacity=90)'>
			<%
			for(int i = 0; i<len; i++)
			{%>
				<tr>
					<td><%=dbList.get(i).getName() %></td>
					<td><%=dbList.get(i).getJumin() %></td>
					<td><%=dbList.get(i).getId() %></td>
					<td><%=dbList.get(i).getPw() %></td>
					<td><%=dbList.get(i).getGender() %></td>
					<td><%=dbList.get(i).getGrade() %></td>
					<td><%=dbList.get(i).getFriend() %></td>
					<td><%=dbList.get(i).getHobby() %></td>
					<td><%=dbList.get(i).getEmail() %></td>
					<td align="right"><%=dbList.get(i).getContent() %>
						<!-- <input type="button" value="상세페이지" align="right"  onClick="detailLink()"> -->
						 <a href="showDetail.jsp?name=<%=dbList.get(i).getName() %>&jumin=<%=dbList.get(i).getJumin() %>&id=<%=dbList.get(i).getId() %>&pw=<%=dbList.get(i).getPw() %>&gender=<%=dbList.get(i).getGender() %>&grade=<%=dbList.get(i).getGrade() %>&friend=<%=dbList.get(i).getFriend() %>& hobby=<%=dbList.get(i).getHobby() %>& email=<%=dbList.get(i).getEmail() %>&content=<%=dbList.get(i).getContent() %>" target="_black">상세보기</a>
						<%-- <a href="showDetail.jsp?name=<%=dbList.get(i).getContent() %>&jumin=<%=dbList.get(i).getJumin() %>" target="_black">상세보기</a> --%>
						 
					</td>
					
				</tr>			
			<%}%>
		</table>
		
	</body>
</html>