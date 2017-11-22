<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
	fmt 활용한 날짜 관련 작업
	- 날짜 객체를 문자열로 변환
	- 문자열을 날짜 객체로 변환
 --%>    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		SimpleDateFormat sdf = new SimpleDateForamt("yyyy-MM-dd");
		//날짜 객체를 문자로 변환
		String val = sdf.foramt(new Date());
		
		//문자열을 날짜 객체로 반환
		Date d = sdf.parse("2017-11-17");
		int year = d.getYear() + 1900;
	 --%>
	 
	 <fmt:parseDate var="d" value="2017-11-17" pattern="yyyy-MM-dd"/>
		년도 : ${d.year + 1900}<br>
		월 : ${d.month}<br>
	
	<fmt:formatDate value="${d}" pattern="yyyy-MM-dd"/>
</body>
</html>