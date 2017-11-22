<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function buttonClick(src)
	{
		location.href = src;
	}
	
	function checkform(frm)
	{
		var sYear = document.frm.sYear;
		var eYear = document.frm.eYear;
		
		var s = 0;
		var e = 0;
		
		for(var i=0; i<sYear.length; i++)
		{
			s += sYear[i].value;
			e += eYear[i].value;
			//return false;
		}
		
		if(s <= e) return true;
		else 
		{
			alert("시작년도가 큽니다 다시 선택해 주세요!!")
			return false;
		}
	}
</script>

</head>
<body>
	
	<div>
	
		<form name="frm" method="post" action="${pageContext.request.contextPath}/search/result.do"   onSubmit="return checkform(this)">	
			<table border=1>
				<tr>
					<th colspan="6">사원 정보 검색</th>
				</tr>
				<tr>
					<td>이름</td>
					<td><input name="name" type="text" ></td>
					<td>성별</td>
					<td>
						<input type="checkbox" name="gender" value="1" />남
						<input type="checkbox" name="gender" value="2" />여
					</td>
					<td>종교</td>
					<td>
						<select size="1" name="religion" >
							
							<c:forEach var="religion" items="${religion}">
								 <option value="${religion.religionCode}" selected> ${religion.religionName} </option>
							</c:forEach>
							<option value="-1" selected> 전체 </option>
					    </select>
					</td>
				</tr>
				<tr>
					<td>학력</td>
					<td>
						<c:forEach var="school" items="${school}">
							 <input type="checkbox" name="school" value="${school.schoolCode}" />${school.schoolName}
						</c:forEach>
					</td>
					<td>기술</td>
					<td colspan="3">
						<c:forEach var="skill" items="${skill}">
							<input type="checkbox" name="skill" value="${skill.skillCode}" />${skill.skillName}
						</c:forEach>
					</td>
				</tr>
				<tr>
					<td>졸업일</td>
					<td colspan="5">
						<select size="1" name="sYear" >
							<c:forEach var="i" begin="1900" end="2017">	
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>년
						<select size="1" name="sYear" >
							<c:forEach var="i" begin="1" end="12">	
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>월
						<select size="1" name="sYear" >
							<c:forEach var="i" begin="1" end="31">	
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>일  ~  
						<select size="1" name="eYear" >
							<c:forEach var="i" begin="1900" end="2017">	
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>년
						<select size="1" name="eYear" >
							<c:forEach var="i" begin="1" end="12">	
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>월
						<select size="1" name="eYear" >
							<c:forEach var="i" begin="1" end="31">	
								<option value="${i}">${i}</option>
							</c:forEach>
						</select>일
					</td>
				</tr>
			</table>
			
			<button type="submit">검색</button>	
			<button type="button" onclick="buttonClick('${pageContext.request.contextPath}/search/total.do')">전부검색</button>
			<button type="button" onclick="buttonClick('${pageContext.request.contextPath}/search/searchform.do')">초기화</button>
			<button type="button">등록</button>
		</form>	
	</div>
	<c:choose>
		<c:when test="${templesList != null and !empty templesList}">
			<div>
				<table border=1>
					<tr>
						<th>번호</th>
						<th>이름</th>
						<th>성별</th>
						<th>종교</th>
						<th>졸업일</th>
						<th></th>
					</tr>
					<tr>
						<c:forEach var="temples" items="${templesList}">
							<tr>
								<td>${temples.staffNo}</td>
								<td>${temples.staffName}</td>
								<td>${temples.gender}</td>
								<td>${temples.religionName}</td>
								<td>${temples.graduateDay}</td>
								<td>
									<button type="button"  onclick="buttonClick('${pageContext.request.contextPath}/search/modifyanddelete.do')">수정/삭제</button>
								</td>
							<tr>
						</c:forEach>
					</tr>
				</table>
			</div>
		</c:when>
		
		<c:otherwise>
			<h1>.............................................</h1>
		</c:otherwise>
	</c:choose>
	
</body>
</html>