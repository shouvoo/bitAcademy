
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
<script type="text/javascript">

	var oldInput;
	var oldButton;
	
	var currentInput;
	var currentButton;

	function buttonClick(link, no)
	{	
		location.href = link + "?no=" + no;
	}

	function commentModify(inputTarget, modifyButton)
	{
		currentInput = document.getElementById(inputTarget);
		currentButton = document.getElementById(modifyButton);
		
		if(currentButton == oldButton)
		{
			document.modifyForm.action = "/miniProject/freeboard/commentmodify"; 
	        document.modifyForm.method = "post"; 
	        document.modifyForm.submit();
		}
		
		
		if(oldButton != undefined && oldButton.text == "등록")
		{	
			oldButton.text = "수정";
			oldInput.readOnly = true;
		}
		
		if(currentButton.text == "수정")
		{
			currentButton.text = "등록";
			currentInput.readOnly = false;
			currentInput.focus();
			
			oldInput = currentInput;
			oldButton = currentButton;

  			return;
		}
			

		
	}

	
	function nonkr() 
	{
		tvalue = document.writeCommentForm.contents;
		onvalue = tvalue.value;
		var searchStr = "\"'\[]!@#$^&*=\\,<>?！'，．／：；？＾｀｜￣‥…¨〃–―∥＼´ˇ˘˝˙¸˛¡¿ː（）［］｛｝〔〕〈〉《》「」『』【】＋－＜＝＞±×÷≠≤≥∞∴♂♀∠⊥⌒∂∇≡≒≪≫√∽∝∵∫∬∈∋⊆⊇⊂⊃∪∩∧∨￢⇒⇔∀∃∮∑∏＄％￦′″Å￠￡￥¤℉‰€㎕㎗㎘㏄㎣㎤㎦㎙㎚㎛㎞㎢㏊㎍㎎㎏㏏㎈㎉㏈㎧㎨㎰㎱㎲㎳㎴㎵㎶㎷㎸㎹㎀㎁㎂㎃㎄㎺㎻㎼㎽㎾㎿㎐㎑㎒㎓㎔Ω㏀㏁㎊㎋㎌㏖㏅㎭㎮㎯㏛㎩㎪㎫㎬㏝㏐㏓㏃㏉㏜㏆＃＆＊＠§※☆★○●◎◇◆□■△▲▽▼→←↑↓↔〓◁◀▷▶♤♠♡♥♧♣⊙◈▣◐◑▒▤▥▨▧▦▩♨☏☎☜☞¶†‡↕↗↙↖↘♭♩♪♬㉿㈜№㏇™㏂㏘℡ªº─│┌┐┘└├┬┤┴┼━┃┏┓┛┗┣┳┫┻╋┠┯┨┷┿┝┰┥┸╂┒┑┚┙┖┕┎┍┞┟┡┢┦┧┩┪┭┮┱┲┵┶┹┺┽┾╀╁╃╄╅╆╇╈╉╊㉠㉡㉢㉣㉤㉥㉦㉧㉨㉩㉪㉫㉬㉭㉮㉯㉰㉱㉲㉳㉴㉵㉶㉷㉸㉹㉺㉻㈀㈁㈂㈃㈄㈅㈆㈇㈈㈉㈊㈋㈌㈍㈎㈏㈐㈑㈒㈓㈔㈕㈖㈗㈘㈙㈚㈛ⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ①②③④⑤⑥⑦⑧⑨⑩⑪⑫⑬⑭⑮⒜⒝⒞⒟⒠⒡⒢⒣⒤⒥⒦⒧⒨⒩⒪⒫⒬⒭⒮⒯⒰⒱⒲⒳⒴⒵⑴⑵⑶⑷⑸⑹⑺⑻⑼⑽⑾⑿⒀⒁⒂ⅰⅱⅲⅳⅴⅵⅶⅷⅸⅹⅠⅡⅢⅣⅤⅥⅦⅧⅨⅩ½⅓⅔¼¾⅛⅜⅝⅞¹²³⁴ⁿ₁₂₃₄ＡＢＣＤＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴＵＶＷＸＹＺａｂｃｄｅｆｇｈｉｊｋｌｍｎｏｐｑｒｓｔｕｖｗｘｙｚΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρστυφχψωÆÐĦĲĿŁØŒÞŦŊæđðħıĳĸŀłøœßŧŋŉАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
		 
		count=0
		for (i=0;i<onvalue.length;i++)
		{
			ls_one_char = onvalue.charAt(i);
		
			if(searchStr.search(ls_one_char) != -1) 
			{
				count++
			}
		}
		
		if(count!=0) 
		{
			alert("숫자, 영문, 한글만 사용 가능")
			tvalue.value = "";
			tvalue.focus();
			return false;
		} else {
			return false;
		}
	}
	
</script>

<style type="text/css">
	textarea
	{
		resize:none;
	}
	
	.commentWriteField
	{
	  position: relative;
	  width: 800px;
	  margin: -80px auto;
	  color: #333;
	}
	
	.commentField
	{
	  position: relative;
	  width: 800px;
	  margin: 85px auto;
	  color: #333;
	}
	
	.inCommentField
	{
	  margin: 1px auto;
	}
	
	
	
	
</style>

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
			
			  <!-- Table -->
			   <table class="table">
	            <thead>
	              <tr>
	                <th>번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>작성일</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
		          	<td>${board.no}</td>
		            <td>${board.title}</td>
		            <td>${board.writer}</td>
		            <td>${board.regDate}</td>
		            
	              </tr>
	            </tbody>
	            
	          </table>
	          
			</div>
	        <textarea disabled="true" rows="15" cols="111">${board.contents}</textarea>
			<div>
				<c:if test="${board.writer == user.id}">
					<button type="button" class="btn btn-warning customWriteButton" onclick="buttonClick('${pageContext.request.contextPath}/freeboard/modifyform', '${board.no}');" >수정</button>
					<button type="button" class="btn btn-danger customWriteButton" onclick="buttonClick('${pageContext.request.contextPath}/freeboard/delete', '${board.no}');" >삭제</button>
				</c:if>
				<button type="button" class="btn btn-success customWriteButton" onclick="buttonClick('${pageContext.request.contextPath}/freeboard/freeboard', '${board.no}');" >목록</button>
			</div>
		</div>
	</div>
	
	<c:if test="${user != null}">
	<form name="writeCommentForm" method="post" action="${pageContext.request.contextPath}/freeboard/writecomment">
		<div class="input-group commentWriteField">
			<input type="hidden" name="no" value="${board.no}" />
			<input type="hidden" name="writer" value="${user.id}" />
			<input name="contents" type="text" class="form-control" onkeyup="return nonkr()" placeholder="내용" aria-describedby="basic-addon2">
			<span class="input-group-addon" id="basic-addon2"><button>등 록</button></span>
		</div>
	</form>
	</c:if>
	
	<form name="modifyForm">
	<div class="commentField">
		<c:forEach items="${commnetBoard}" var="comment">
			<div class="input-group inCommentField">
				<span name="writer" class="input-group-addon" id="basic-addon2">${comment.writer}</span>
				<input id="modifyInput${comment.commentNo}" name="contents" type="text" class="form-control" placeholder="${comment.contents}"  readonly="readonly" aria-describedby="basic-addon2">
				<%-- <span class="input-group-addon" id="basic-addon2"><a href="${pageContext.request.contextPath}/freeboard/commentmodifyform?no=${comment.no}&commentNo=${comment.commentNo}">수정</a></span> --%>
				<c:if test="${comment.writer == user.id}">
					<span class="input-group-addon" id="basic-addon2">
						<input type="hidden" name="no" value="${comment.no}" />
						<input type="hidden" name="commentNo" value="${comment.commentNo}" />
						<input type="hidden" name="writer" value="${comment.writer}" />
						<a id="modifyButton${comment.commentNo}" href="javascript:void(0)" onclick="commentModify('modifyInput${comment.commentNo}', 'modifyButton${comment.commentNo}');">수정</a>
						
					</span>
				</c:if>
				<c:if test="${comment.writer == user.id}">
					<span class="input-group-addon" id="basic-addon2">
						<a href="${pageContext.request.contextPath}/freeboard/commentdelete?no=${comment.no}&commentNo=${comment.commentNo}">삭제</a>
					</span>
				</c:if>
			</div>
		</c:forEach>
	</div>
	</form>
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


















