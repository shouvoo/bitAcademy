<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1" class="table table-bordered">
	<tr>
		<th colspan="2">
			<c:choose>
			<c:when test="${not empty msg }">
				${msg }
			</c:when>
			<c:otherwise>
				랜덤
			</c:otherwise>
			</c:choose>
		</th>
	</tr>
	
	<c:choose>

	<c:when test="${empty rest.ip }">
	<tr>
		<td>
			상호: ${rest.name }
		</td>
		<td>
			거리: ${rest.street }
		</td>
	</tr>
	
	<tr>
		<td>
			맛 : ${rest.flavor }
		</td>
		<td>
			가격: ${rest.price }
		</td>
	</tr>
	
	<tr>
		<td>
			기타: ${rest.etc }
		</td>
		<td>
			<a href="main?ran=true"><button>랜덤</button></a>
		</td>
	</tr>
	</c:when>
	
	<c:otherwise>
		<tr>
			<td>
				결과: ${rest.name }
			</td>
			<td>
				IP: ${rest.ip }
			</td>
		</tr>
	</c:otherwise>
	</c:choose>
</table>