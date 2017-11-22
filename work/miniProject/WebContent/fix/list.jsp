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
<script src="http://code.jquery.com/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
.content{}
.boardTitle{font: 20px bold; color: #0085D5; background: rgb(239, 239, 239); width: 100%;}
.boardSize{font-size: 13px; float: right;}
.list{margin: 5px;}
#doc{border: 1px solid rgba(208, 208, 208, 0.8); width: 300px; height: 121px; display: inline-block;
margin: 10px;}
.img{overflow: hidden;}
.image{width:100%; height: 100px;}
#doc:hover img{transform: scale(1.1); transition: 1s;}
#doc *{color: skyblue;}
#doc:hover .title{
animation-name: col;
animation-duration: 1s;
animation-direction:reverse;
}
#doc:hover #text{
display: block;
}
@keyframes col{
from {color: skyblue;}
to{color: purple;}
}
.line{margin-left: 8%; margin-right: 8%;}
#doc:nth-child(6n){display: block;}
.title{width: 70%; height: 21px; overflow : hidden; text-overflow: ellipsis;
white-space:nowrap; display: inline-block;}
.like{float: right; font-size: 13px;}
/* .page{margin-left: 45%; width: 2000px;} */
#text{position: absolute;margin-top: -30;margin-left: 50px;width: 300px;
overflow: hidden;border: 1px solid black;background: #ffc356;
 text-overflow: ellipsis;height: 56px;display: none; color: black;}
</style>
<c:if test="${not empty param.chk }">
<script>
alert("로그인을 해주세요.");
</script>
</c:if>
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
<div class="content">
	<div class="boardTitle">
		<span class="boardInfo">Fix게시판| ${page }페이지</span>
		<span class="boardSize">전체 게시물:${size }개</span>
	</div>
	
	<center>
	<form action="${pageContext.request.contextPath }/fix/search">
	<div>
	 <!-- style="text-align: left;" -->
	    <input type="radio" id="contactChoice1"
	     name="cate" value="휴대전화" checked>
	    <label for="contactChoice1">휴대전화</label>
	
	    <input type="radio" id="contactChoice2"
	     name="cate" value="노트북">
	    <label for="contactChoice2">노트북</label>
	
	    <input type="radio" id="contactChoice3"
	     name="cate" value="데스크탑">
	    <label for="contactChoice3">데스크탑</label>
	    
	    <input type="radio" id="contactChoice4"
	     name="cate" value="디스플레이">
	    <label for="contactChoice4">디스플레이</label>
	
	    <input type="radio" id="contactChoice5"
	     name="cate" value="콘솔">
	    <label for="contactChoice5">콘솔</label>
	
	    <input type="radio" id="contactChoice6"
	     name="cate" value="가전제품">
	    <label for="contactChoice6">가전제품</label>
	    
	    <input type="radio" id="contactChoice7"
	     name="cate" value="전체">
	    <label for="contactChoice7">전체</label>
	  </div>
	  
	  <div>
	    <input type="radio" id="ccChoice1"
	     name="brand" value="삼성" checked>
	    <label for="ccChoice1">삼성</label>
	
	    <input type="radio" id="ccChoice2"
	     name="brand" value="엘지">
	    <label for="ccChoice2">엘지</label>
	
	    <input type="radio" id="ccChoice3"
	     name="brand" value="애플">
	    <label for="ccChoice3">애플</label>
	    
	    <input type="radio" id="ccChoice4"
	     name="brand" value="도시바">
	    <label for="ccChoice4">도시바</label>
	
	    <input type="radio" id="ccChoice5"
	     name="brand" value="샤오미">
	    <label for="ccChoice5">샤오미</label>
	
	    <input type="radio" id="ccChoice6"
	     name="brand" value="기타">
	    <label for="ccChoice6">기타</label>
	    
	    <input type="radio" id="ccChoice7"
	     name="brand" value="전체">
	    <label for="ccChoice7">전체</label>
	  </div>
	  
	  <div>
	  	제목:<input type="text" name="title">
	  	<button type="submit">검색</button>
	  </div>
	  </form>
	  </center>
	
	<div class="list">
		<c:if test="${msg != null }"><center>${msg }</center></c:if>
	
		<c:forEach items="${list }" var="a" varStatus="s">
		
		<c:if test="${s.index%4 == 0}">
		<div class="line">
		<c:set var="aaa" value="${s.index+3}"/>
		</c:if>

		<span class="doc${s.index }" id="doc">
		<a href="${pageContext.request.contextPath }/fix/view?no=${a.no }">
			<div class="img">
				<img src="${pageContext.request.contextPath}/common/down?filePath=fix/thumb&sName=${a.thumb }&dName=${a.oriName }">
			</div>
			
			<div class="title"><c:if test="${a.chk == true }">
			<img src="https://cdn2.iconfinder.com/data/icons/picons-basic-2/57/basic2-081_new_badge-512.png" width="20"></c:if>
			${a.title }</div>
			<span class="like">|${a.like } 추천</span>
		
		<div class="text${s.index }" id="text"><font size="1">미리보기</font><br>
${a.content }</div>
		
		</a>
		</span>
		
		<c:if test="${aaa == s.index}">
		</div>
		</c:if>

		</c:forEach>
		
	</div>
	
	<center>
	<div class="page">
	
	<c:choose>
			<c:when test="${not empty param.tab }">
				<c:set var="pp" value="${param.tab}" />
			</c:when>
			<c:otherwise>
				<c:set var="pp" value="${tab}" />
			</c:otherwise>
		</c:choose>
		
		<c:set var="i" value="${pp*3-2}" />
		<nav><ul class="pagination">
			<li>
			<a href="
			<c:choose>
     		 <c:when test="${pp != 1}">
     		 ?tab=${pp-1}&page=${(pp-1)*3}&order=${param.order}
      		 </c:when>
      		 <c:otherwise>
      		 #
      		 </c:otherwise>
      		</c:choose>
      		" aria-label="Previous"><span aria-hidden="true">&laquo;</span>
      		</a>
  			</li>
			<c:forEach begin="${i}" end="${pp*3}">
				<c:if test="${i<=lsize }">
					<li><a href="?page=${i}&order=${param.order}&tab=${pp}">${i}</a></li>
				<c:set var="i" value="${i+1}" />
				</c:if>
			</c:forEach>
			<li>
      		<a href="
			<c:choose>
     		 <c:when test="${pp*3 < lsize}">
     		 ?tab=${pp+1}&page=${pp+3}&order=${param.order}
      		 </c:when>
      		 <c:otherwise>
      		 #
      		 </c:otherwise>
      		</c:choose>
      		" aria-label="Next"><span aria-hidden="true">&raquo;</span>
      		</a>
  			</li>
		</ul></nav>
		</div>
		</center>
		
		<c:if test="${not empty user.id }">
		<a style="border:2px solid red; float: right; margin-right: 50px; margin-top: -50;" href="${pageContext.request.contextPath }/fix/write">글쓰기</a>
		</c:if></div>
		<div class="bottom">
			<c:import url="/include/bottom.jsp" />
		</div>
</div>
</div>
</div>
</div>
</div>
<script>
$("input[name='cate'][value='${cate}']").prop("checked", true)
$("input[name='brand'][value='${brand}']").prop("checked", true)
$("ul.nav.navbar-nav > li").removeClass("active");
$("ul.nav.navbar-nav > li:eq(1)").addClass("active");
</script>