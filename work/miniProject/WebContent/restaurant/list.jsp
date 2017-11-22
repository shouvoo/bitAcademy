<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
a{text-decoration: none; align-self: ; font-style: oblique;}
.asc{color: blue;}
.desc{color: red;}
.title td {background: gray; border-style:none;
border-left: 2px solid black; border-bottom: 2px solid black;}
.top th {border-bottom: 2px solid black;}
.title .a{width: 30px; border-left: 1px solid pink;}
</style>
<table border="1" class="table table-hover">

	<tr class="top">
		<th colspan="8" style="border-right: none;">
			전체 목록| ${page }페이지
		</th>
		<th style="text-align: right; border-left: none;">
			글 갯수:${size }
		</th>
	</tr>
	
	<tr class="title">
		<td width=110>
			상호
		</td>
		<td class="a">
			<a href="?order=name asc" class="asc">↑</a><a href="?order=name desc" class="desc">↓</a>
		</td>
		<td width=220 colspan="2">
			거리
		</td>
		<td width=70>
			맛
		</td>
		<td class="a">
			<a href="?order=fla asc" class="asc">↑</a><a href="?order=fla desc" class="desc">↓</a>
		</td>
		<td width=220>
			가격
		</td>
		<td class="a">
			<a href="?order=price asc" class="asc">↑</a><a href="?order=price desc" class="desc">↓</a>
		</td>
		<td width=390>
			기타
		</td>
	</tr>
	
		<c:forEach var="rest" items="${list }">
				<tr>
					<td colspan="2">
						${rest.name }
					</td>
					<td>
						${rest.street }
					</td>
					<td>
						<a href="?page=${page }&q=${rest.addr }&tab=${tab}">지도</a>
					</td>
					<td colspan="2">
						${rest.flavor }
					</td>
					<td colspan="2">
						${rest.price }
					</td>
					<td>
						${rest.etc }
					</td>
		</c:forEach>
		
		<c:choose>
			<c:when test="${not empty param.tab }">
				<c:set var="pp" value="${param.tab}" />
			</c:when>
			<c:otherwise>
				<c:set var="pp" value="${tab}" />
			</c:otherwise>
		</c:choose>
		
		<c:set var="i" value="${pp*3-2}" />
		<tr><td colspan=9 align="center">
		<nav><ul class="pagination">
			<li>
			<a href="
			<c:choose>
     		 <c:when test="${pp != 1}">
     		 ?tab=${pp-1}&page=${(pp-1)*3}&order=${param.order}
      		 </c:when>
      		 <c:otherwise>
      		 #
      		 </c:otherwise>
      		</c:choose>
      		" aria-label="Previous"><span aria-hidden="true">&laquo;</span>
      		</a>
  			</li>
			<c:forEach begin="${i}" end="${pp*3}">
				<c:if test="${i<=lsize }">
					<li><a href="?page=${i}&order=${param.order}&tab=${pp}">${i}</a></li>
				<c:set var="i" value="${i+1}" />
				</c:if>
			</c:forEach>
			<li>
      		<a href="
			<c:choose>
     		 <c:when test="${pp*3 < lsize}">
     		 ?tab=${pp+1}&page=${pp+3}&order=${param.order}
      		 </c:when>
      		 <c:otherwise>
      		 #
      		 </c:otherwise>
      		</c:choose>
      		" aria-label="Next"><span aria-hidden="true">&raquo;</span>
      		</a>
  			</li>
		</ul></nav>
		</td></tr>
	
</table>