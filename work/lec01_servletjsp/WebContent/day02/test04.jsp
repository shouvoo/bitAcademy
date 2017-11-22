<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
	<!-- action : 호출할 서버페이지의 주소 
				: 페이지가 정의되지 않은 경우 자기 자신 페이지 호출
				
				서버로 데이터를 전송하기 위해서 name 속성이 꼭 있어야한다
				input, textarea, select
	-->
		<!-- <form action="test04"> -->
		<form action="${pageContext.request.contextPath}/day02/test04">
		<!-- <form action="/lec01_servletjsp/day02/test04"> -->
			<input type="checkbox" id="f1" name="fruit" value="1"> <label for="f1">사과</label>
			<input type="checkbox" id="f2" name="fruit" value="2"> <label for="f2">포도</label>
			<input type="checkbox" id="f3" name="fruit" value="3"> <label for="f3">딸기</label>
			<br>
			<!-- type 속성이 없을 경우 기본이  submit -->
			<button>전송</button>
			
			<!-- 
			<button type="button">전송</button>
			<button type="reset">전송</button>
			<button type="submit">전송</button> 
			-->
		</form>
	</body>
</html>