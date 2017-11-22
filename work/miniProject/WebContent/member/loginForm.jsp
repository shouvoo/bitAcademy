<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 화면</title>
<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" type="text/css">

<style type="text/css">
	.content
	{
		position: relative;
		margin: 0 auto;
	}
	
	.frm
	{
		position: relative;
		margin: 100px auto;
		
	}
	
	.panel 
	{
	    margin-bottom: 20px;
	    background-color: rgba(255, 255, 255, 0.27);
	    border: 1px solid transparent;
	    border-radius: 4px;
	    -webkit-box-shadow: 0 1px 1px rgba(0,0,0,.05);
	    box-shadow: 0 30px 10px rgba(0,0,0,.5);
	}
	
	a 
	{
    	color: #333333;
    	text-decoration: none;
	}
	
	a:hover
	{
    	color: #ffffff;
    	text-decoration: none;
	}
</style>
</head>
<body>
<div class="container">
	<div>
	  <img alt="full screen background image" src="${pageContext.request.contextPath}/img/log/login2.jpg" id="full-screen-background-image" /> 

	</div>

	<div class="header">
		<c:import url="/include/topMenu.jsp" />
	</div>

	<div class="content">
	  <div id="wrapper">
	  	<div class="panel panel-default">
	<div align="center">
		<form action="${pageContext.request.contextPath}/member/loginprocess" method = "post">
		<table>
			<tbody>
				<tr>
					<th>아이디:</th>
					<td><input type="text" name="id" value="${cid}"/></td>
					
				</tr>
				<tr>
					<th>비밀번호:</th>
					<td><input type="password" name="pass"/></td>
					
				</tr>
				<tr>
					<td>아이디 저장
					<input type="checkbox" name="idcheck" 
						<c:if test="${not empty cid}">checked</c:if> value="Y"/>
						<c:if test="${empty user }">
						<td align="right">
							<button class="btn btn-info customWriteButton">로그인</button>
						</td>
						</c:if>
					</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<c:if test="${empty user}">
							<a href="${pageContext.request.contextPath}/member/joinform">회원가입</a>
							</c:if>
							<c:if test="${not empty user}">
								<a href="${pageContext.request.contextPath}/member/logout">로그아웃</a>
							</c:if>
						</td>
				</tr>			
			</tbody>
		</table>
		</form>
	
	</div>
	<div class="bottom">
		<c:import url="/include/bottom.jsp" />
	</div>
</div>
</div>
</div>
</div>
</body>
</html>