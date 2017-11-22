<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FIX</title>
<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" type="text/css">

<style type="text/css">
	.carousel.slide
	{
		position: relative;
		margin: 150px 0px 0px 100px;
	}	 
</style>

</head>
<body>
<div class="container">
	<div>
	  <img alt="full screen background image" src="${pageContext.request.contextPath}/img/aboutUs/aboutUs3.jpg" id="full-screen-background-image" /> 

	</div>

	<div class="header">
		<c:import url="/include/topMenu.jsp" />
	</div>

    <div id="carousel-example-generic slideMain shadow" class="carousel slide" data-ride="carousel">
	    <div class="carousel-inner" role="listbox">
		  <div class="item active">
			<img data-src="holder.js/1140x500/auto/#777:#555/text:First slide" alt="First slide [1140x500]" src="${pageContext.request.contextPath}/img/main/main0.jpg" data-holder-rendered="true">
		  </div>
		  <div class="item">
			<img data-src="holder.js/1140x500/auto/#666:#444/text:Second slide" alt="Second slide [1140x500]" src="${pageContext.request.contextPath}/img/main/main0.jpg" data-holder-rendered="true">
		  </div>
		  <div class="item">
			<img data-src="holder.js/1140x500/auto/#555:#333/text:Third slide" alt="Third slide [1140x500]" src="${pageContext.request.contextPath}/img/main/main0.jpg" data-holder-rendered="true">
		  </div>
	   </div>
	</div>

	
	<div class="bottom">
		<c:import url="/include/bottom.jsp" />
	</div>	
</div>

<script type="text/javascript">
	$("ul.nav.navbar-nav > li").removeClass("active");
	$("ul.nav.navbar-nav > li:eq(0)").addClass("active");
</script>

</body>
</html>


















