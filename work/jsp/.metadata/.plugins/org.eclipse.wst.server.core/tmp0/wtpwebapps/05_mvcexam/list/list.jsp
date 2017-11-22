<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div>
		<c:import url="/search/searchform.jsp"></c:import>
	</div>
	<div>
		<table border=1>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>성별</th>
				<th>종교</th>
				<th>졸업일</th>
				<th></th>
			</tr>
			<tr>
				<c:forEach var="temples" items="${templesList}">
					<tr>
						<td>${temples.staffNo}</td>
						<td>${temples.staffName}</td>
						<td>${temples.gender}</td>
						<td>${temples.religionName}</td>
						<td>${temples.graduateDay}</td>
						<td><button>수정/삭제</button></td>
					<tr>
				</c:forEach>
			</tr>
		</table>
	</div>

</body>
</html>