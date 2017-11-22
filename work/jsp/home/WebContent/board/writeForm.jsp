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

<div class="container">	
	<div class="header">
		<c:import url="/include/topMenu.jsp"></c:import><!-- 외부사이트를 인클루드 할수있음 -->
	</div>
	
	<div class="content">
		<form method="post" 
	      action="${pageContext.request.contextPath}/board/write.do" enctype="multipart/form-data">
		<table>
			<tbody>
				<tr>
					<th>제목</th>
					<td>
						<input type="text" name="title">
					</td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td>
						<input type="text" name="writer" value="${user.name}">
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						<textarea rows="6" cols="80" name="content"
						>내용을 입력하세요</textarea>
					</td>
				</tr>
				<tr>
					<th>업로드</th>
					<td>
						<input type="text" name="msg">
						<input type="file" name="attachFile1">
						<input type="file" name="attachFile2">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<button>등록</button>
					</td>
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











