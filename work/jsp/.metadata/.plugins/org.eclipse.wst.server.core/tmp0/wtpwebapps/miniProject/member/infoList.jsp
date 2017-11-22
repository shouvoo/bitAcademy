<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="navi" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
function withdrawal(){
	location.href="${pageContext.request.contextPath}/member/withdrawalmember"
}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 정보</title>
<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" type="text/css">
</head>
<body>
<div class="container">
		<div>
		  <img alt="full screen background image" src="${pageContext.request.contextPath}/img/main/main0.jpg" id="full-screen-background-image" /> 
	
		</div>
	
		<div class="header">
			<c:import url="/include/topMenu.jsp" />
		</div>
		<div class="content">
	  <div id="wrapper">
	  	<div class="panel panel-default">
		<form action="${pageContext.request.contextPath}/member/modifyInfoForm.jsp"
			method="post">
			<table>
				<tbody>
					<tr>
						<th>아이디:</th>
						<td>${user.getId()}</td>
					</tr>
					<tr>
						<th>패스워드:</th>
						<td>${user.getPass()}</td>
					</tr>
					<tr>
						<th>이름:</th>
						<td>${user.getName()}</td>
					</tr>
					<tr>
						<th>이메일:</th>
						<td>${user.getEmail()}</td>
					</tr>
					<tr>
						<td colspan="2" align="right">
						<input type="submit" value="정보수정"/>
						<input type="button" value="회원탈퇴" onclick="withdrawal()"/>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
		<div align="center">
					<h4>최근활동</h4>
					<h5>QNA</h5>
			<table class="table">
				<tbody>
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>날짜</td>
					</tr>
					<c:forEach var="qna" items="${qlist}">
					<tr>
						<td>${qna.no}</td>
						<td><a href="${pageContext.request.contextPath}/qna/detail?no=${qna.no}">${qna.title}</a></td>
						<td><fmt:formatDate value="${qna.regDate}" pattern="yyyy년 MM월 dd일 HH시mm분ss초" /></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		
		</div>
		<div align="center">
		<h5>FREEBOARD</h5>
			<table  class="table">
				<tbody>
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>날짜</td>
					</tr>
					<c:forEach var="free" items="${flist}">
					<tr>
						<td>${free.no}</td>
						<td><a href="${pageContext.request.contextPath}/freeboard/detail?no=${free.no}">${free.title}</a></td>
						<td><fmt:formatDate value="${free.regDate}" pattern="yyyy년 MM월 dd일 HH시mm분ss초" /></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<div align="center">
		<h5>FIXBOARD</h5>
			<table  class="table">
				<tbody>
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>날짜</td>
					</tr>
					<c:forEach var="fix" items="${fixlist}">
					<tr>
						<td>${fix.no}</td>
						<td><a href="${pageContext.request.contextPath}/fix/view?no=${fix.no}">${fix.title}</a></td>
						<td><fmt:formatDate value="${fix.regDate}" pattern="yyyy년 MM월 dd일 HH시mm분ss초" /></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
	</div>
	<div class="bottom">
			<c:import url="/include/bottom.jsp" />
		</div>	
</div>
</div>
</div>
</div>
<script type="text/javascript">
	$("ul.nav.navbar-nav > li").removeClass("active");
	$("ul.nav.navbar-nav > li:eq(4)").addClass("active");
</script>
</body>
</html>