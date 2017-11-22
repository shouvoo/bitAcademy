<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입 화면</title>
<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" type="text/css">
<script type="text/javascript">
function idcheck(){
	var join = document.addjoin;
	join.action = "${pageContext.request.contextPath}/member/idcheck";
	join.submit();
}

function checkfield(){
	 
	 if(document.addjoin.id.value==""){ //id값이 없을 경우
	 alert("아이디를 입력하세요");         //메세지 경고창을 띄운 후
	 document.addjoin.id.focus();     // id 텍스트박스에 커서를 위치
	 exit;
	 
	 }else if(document.addjoin.pass.value==""){
	 alert("비밀번호를 입력하세요");
	 document.addjoin.pass.focus();
	 exit;
	 
	 }else if(document.addjoin.pass2.value==""){
		 alert("비밀번호확인을 입력하세요");
		 document.addjoin.pass2.focus();
		 exit;
	 
	 }else if(document.addjoin.name.value==""){
	 alert("이름을 입력하세요");
	 document.addjoin.name.focus();
	 exit;
	 
	 
	 }else if(document.addjoin.email.value==""){
	 alert("이메일을 입력하세요");
	 document.addjoin.email.focus();
	 exit;
	 
	 } 
	 
	 if(document.addjoin.pass.value!=document.addjoin.pass2.value){
		 
		 alert("입력한 2개의 비밀번호가 일치하지 않습니다.");
		 document.addjoin.pw.focus();
		 exit;
		 }
	 
	 var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
	 
	 if(exptext.test(document.addjoin.email.value)==false){
	
	 
	 alert("이 메일형식이 올바르지 않습니다.");
	 document.addjoin.email.focus();
	 exit;
	 }
	 
	 document.addjoin.submit();
	 
	}
</script>
</head>
<body>

<div class="container">
	<div>
	  <img alt="full screen background image" src="${pageContext.request.contextPath}/img/freeBoard/freeBoard.jpg" id="full-screen-background-image" /> 

	</div>

	<div class="header">
		<c:import url="/include/topMenu.jsp" />
	</div>

	<div class="content">
	  <div id="wrapper">
	  	<div class="panel panel-default">
	<form name="addjoin" action="${pageContext.request.contextPath}/member/join" method="post">
	<div align="center">
		<table>
			<tbody>
				
			</tbody>
		</table>
	
		<table>
			<tbody>
				<c:choose>
				<c:when test="${empty id}">
				<tr>
					<th>아이디: </th>
					<td>${id}
					<input name="id" value="${id}"/> <button class="btn btn-info customWriteButton" onclick="idcheck()">중복체크</button>
					${chk}
					</td>
				</tr>
				</c:when>
				<c:otherwise>
				<tr>
					<th>아이디: </th>
					<td>
					<input type="text" disabled="disabled" value="${id}"/>
					<input name="id" type="hidden" value="${id}"/>
					</td>
				</tr>
				<tr>
					<th>패스워드: </th>
					<td><input type="password" name="pass" id="pass"/></td>
				</tr>
				<tr>
					<th>패스워드확인: </th>
					<td><input type="password" name="pass2" id="pass2"/></td>
				</tr>
				<tr>
					<th>이름: </th>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<th>이메일: </th>
					<td><input type="text" name="email" id ="email"/></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<input class="btn btn-info customWriteButton" type="button" value="가입완료" onclick="checkfield()"/>
					</td>
				</tr>
				</c:otherwise>
				</c:choose>
				
			
			</tbody>
		</table>
		
	</div>
	</form>
	
	<div class="bottom">
		<c:import url="/include/bottom.jsp" />
	</div>
</div>
</div>
</div>
</div>	
</body>
</html>