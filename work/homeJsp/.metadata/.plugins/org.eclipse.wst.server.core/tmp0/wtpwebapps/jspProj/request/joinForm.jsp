<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		
		<script type="text/javascript">
			function gogo(i)
			{
				alert('또 눌렀냐' + i);
			}
		</script>
	</head>
	
	
	<!-- size="10" 글자제한 --> 
	<!-- maxlength="7" 글자제한 더 많이 쓰임--> 
	<body>
		<form action="joinReg.jsp" method="post">

			<table border="1">
				<tr>
					<td>id</td>
					<td>
						<input name="id" type="text" maxlength="7">
						<input type="button" value="중복확인" onClick="gogo('abcd')">
					</td>
				</tr>
				
				<tr>
					<td>pw</td>
					<td><input name="pw" type="password" maxlength="7"></td>
				</tr>
				
				<tr>
					<td>성별</td>
					<td>
						<input type="radio" name="gender" value="m">남
						<input type="radio" name="gender" value="f" checked="checked">여
					</td>
				</tr>
				
				<tr>
					<td>취미</td>
					<td>
						<input type="checkbox" name="hobby" value="read">독서
						<input type="checkbox" name="hobby" value="fish" checked="checked">낚시
						<input type="checkbox" name="hobby" value="clim" checked="checked">등산
						 <!--input태그 checked="checked" 초기값을 부여해준다 -->
					</td>
				</tr>
				
				<tr>
					<td>file</td>
					<td><input name="upfile" type="file"></td>
				</tr>
				
				<tr>
					<td>이메일</td>
					<td>
						<input name="email1" type="text">@
						<select name="email2">
							<option value="naver.com">네이버</option>
							<option value="google.com">구글</option>
							<option value="daum.net" selected="selected">다음</option>
							<!-- option태그 selected="selected"  초기값을 부여해준다 -->
							<option value="jum.com">줌</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>내용</td>
					<td>
						<textarea name="content" rows="5" cols="50">afdsafasdfasfas
dsfgsadfasdfasf
dsfadfasdfasdfasdf
						</textarea>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="가입">
						<input type="reset" value="초기화">
					</td>
				</tr>
			</table>
		
			<!-- id : <input name="id" type="text" maxlength="7"><br> 
			pw : <input name="pw" type="password" maxlength="7"><br> 
			성별 : <input type="radio" name="gender" value="m">남 <input type="radio" name="gender" value="f">여 <br> 
			<input type="submit"> -->
			
		</form>
	</body>
</html>




















