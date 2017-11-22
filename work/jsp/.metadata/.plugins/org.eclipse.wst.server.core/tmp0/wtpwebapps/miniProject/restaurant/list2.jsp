<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1" class="table table-bordered">

	<tr>
		<th colspan="2">
			오늘의 메뉴
		</th>
	</tr>

	<tr>
		<td>
			식당
		</td>
		<td>
			IP
		</td>
	</tr>
	
	<c:forEach var="item" items="${list}">
	<tr>
		<td>
			${item.name }
		</td>
		<td>
			${item.ip }
		</td>
	</tr>
	</c:forEach>
	
	<c:if test="${not empty res }">
	<tr>
		<td>
			${res.name }
		</td>
		<td>
			${res.ip }
		</td>
	</tr>
	</c:if>
	
</table>