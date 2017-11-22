<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%

	ArrayList<String> gallList = new ArrayList();
	gallList.add("../img/bike.jpg");
	gallList.add("../img/bike1.jpg");
	gallList.add("../img/bike2.jpg");
	gallList.add("../img/bike3.jpg");
	
	request.setAttribute("gallList", gallList);

	String menu = "info";

	/* pageContext 최상위 권한을 가지고 있음 사용을 함부로하면 굉장히 위험함 */
	HttpServletRequest req = (HttpServletRequest)pageContext.getRequest();
	
	if(req.getParameter("menu") != null)
	{
		menu = request.getParameter("menu");
	}

	/* if(request.getParameter("menu") != null)
	{
		menu = request.getParameter("menu");
	} */
	String menuUrl = "menu/" + menu + ".jsp";
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	String main = "index";
	if(request.getParameter("main") != null)
	{
		main = request.getParameter("main");
	}
	String mainUrl = "main/" + menu + "/" + main + ".jsp";
	
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
				<td colspan="2">
					<jsp:include page="inc/top.jsp" />
				</td>
			</tr>
			
			<tr>
				<td width="100">
					<%-- <jsp:include page="<%=menuUrl %>" /> --%>
					<%
						pageContext.include(menuUrl);
					%> <!-- 굉장히 유용하지만 위험한코드 -->
				</td>
				<td width="500">
					<jsp:include page="<%=mainUrl %>" />

				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<jsp:include page="inc/bottom.jsp" />
				</td>
			</tr>
		</table>
	</body>
</html>