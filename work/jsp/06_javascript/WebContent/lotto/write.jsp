<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>환영합니다~</h1>
		<h3>이름과 로또 번호를 입력 후 전송버튼을 누르세요</h3>
		
		<form method="post" name="frm" action="${pageContext.request.contextPath}/lotto/saveData.do" onsubmit="return checkform(this);">
			<div>
				<span>이름<input id="writer" name="writer" type="text"></span>
			</div>
			
			<div>
				<span>번호
					<c:forEach var="i" begin="1" end="6" >
						<input id="l${i}" name="lottoNumber" type="text" size="5">
					</c:forEach>
				</span>
			</div>
			<button type="submit">전송</button>		
			<button type="button" onclick="reset();">재작성</button>		
		</form>
	</div>
	
	<script type="text/javascript">
	
	String.prototype.ltrim = function() {
	    return this.replace(/^\s+/,"");
	}
	String.prototype.rtrim = function() {
	    return this.replace(/\s+$/,"");
	}
	
	function checkform(frm)
	{		
		var writer = document.querySelector("#writer");
		
		if(writer.value.ltrim() == "")
		{
			alert("이름을 입력하세요!!");
			writer.focus();
			return false;
		} 
		
		for(var i = 1; i<=6; i++)
		{
			
			//var field = document.querySelector(`#l${i}`);
			var field = document.querySelector("#l"+i);
			
			if(field.value.ltrim() == "")
			{
				alert(i + "번째 필드에 번호를 입력하세요!!");
				field.focus();	
			} else 
			{
				continue;			
			}

			return false;
		} 
	}
	
	function reset()
	{
		location.href = "${pageContext.request.contextPath}/lotto/write.do";
	}
	
	</script>
</body>
</html>













