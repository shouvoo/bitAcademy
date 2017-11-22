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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="http://code.jquery.com/jquery-2.1.4.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
.writeTitle{font: 20px bold; color: #0085D5; background: rgb(239, 239, 239); width: 100%;
margin-bottom: 10px;}
.input *, .select *{height: 27px; margin: 5px;}
.input *{border: 1px solid black; }
.input span{border-bottom-left-radius: 5px; border-top-left-radius: 5px;
display: inline-block; width: 50px;}
.input input{border-bottom-right-radius: 5px; border-top-right-radius: 5px;}
.hh, .hidden1, .hidden2, .hidden3, .hidden4 {border: 2px solid black; width: 666}
.hidden1, .hidden2, .hidden3, .hidden4 {display: none;}
.submit{margin-top: 10px;}
textarea {width: 500px;}
.filebox, .filebox1, .filebox2, .filebox3, .filebox4 {border: none;}
#ex_filename {display: none;}
.content{/* margin-top: 50px; */}
.youtube:focus ~ .tt{display: block;}
.tt{display: none;}
</style>

<script>
function hh(a){
	$('.hidden'+a).css('display','block');
	$('.button'+a).css('display','none');
	document.getElementsByName("hiddenfile"+(a))[0].name="file"+(a+1);
	document.getElementsByName("hiddencontent"+(a+1))[0].name="content";
}

function chk() {
	if(!document.form1.title.value){
		alert("제목을 입력하세요."); return false;}
	
	var size = 0;
	
	if(!document.form1.content.value){
		for (var i = 0; i < document.form1.content.length; i++) {
			size += document.form1.content[i].value.length;
		}
	} else {
		size += document.form1.content.value.length;
	}

	if(size > 2000){
		alert("제한 된 글자 수를 초과하였습니다."); return false;}
	
	var IMG_FORMAT = "\.(bmp|gif|jpg|jpeg|png)$";
	var maxSize  = 10 * 1024 * 1024;
	var fileSize = 0;

	if(document.form1.file1){
		fileSize += document.form1.file1.files[0].size;
		if(!new RegExp(IMG_FORMAT, "i").test(document.form1.file1.value)) {
	    	alert("파일은 필수 첨부입니다.(이미지 파일 외 입력 불가)");
	    	return false;
		} else {
			if(document.form1.file2){
				fileSize += document.form1.file2.files[0].size;
				if(!new RegExp(IMG_FORMAT, "i").test(document.form1.file2.value)) {
			    	alert("파일은 필수 첨부입니다.(이미지 파일 외 입력 불가)");
			    	return false;
				} else {
					if(document.form1.file3){
						fileSize += document.form1.file3.files[0].size;
						if(!new RegExp(IMG_FORMAT, "i").test(document.form1.file3.value)) {
					    	alert("파일은 필수 첨부입니다.(이미지 파일 외 입력 불가)");
					    	return false;
						} else {
							if(document.form1.file4){
								fileSize += document.form1.file4.files[0].size;
								if(!new RegExp(IMG_FORMAT, "i").test(document.form1.file4.value)) {
							    	alert("파일은 필수 첨부입니다.(이미지 파일 외 입력 불가)");
							    	return false;
								} else {
									if(document.form1.file5){
										fileSize += document.form1.file5.files[0].size;
										if(!new RegExp(IMG_FORMAT, "i").test(document.form1.file5.value)) {
									    	alert("파일은 필수 첨부입니다.(이미지 파일 외 입력 불가)");
									    	return false;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	if(fileSize > maxSize){
		alert("총 10MB까지만 첨부 가능합니다."); return false;
	}
	
	if(document.form1.content.value){
		if(document.form1.content.value == '내용을 입력하세요.' || !document.form1.content.value) {
		    alert("텍스트 문서가 비었습니다."); return false;}
	} else {
		for (var i = 0; i < document.form1.content.length; i++) {
			if(document.form1.content[i].value == '내용을 입력하세요.' || !document.form1.content[i].value) {
			    alert("텍스트 문서가 비었습니다."); return false;}
		}
	}

    return true;
}
</script>

<c:choose>
<c:when test="${empty user.id}">
<script>
alert("로그인을 해주세요.");
location.href='list';
</script>
</c:when>

<c:otherwise>
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
	<form action="${pageContext.request.contextPath }/fix/writeinsert" method="post"
	enctype="multipart/form-data" name="form1" onsubmit="return chk()" style="height: 800px;">
	
	<div class="writeTitle">
		새로운 글
	</div>
	
	<div class="input">
		<span>제목</span>:
		<input type="text" name="title">
	</div>
	
	<div class="input">
		<span>작성자</span>:
		<input type="text" value="${user.name }" name="writer" readonly="readonly">
	</div>

	<div class="select">
		<span><select name="cate">
			<option value="휴대전화">휴대전화</option>
			<option value="노트북">노트북</option>
			<option value="데스크탑">데스크탑</option>
			<option value="디스플레이">디스플레이</option>
			<option value="콘솔">콘솔</option>
			<option value="가전제품">가전제품</option>
		</select></span>

		<span><select name="brand">
			<option value="삼성">삼성</option>
			<option value="엘지">엘지</option>
			<option value="애플">애플</option>
			<option value="도시바">도시바</option>
			<option value="샤오미">샤오미</option>
			<option value="기타">기타</option>
		</select></span>
	</div>
	
	<div>
	영상 링크:<input type="text" name="youtube" class="youtube"> <span class="tt"> ※링크만 입력해주세요.</span>
	</div>
	
	<div class=hh>
	<div class="input">
		<div class="filebox">
			<input type="file" name="file1">
		</div>
	</div>
	
	<div class="input">
		<textarea name="content" id="co" style="height: 50px;"
		onclick="if (this.value == '내용을 입력하세요.') {this.value = ''}">내용을 입력하세요.</textarea>
	</div>
	
	<div class="button1">
		<button type="button" onclick="hh(1)">내용 추가하기</button>
	</div>
	</div>
	
	<c:forEach begin="1" end="3" varStatus="num">
	<div class="hidden${num.count }">
	<div class="input">
		<div class="filebox">
			<input type="file" name="hiddenfile${num.count }">
		</div>
	</div>

	<div class="input">
		<textarea name="hiddencontent${num.count+1 }" id="co" style="height: 50px;"></textarea>
	</div>
	
	<div class="button${num.count+1 }">
		<button type="button" onclick="hh(${num.count+1 })">내용 추가하기</button>
	</div>
	</div>
	</c:forEach>
	
	<div class="hidden4">
	<div class="input">
		<div class="filebox">
			<input type="file" name="hiddenfile4">
		</div>
	</div>
	
	<div class="input">
		<textarea name="hiddencontent5" id="co" style="height: 50px;"></textarea>
		<br>이미지는 최대 5개만 첨부됩니다.
	</div>
	</div>

	<div class="submit">
		<input type="submit">
	</div>
	
	</form>
</div>
</c:otherwise>

</c:choose>
<div class="bottom">
		<c:import url="/include/bottom.jsp" />
</div>
</div>
</div>
</div>
</div>	

<script>
$("ul.nav.navbar-nav > li").removeClass("active");
$("ul.nav.navbar-nav > li:eq(1)").addClass("active");
</script>








