<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
	#cl-dashboard{display: none;}
	
	.navbar-nav.myButton > li a:hover
	{
		color: #6d6868;
	}
	
	.userName > li a:hover
	{
		color: #6d6868;
	}
	
	.logdiv > li a:hover
	{
		color: #6d6868;
	}
	
	
	

	
	.userName
	{
		position: absolute;
		display: inline-block;
		float: right;
		right: 100px;
		top:15px;
	}
	
	.logdiv
	{
		position: absolute;
		display: inline-block;
		float: right;
		right: 50px;
		top:15px;
	}
	
	.logdiv li a
	{
		color: #b7b7b7;
		text-decoration: none;
	}
	
	.logdiv li
	{
		list-style: none;
	}
	
	.userName li a
	{
		color: #b7b7b7;
		text-decoration: none;
	}
	
	.userName li
	{
		list-style: none;
	}
	
	.customLogo
	{
		top: 0px;
		right: 200px;
	}
	
	.topCustom
	{	
		border: none;
		background: #eeeeee;		
	};
	
	.navbar-default .navbar-nav > .active{
    	color: #000;
	   background: #d65c14;
	 }
	 .navbar-default .navbar-nav > .active > a, 
	 .navbar-default .navbar-nav > .active > a:hover, 
	 .navbar-default .navbar-nav > .active > a:focus {
	      color: #f99898;
	      background: #eeeeee
	 }
	
</style>

<script>
	window.onload = function()
	{
		var id = '${user.id}';
		if(id != "")
		{
			document.getElementById("userNameField").text = id + ":"
		} 
	}

</script>


<nav class="navbar navbar-inverse navbar-default navbar-fixed-top topCustom">

	<div class="userName">
		 <li class="log"><a id="userNameField" href="${pageContext.request.contextPath}/member/loginform"></a></li>
	</div>
		
	<div class="logdiv">
		<c:choose>
			<c:when test="${empty user}">
				 <li class="log"><a href="${pageContext.request.contextPath}/member/loginform">Login</a></li>
			</c:when>
			<c:otherwise>
				 <li class="log"><a href="${pageContext.request.contextPath}/member/logout">LogOut</a></li>
			</c:otherwise>
		</c:choose>
	</div>

	
	<div class="container-fluid">
	
		<a class="navbar-brand customLogo" href="${pageContext.request.contextPath}/main/index">
			<img src="${pageContext.request.contextPath}/img/logo/logo2.png" width="30" height="30" alt="">
		</a>
	
	 	<ul class="nav navbar-nav myButton">
	   		<li><a href="${pageContext.request.contextPath}/about/about">ABOUT US</a></li>
			<li><a href="${pageContext.request.contextPath}/fix/list">FIX</a></li>
			<li><a href="${pageContext.request.contextPath}/freeboard/freeboard">FREE BOARD</a></li>
			<li><a href="${pageContext.request.contextPath}/qna/list">QnA</a></li>
			<c:if test="${user != null}">
				<li><a href="${pageContext.request.contextPath}/member/info">MY INFO</a></li>
				<li><a href="${pageContext.request.contextPath}/restaurant/main">MIR RESTAURANT</a></li>
			</c:if>
			
	    </ul>
  	</div>
  	
  	
</nav>





















