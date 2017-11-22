<%@page import="model.HomeStudVO"%>
<%@page import="model.HomeStudDAO"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("UTF-8"); /* post 방식일때만 사용 */

	String hobby = Arrays.toString(request.getParameterValues("hobby"));
	String email = request.getParameter("email1")+"@"+request.getParameter("email2");
	String jumin = request.getParameter("jumin1")+"-"+request.getParameter("jumin2");
	HomeStudDAO dao = new HomeStudDAO();
	HomeStudVO vo = new HomeStudVO();
	vo.setId(request.getParameter("id"));
	vo.setPw(request.getParameter("pw"));
	vo.setGender(request.getParameter("gender"));
	vo.setHobby(hobby);
	vo.setContent(request.getParameter("content"));
	vo.setEmail(email);
	vo.setName(request.getParameter("name"));
	vo.setGrade(request.getParameter("grade"));
	vo.setFriend(request.getParameter("friend"));
	vo.setJumin(jumin);
	dao.insert(vo); 
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
	
	<body background="../img/bike1.jpg">
	
		<table border="1"  align="center"  bgcolor="#999999">
		
			<tr>
				<td>이름</td>
				<td><%=request.getParameter("name") %></td>
			</tr>
			
			<tr>
				<td>주민등록번호</td>
				<td><%=request.getParameter("jumin1") + "-" + request.getParameter("jumin2") %></td>
			</tr>
		
			<tr>
				<td>id</td>
				<td><%=request.getParameter("id") %></td>
			</tr>
			
			<tr>
				<td>pw</td>
				<td><%=request.getParameter("pw") %></td>
			</tr>
			
			<tr>
				<td>성별</td>
				<td><%=request.getParameter("gender") %><br></td>
			</tr>
			
			<tr>
				<td>반</td>
				<td><%=request.getParameter("grade") %></td>
			</tr>
			
			<tr>
				<td>친구</td>
				<td><%=request.getParameter("friend") %></td>
			</tr>
				
			<tr>
				<td>취미</td>
				<td><%=Arrays.toString(request.getParameterValues("hobby")) %><br></td>
			</tr>
				
			<tr>
				<td>파일</td>
				<td><%=request.getParameter("upfile") %></td>
			</tr>
			
			<tr>
				<td>이메일</td>
				<td><%=request.getParameter("email1")+"@"+request.getParameter("email2") %><br></td>
			</tr>	
			
			<tr>
				<td>내용</td>
				<td><%=request.getParameter("content").replaceAll("\r\n", "<br>") %><br></td>
			</tr>	
		</table>
	
		<%-- id : <%=request.getParameter("id") %><br> 
		pw : <%=request.getParameter("pw") %><br> 
		성별 : <%=request.getParameter("gender") %><br>  --%>
	</body>
</html>