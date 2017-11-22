<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="navi" tagdir="/WEB-INF/tags" %>

<%@ include file="/include/basicInclude.jsp" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mainLayout.css" 
		type="text/css">

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css"> -->

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="http://code.jquery.com/jquery-2.1.4.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
.TopBar{font: 20px bold; color: #0085D5; background: rgb(239, 239, 239); width: 100%; position: absolute;
height: 27px; margin-top: 0px;}
.boardLook{float: right;}
.boardLike{float: right; margin-top: -7px;}
.LowBar{font: 20px bold; color: #0085D5; background: rgb(136, 136, 136); margin-bottom: 50px;
width: 100%; height: 28px; text-align: right;}
.LowBar *{border: 1px solid black; font-weight: bold; color: red;}
.boardCate{font-size: 13px;}
.SecondBar{color: black; width: 100%; margin-bottom: 10px; border: 1px solid black;
position: absolute; margin-top: 27px; background: white;}
.boardRegDate{float: right;}
.detail, .detailfir, .detaillas, .detailonl{height: auto; width: 500px;}
.detailfir{padding-top: 20px;}
.detaillas{padding-bottom: 50px;}
.detailonl{padding-top: 20px; padding-bottom: 50px;}
.board{overflow: auto; border: 2px thin black; padding-top: 60px;}
</style>
<script>
function autoResize(i)
{
    var iframeHeight=
    (i).contentWindow.document.body.scrollHeight;
    (i).height=iframeHeight+20;
}
</script>
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
	<div class="TopBar">
		<span class="boardCate">
		<a title="${fix.cate }" href="${pageContext.request.contextPath }/fix/search?cate=${fix.cate }&brand=전체&title=">${fix.cate }</a>
		<a title="${fix.cate } > ${fix.brand }" href="${pageContext.request.contextPath }/fix/search?cate=${fix.cate }&brand=${fix.brand }&title=">></a>
		<a title="${fix.brand }" href="${pageContext.request.contextPath }/fix/search?cate=전체&brand=${fix.brand }&title=">${fix.brand }</a>
		</span>
		<span class="boardTitle">${fix.title }</span>
		<span class="boardLook">조회수: ${fix.look }</span>
		<object class="boardLike" data="${pageContext.request.contextPath }/fix/likeform?no=${fix.no}"></object>
	</div>
	
	<div class="secondBar">
		<span class="boardWriter">작성자: ${fix.writer }</span>
		<span class="boardRegDate">작성일: <fmt:formatDate value="${fix.regDate}" pattern="yyyy-MM-dd hh:mm:ss" /></span>
	</div>
	
	
	<div style="height: auto;">
	<center>
	<c:forEach items="${file }" var="a" varStatus="v">
	
	<%-- <c:if test="${not empty fix.youtube }">
	<iframe width="500" height="300" src="${fix.youtube }" frameborder="0" gesture="media" allowfullscreen>
</iframe>
	</c:if> --%>
	
		<c:choose>
		<c:when test="${v.last && v.first}"><div class="detailonl"></c:when>
		<c:when test="${v.first}"><div class="detailfir"></c:when>
		<c:when test="${v.last}"><div class="detaillas"></c:when>
		<c:otherwise><div class="detail"></c:otherwise>
		</c:choose>
<c:if test="${not empty craw && v.first}">
<div style="" class="ebay">
<c:forEach items="${craw }" var="c">
<div style="margin-top: 50px;
display: inline-block; width: 80px;">
<a href="${c.href }" target="_blank">
<img src="${c.src }" width="30"><br>
<div style="height: 20px; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">${c.name }</div></a>
</div>
</c:forEach>
</div>
</c:if>	
			<br><br><img src="${pageContext.request.contextPath}/common/down?filePath=fix/image&sName=${a.sysName }&dName=${a.oriName }" width="<c:if test="${a.width > 500 }">500</c:if>">
			<br>${content[v.index] }<br>
			
		</div>
	</c:forEach>
		<%-- <c:import url="dut?no=${fix.no }" /> --%>
	<iframe onload="autoResize(this)" scrolling="no" style="width: 100%;" src="${pageContext.request.contextPath }/fix/dut?no=${fix.no}"></iframe>
	</center></div>
	

	
	
	<div class="LowBar">
		<c:if test="${user.id == fix.id }">
		<a href="javascript:;" onClick="if (confirm('게시물을 삭제 하시겠습니까?')) location.href='delete?no=${fix.no}'">삭제</a>	
		<a href="modify?no=${fix.no}">수정</a>	
		</c:if>
	</div>
</div>
<div class="bottom">
		<c:import url="/include/bottom.jsp" />
	</div>	
</div>	
</div>	
	
	

<script>
$("ul.nav.navbar-nav > li").removeClass("active");
$("ul.nav.navbar-nav > li:eq(1)").addClass("active");
</script>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	