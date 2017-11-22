<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
.ww{height: 21px; width: 150px;
 overflow: hidden; text-overflow: ellipsis; white-space: nowrap;}
</style>
<script src="http://code.jquery.com/jquery-2.1.4.js"></script>
<script>
function view(i){
	$('.'+i).css('display','block');
}
</script>
<c:if test="${not empty param.chk }">
<script>
alert("로그인을 해주세요.");
</script>
</c:if>
<table border=1 width=100%>
<c:if test="${not empty user.id }">
<form action="dutwrite" method="post">
				<tr>
					<td width="150"><div class="ww">작성자: ${user.name }
					<input type="hidden" name=no value="${param.no }"></div></td>
					<td width>덧글: <input type="text" name="content" style="width: 80%"></td>
					<td width=100><button>제출</button></td>
				</tr>
</form></c:if>

				<c:if test="${empty list == false}">
				<c:forEach items="${list }" var="dut" varStatus="qqq">
				<tr>
					<td width="150">
						<div class="ww" title="${dut.writer }">작성자:${dut.writer }</div>
					</td>
						<c:choose>
							<c:when test="${cno == dut.commentNo && user.id == dut.id}">
							<form action="dutmodify" method="post">
								<td>
								<input type="hidden" name="no" value="${param.no}">
								<input type="hidden" name="cno" value="${dut.commentNo}">
								내용:<input type="text" name="content" value="${dut.content }" style="width: 80%">
								</td>
								<td>
								<button>수정</button>
							</form>	
							</c:when>

							<c:otherwise>
								<td>
								내용:${dut.content }
								</td>
							
								<td>
								<c:if test="${dut.id == user.id }">
								<a href="javascript:;" onClick="if (confirm('댓글을 삭제 하시겠습니까?')) location.href='dutdelete?cno=${dut.commentNo}&no=${param.no}'">삭제</a>	
								<a href="?cno=${dut.commentNo}&no=${param.no}">수정</a>
								<a href="#" onclick="view('${qqq.index}')">대댓글</a>
								</c:if>
								</td>
							</c:otherwise>
					</c:choose>
				</tr>
				
				<c:if test="${not empty dut.list }">
				<c:forEach items="${dut.list }" var="re">
					<tr>
						<td><img src=http://www.gadgettrader.sg/img/icon/reply_icon.png height=20></td>
						<td>${re.writer }: ${re.content }</td>
						<td>
						<c:if test="${user.id == re.id }">
						<a href="javascript:;" onClick="if (confirm('댓글을 삭제 하시겠습니까?')) location.href='${pageContext.request.contextPath }/fix/redutdel?cno=${re.recommentNo }&no=${param.no}'">삭제</a>	
						</c:if>
						</td>
					</tr>
				</c:forEach>
				</c:if>
				
				<tr style="display: none;" class="${qqq.index}">
					<form action="redutwrite" method="post">
					<td width="150"><div class="ww">
					<input type="hidden" name="no" value="${param.no }">
					<img src=http://www.gadgettrader.sg/img/icon/reply_icon.png height=20>
					<input type="hidden" name=cno value="${dut.commentNo}"></div></td>
					<td width>대댓글: <input type="text" name="content" style="width: 80%"></td>
					<td width=100><button>제출</button></td>
					</form>
				</tr>
				
				</c:forEach>
				</c:if>
			</table>