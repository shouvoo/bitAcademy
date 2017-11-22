<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${pageResult.count != 0}">
	<nav>
	  <ul class="pagination">
	    <li>
	      <a href=<c:choose>
  						<c:when test="${pageResult.prev}">
  							"list3.do?pageNo=${pageResult.beginPage - 1}"
  						</c:when>
  						<c:otherwise>
						"#"	    		
  						</c:otherwise>
  					</c:choose> aria-label="Previous">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li>
	    <c:forEach var="i" begin="${pageResult.beginPage}" end="${pageResult.endPage}">
	    	<c:choose>
	    		<c:when test="${i eq pageResult.pageNo}">
	    			<li class="active"><a href="#${i}">${i}</a></li>
	    		</c:when>
	    		<c:otherwise>
					<li><a href="list4.do?pageNo=${i}">${i}</a></li>		    		
	    		</c:otherwise>
	    	</c:choose>
	    </c:forEach>
	    <li>
	      <a href=<c:choose>
  						<c:when test="${pageResult.next}">
  							"list4.do?pageNo=${pageResult.endPage + 1}"
  						</c:when>
  						<c:otherwise>
						"#"	    		
  						</c:otherwise>
  					</c:choose> aria-label="Next">
	        <span aria-hidden="true">&raquo;</span>
	      </a>
	    </li>
	  </ul>
	</nav>
</c:if>










