
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="navi" tagdir="/WEB-INF/tags" %>

<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" type="text/css">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css"> -->

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<div class="header">
		<c:import url="/include/topMenu.jsp" />
</div>
<div class="content" style="margin-top: 50px; margin-bottom: 50px;">
	<table>
	
		<tr>
		<td class="random">
			<c:import url="/restaurant/random?ran=${param.ran }" />
		</td>
		</tr>
		
		<tr>
		<td class="list2">
			<c:import url="/restaurant/list2" />
		</td>
		</tr>
		
		<tr>
		<td class="list">
			<c:import url="/restaurant/list" />
		</td>
		</tr>
		
		<c:if test="${not empty param.q}">
		<tr>
			<td>
			<%-- <object data="http://map.daum.net/?q=${param.q }" width="700" height="500"></object> --%>
			<object data="http://map.daum.net/?sName=서울 강남구 테헤란로5길 11&eName=${param.q }&target=walk" width="700" height="500"></object>
			</td>
		</tr>
		</c:if>
		
		<tr>
		<td class="insert">
			<c:import url="/restaurant/insertForm.jsp" />
		</td>
		</tr>
		
	</table>
</div>
<div class="bottom">
		<c:import url="/include/bottom.jsp" />
	</div>
	
	<script type="text/javascript">
	$("ul.nav.navbar-nav > li").removeClass("active");
	$("ul.nav.navbar-nav > li:eq(5)").addClass("active");
</script>	
</html>