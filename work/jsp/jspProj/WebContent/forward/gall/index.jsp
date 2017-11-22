<%@page import="java.util.ArrayList"%>
<%@page import="forwardSite.Inc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	new Inc(request);
	ArrayList<String> gallList = new ArrayList();
	gallList.add("../img/bike.jpg");
	gallList.add("../img/bike1.jpg");
	gallList.add("../img/bike2.jpg");
	gallList.add("../img/bike3.jpg");
	
	request.setAttribute("gallList", gallList);
%>    
    
<jsp:forward page="../view/template.jsp"></jsp:forward>