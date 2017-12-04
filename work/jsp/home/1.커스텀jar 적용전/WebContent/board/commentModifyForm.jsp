<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function goBack(no)
	{
		location.href = "${pageContext.request.contextPath}/board/detail?no=" + no;
	}
</script>

</head>
<body>

<div class="container">	
	<div class="header">
		<c:import url="/include/topMenu.jsp"></c:import><!-- 외부사이트를 인클루드 할수있음 -->
	</div>
	
	<div class="content">
		<form action="${pageContext.request.contextPath}/board/commentmodify">
		<input type="hidden" name="no" 
		       value="${board.no}" />
		      <input type="hidden" name="commentNo" 
		       value="${board.commentNo}" />
		<table>
		<tbody>
			<tr>
				<th>번호</th>
				<td>${board.no}</td>
			</tr>
			<tr>
				<th>댓글 번호</th>
				<td>${board.commentNo}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" value="${board.writer}" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content" >${board.content}</textarea></td>
			</tr>
			<tr>
				<td><button>수정</button></td>
				<td ><button type="button" onclick="goBack(${board.no});">돌아가기</button></td>
				
			</tr>
		</tbody>	
		</table>	
	</form>
	</div>
	
	<div class="footer">
		<c:import url="/include/footer.jsp"></c:import>
	</div>
	
</div>

</body>
</html>













