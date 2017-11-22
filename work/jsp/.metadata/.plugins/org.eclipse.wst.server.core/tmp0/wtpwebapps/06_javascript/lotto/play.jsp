<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
	.ball
	{
		height:50px;
	}
</style>

</head>
<body>
	<h6>로또 결과 페이지</h6>
	<h1>로또게임</h1>
	<div class="ball">
		
		<p1 id="ball0"></p1>
		<p1 id="ball1"></p1>
		<p1 id="ball2"></p1>
		<p1 id="ball3"></p1>
		<p1 id="ball4"></p1>
		<p1 id="ball5"></p1>
		
	</div>
	<button onclick="doAction();">추첨시작</button>
	
	<div>
		
		<table border = 1>
				<c:forEach var="i" begin="0" end="${fn:length(lottoList) - 1}">
					<tr>
					<td>
						${lottoList[i].name}
						<!-- ${fn:length(lottoList[i].lottoList)} -->
					</td>
					<c:forEach var="j" begin="0" end="${fn:length(lottoList[i].lottoList) - 1}">
						<td id="${i}${j}">
							${lottoList[i].lottoList[j]}
						</td>
					</c:forEach>
					<td>
						값
					</td>
					</tr>
				</c:forEach>
		</table>
		
	</div>
	
	<script type="text/javascript">
		
		var lottoArr = [];
		var interval1;
		var interval2;
		var cnt1 = -1;
		var ranNum = -1;
		
		for(var i = 0; i<45; i++)
		{
			lottoArr.push(i + 1);
		}
	
		function doAction()
		{
			alert(${fn:length(lottoList)});
			interval1();
		}
		
		
		function interval1()
		{
			interval1 = setInterval(interval2, 1000);
			if(cnt1 > 5) clearInterval(interval1);
		}
		
		function interval2()
		{
			if(ranNum != -1) lottoArr.splice(ranNum - 1, 1);
			cnt1++;
			interval2 = setInterval(result, 100);
		}
		
		function result()
		{
			
			if(cnt1 < 6)
			{
				var divEle = document.querySelector("#ball" + cnt1);
				ranNum = lottoArr[parseInt(Math.floor((Math.random() * lottoArr.length)))];
				console.log(ranNum);
				//divEle.innerHTML = `<img src="images/ball${ranNum}.gif">`;
				divEle.innerHTML = "<img src='images/ball" + ranNum + ".gif'>";
			} 
			
			if(cnt1 > 6)
			{
				clearInterval(interval2);
			}
		}
		
	</script>
	
</body>
</html>