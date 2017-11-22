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
	#player
	{ 
		position:fixed; /*고정*/ 
		right:0; 
		//bottom:0; /*오른쪽, 아래에 여백을 두지않고 꽉차게 표시*/ 
		width:auto; 
		min-width:100%; /*동영상 너비를 꽉차게*/ 
		height:auto; 
		min-height:100%; /*동영상 높이를 꽉차게*/ 
		z-indez:-100; /*다른요소보다 아래에 위치*/ 
		background:url(대체이미지.jpg) no-repeat; 
		background-size:cover; /*대체 이미지 지정*/ 
	}

</style>

<script type="text/javascript">
	var cnt = 0;
	var videoPathArr = ["${pageContext.request.contextPath}/video/fisScreen1.mp4",
		                "${pageContext.request.contextPath}/video/fixyou.mp4",
		                "${pageContext.request.contextPath}/video/motorcycleFix.mp4"];
	if(window.addEventListener){
	    window.addEventListener('load', function(){
	        if(window.HTMLVideoElement){
	            var player = document.getElementById('player');
	            player.addEventListener("ended", function(){
	                // 동영상 재생이 끝나면 실행될 코드
	                if(player.canPlayType("video/mp4")){
	                		++cnt;
	　                 				   player.src = videoPathArr[cnt];
	                } else if(player.canPlayType("video/webm")){
	                       player.src = "http://fllkorea2.mireene.com/test/videos/leedaeho.webm";
	                }
	                player.play();
	            });
	        }
	    }, false);
	}
	
	function autoPlay()
	{
		
		var player = document.getElementById('player');
		player.src = "${pageContext.request.contextPath}/video/fisScreen1.mp4";
		player.play();
	}
</script>

</head>
<body onload="autoPlay()">
	<div class="container">
		<div>
		  <img alt="full screen background image" src="${pageContext.request.contextPath}/img/main/main0.jpg" id="full-screen-background-image" /> 
	
		</div>
	
		<div class="header">
			<c:import url="/include/topMenu.jsp" />
		</div>
	
		<video id="player" autoplay="autoplay">
	   	 	<source src="${pageContext.request.contextPath}/video/fisScreen1.mp4" type="video/mp4">
		</video>
		
		<div class="bottom">
			<c:import url="/include/bottom.jsp" />
		</div>	
	</div>

</body >
</html>


















