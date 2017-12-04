<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ include file="/WEB-INF/jsp/include/mir.jsp"%>
<%@ include file="/WEB-INF/jsp/include/include.jsp"%>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
[data-type="civa"] {
	width: 10%;
}
h4{text-decoration: underline;}
</style>
<body>
	<div class="mySlides w3-display-container w3-center">
		<img src="${pageContext.request.contextPath }/image/jsp.gif"
			style="height: 200px;">
		<div
			class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
		</div>
	</div>

	<div class="mySlides w3-display-container w3-center">
		<img src="${pageContext.request.contextPath }/image/sql.png"
			style="height: 200px;">
		<div
			class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
		</div>
	</div>

	<div class="mySlides w3-display-container w3-center">
		<img src="${pageContext.request.contextPath }/image/android.png"
			style="height: 200px;">
		<div
			class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
		</div>
	</div>

	<div class="w3-container w3-content w3-center w3-padding-64"
		style="max-width: 800px; background-color: white;" id="band">
		<p class="w3-opacity">조회수: ${board.look }</p>
		<h1 class="w3-wide">${board.title}</h1>
		<p class="w3-opacity">
			<i>${board.writer }</i>
		</p>
		<p class="w3-justify">${board.contents}</p>
		<button type="button" class="Y"
			style="border: none; margin-right: 10px; height: 81px; width: 85px; background: url(/mini2-home/civa/choo.png);">
			<br>${choo }
		</button>
		<button type="button" class="N"
			style="border: none; height: 81px; width: 85px; background: url(/mini2-home/civa/down.png);">
			<br>${down }
		</button>
	</div>

	<div class="w3-container w3-center"
		style="width: 800px; background: white; margin-left: 356px; margin-top: 20px;" cla
		class="clist">
		<h6 class="w3-opacity">댓글</h6>
		<p contenteditable="true" class="w3-border w3-padding" id="ciba">댓글을 입력하세요.</p>
		<button type="button" class="w3-button w3-theme" id="siba">
			<i class="fa fa-pencil"></i> &nbsp;Post
		</button>
		<div class="siba">
		<c:forEach items="${comment }" var="c">
			<h4 style="">작성자:${c.commentWriter }| ${c.commentContents }</h4>
		</c:forEach>
		</div>
	</div>

	<div class="w3-row">
		<c:forEach items="${file }" var="f">
			<div class="w3-center" data-type="civa" data-name="${f.systemName }">
				<c:set var="fileName" value="${fn:split(f.systemName, '.')}" />
				<c:choose>
					<c:when test="${fileName[fn:length(fileName)-1] eq 'xml'}">
						<img
							src="${pageContext.request.contextPath }/civa/${fileName[fn:length(fileName)-1]}.png"
							style="width: 45%" class="w3-circle w3-hover-opacity">
					</c:when>
					<c:when test="${fileName[fn:length(fileName)-1] eq 'java'}">
						<img
							src="${pageContext.request.contextPath }/civa/${fileName[fn:length(fileName)-1]}.png"
							style="width: 45%" class="w3-circle w3-hover-opacity">
					</c:when>
					<c:when test="${fileName[fn:length(fileName)-1] eq 'jsp'}">
						<img
							src="${pageContext.request.contextPath }/civa/${fileName[fn:length(fileName)-1]}.png"
							style="width: 45%" class="w3-circle w3-hover-opacity">
					</c:when>
					<c:when test="${fileName[fn:length(fileName)-1] eq 'txt'}">
						<img
							src="${pageContext.request.contextPath }/civa/${fileName[fn:length(fileName)-1]}.png"
							style="width: 45%" class="w3-circle w3-hover-opacity">
					</c:when>
					<c:otherwise>
						<img
							src="${pageContext.request.contextPath }/civa/${fileName}.png"
							style="width: 45%" class="w3-circle w3-hover-opacity">
					</c:otherwise>
				</c:choose>
				<p>${f.originalName }</p>
			</div>
		</c:forEach>
	</div>

	<script type="text/javascript">
		var path = '${pageContext.request.contextPath }';
		
		function choo(siba) {
			var dd = "boardNo=${param.no}&memberNo=${user.memberNo}&likeHate="+siba;
			$.ajax({
				url: path+"/study/like.json",
				data: dd,
				success: function (data) {
					if(Array.isArray(data)) {
						alert(data[0]);				
						if(!confirm(data[1])) return;
						else {
							$.ajax({
								url: path+"/study/likeup.json",
								data: dd,
								success: function (data) {
									$(".Y").html("<br>"+ddd[0]);
									$(".N").html("<br>"+ddd[1]);
								}
							})
						}
					} else if(typeof data === 'string') alert(data);
					else {
						$("."+siba).html("<br>"+data);						
					}
				}
			});
		}
		
		$(".Y").click(function () {
			choo("Y");
		});
		$(".N").click(function () {
			choo("N");
		});
		
		$("#siba").click(function () {
			$.ajax({
				url: path+"/study/comment.json",
				data: "commentContents="+$("#ciba").text()+"&boardNo="+"${param.no}&commentWriter=${user.name}",
				success: function (data) {
					$("#ciba").text("");
					$(".siba").empty();
					for (var i = 0; i < data.length; i++) {
						$(".siba").append($("<h4>").text("작성자:"+data[i].commentWriter+"| "+data[i].commentContents));						
					}
				}
			})
		});

		$("[data-type='civa']").click(function() {
			var filename = $(this).attr("data-name");
			var xhr = new XMLHttpRequest();
			xhr.responseType = 'blob';
			xhr.onload = function() {
				var a = document.createElement('a');
				a.href = window.URL.createObjectURL(xhr.response); // xhr.response is a blob
				a.download = filename; // Set the file name.
				a.style.display = 'none';
				document.body.appendChild(a);
				a.click();
				delete a;
			};
			xhr.open('GET', path + "/civa/" + filename);
			xhr.send();
		});

		var myIndex = 0;
		carousel();

		function carousel() {
			var i;
			var x = document.getElementsByClassName("mySlides");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {
				myIndex = 1
			}
			x[myIndex - 1].style.display = "block";
			setTimeout(carousel, 4000);
		}
	</script>
</body>
</html>