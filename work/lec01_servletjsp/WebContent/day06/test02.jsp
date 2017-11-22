<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--
		/common/down : 서블릿 패스경로
		filePath : 다운로드할 파일이 들어있는 디렉토리 경로
		sName : 실제 서버에 저장된 파일명
		dName : 사용자 컴퓨터에 다운로드할 이름
	   -->
	<a href="${pageContext.request.contextPath}/common/down?filePath=/17/10/17/14&sName=/7dc82446-c9ee-491f-8656-4b50a8a9b1d8.jpg&dName=cat.jpg">cat</a>
</body>
</html>