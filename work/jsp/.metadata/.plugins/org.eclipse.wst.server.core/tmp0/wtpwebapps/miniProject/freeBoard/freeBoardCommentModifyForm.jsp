

<%@page import="java.text.SimpleDateFormat"%>
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
	textarea
	{
		resize:none;
	}
</style>

<script type="text/javascript">

	function buttonClick(link)
	{	
		location.href = link;
	}
	
</script>

<script>
  
function checkform(frm)
{
	String.prototype.ltrim = function() {
	    return this.replace(/^\s+/,"");
	}
	String.prototype.rtrim = function() {
	    return this.replace(/\s+$/,"");
	}
	
	var contents = document.frm.contents.value;
	
	if(contents.ltrim() =="")
	{
		alert("내용을 입력하세요!!dfdfd");
		document.frm.contents.focus();
		return false;
	} 
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
		  <form name="frm" method="post" action="${pageContext.request.contextPath}/freeboard/commentmodify" onSubmit="return checkform(this)" >
		  		<input type="hidden" name="no" value="${board.no}" />
		      	<input type="hidden" name="commentNo" value="${board.commentNo}" />
		      	<input type="hidden" name="writer" value="${board.writer}" />
				
				<div class="input-group">
	  				<input name="readField" readonly="readonly" type="text" class="form-control" placeholder="${board.writer}" aria-describedby="basic-addon2">
	  				<span class="input-group-addon" id="basic-addon2">작성자</span>
				</div>
				
				<div class="input-group">
					<textarea name="contents" rows="22" cols="111">${board.contents}</textarea>
				</div>
				
				<div>
					<button type="submit" class="btn btn-warning customWriteButton">등록</button>
					<button type="button" class="btn btn-success customWriteButton" onclick="buttonClick('${pageContext.request.contextPath}/freeboard/detail?no=${board.no}');" >목록</button>
				</div>
				
				
			</form>
			
		</div>
	</div>
	
	<div class="bottom">
		<c:import url="/include/bottom.jsp"/>
	</div>	
</div>

<script type="text/javascript">
	$("ul.nav.navbar-nav > li").removeClass("active");
	$("ul.nav.navbar-nav > li:eq(2)").addClass("active");
</script>
</body>
</html>








































