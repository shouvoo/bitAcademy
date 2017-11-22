
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="navi" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FIX</title>
<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" 
		type="text/css">
<script type="text/javascript">

	function buttonClick(link)
	{	
		location.href = link;
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
			  <!-- Default panel contents -->
			  <div class="panel-heading">Free Board</div>
			  <div class="panel-heading">전체 ${pageResult.count}개</div>
			
			  <!-- Table -->
			   <table class="table">
	            <thead>
	              <tr>
	                <th>번호</th>
					<th>글쓴이</th>
					<th>제목</th>
					<th>작성일</th>
	              </tr>
	            </thead>
	            <tbody>
	            <c:forEach var="list" items="${list}">
	              <tr>
	                <td>${list.no}</td>
	                <td>${list.writer}</td>
	                <td id="detailLink"><a href="${pageContext.request.contextPath}/freeboard/detail?no=${list.no}">${list.title}</a></td>
	                <td>${list.regDate}</td>
	              </tr>
	              </c:forEach>
	            </tbody>
	          </table>
			</div>
	        
	        <c:if test="${user != null}">
				<div>
					<button type="button" class="btn btn-info customWriteButton" onclick="buttonClick('${pageContext.request.contextPath}/freeboard/writeform');" >글쓰기</button>
				</div>
			</c:if>
			
			<navi:page data="${pageResult}" />
		</div>
		
	</div>	
	
	
	
	<div class="bottom">
		<c:import url="/include/bottom.jsp" />
	</div>	
</div>

<script type="text/javascript">
	$("ul.nav.navbar-nav > li").removeClass("active");
	$("ul.nav.navbar-nav > li:eq(2)").addClass("active");
</script>
</body>
</html>


















