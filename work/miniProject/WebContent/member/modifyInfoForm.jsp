<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="navi" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" type="text/css">
<script type="text/javascript">
function idcheck(){
	var join = document.modify;
	join.action = "${pageContext.request.contextPath}/member/idcheck";
	join.submit();
}

function checkfield(){
	 
	 if(document.modify.pass.value==""){
	 alert("비밀번호를 입력하세요");
	 document.modify.pass.focus();
	 exit;
	 
	 }else if(document.modify.pass2.value==""){
		 alert("비밀번호확인을 입력하세요");
		 document.modify.pass2.focus();
		 exit;
	 
	 
	 }else if(document.modify.email.value==""){
	 alert("이메일을 입력하세요");
	 document.modify.email.focus();
	 exit;
	 
	 } 
	 
	 if(document.modify.pass.value!=document.modify.pass2.value){
		 
		 alert("입력한 2개의 비밀번호가 일치하지 않습니다.");
		 document.modify.pw.focus();
		 exit;
		 }
	 
	 var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
	 
	 if(exptext.test(document.modify.email.value)==false){
	
	 
	 alert("이 메일형식이 올바르지 않습니다.");
	 document.modify.email.focus();
	 exit;
	 }
	 
	 document.modify.submit();
	 
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 정보수정</title>
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
	<form name ="modify" action="${pageContext.request.contextPath}/member/modifyinfo" method="post">
		<table>
			<tbody>
				<tr>
					<th>아이디: </th>
					<td> ${user.getId()}<input name="id" type="hidden" value="${user.getId()}"/></td>
				</tr>
				<tr>
					<th>패스워드: </th>
					<td><input type="password" name="pass" id="pass" value="${user.getPass()}"/></td>
				</tr>
				<tr>
					<th>패스워드확인: </th>
					<td><input type="password" name="pass2" id="pass2"/></td>
				</tr>
				<tr>
					<th>이름: </th>
					<td>${user.getName()}</td>
				</tr>
				<tr>
					<th>이메일: </th>
					<td><input type="text" name="email" value="${user.getEmail()}"/></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<input type="button" value="수정완료" onclick="checkfield()"/>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
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