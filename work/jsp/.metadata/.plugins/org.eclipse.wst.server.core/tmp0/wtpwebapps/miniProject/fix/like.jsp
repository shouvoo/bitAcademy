<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
.boardLike{font: 20px bold; color: #0085D5; float: right;}
a{color: #0085D5;}
</style>
<c:if test="${not empty param.chk }">
<script>
alert("로그인을 해주세요.");
</script>
</c:if>
<span class="boardLike"><a href="like?no=${param.no}">추천</a>: ${param.like }개|</span>