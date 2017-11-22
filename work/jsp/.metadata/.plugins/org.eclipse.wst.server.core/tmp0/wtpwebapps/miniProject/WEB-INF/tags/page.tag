<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="data" type="common.PageResult" %>

<c:if test="${data.count != 0}">
	<nav>
	  <ul class="pagination">
	    <li>
	      <a href=<c:choose>
  						<c:when test="${data.prev}">
  							"freeboard?pageNo=${data.beginPage - 1}"
  						</c:when>
  						<c:otherwise>
						"#"	    		
  						</c:otherwise>
  					</c:choose> aria-label="Previous">
	        <span aria-hidden="true">&laquo;</span>
	      </a>
	    </li>
	    <c:forEach var="i" begin="${data.beginPage}" end="${data.endPage}">
	    	<c:choose>
	    		<c:when test="${i eq data.pageNo}">
	    			<li class="active"><a href="#${i}">${i}</a></li>
	    		</c:when>
	    		<c:otherwise>
					<li><a href="freeboard?pageNo=${i}">${i}</a></li>		    		
	    		</c:otherwise>
	    	</c:choose>
	    </c:forEach>
	    <li>
	      <a href=<c:choose>
  						<c:when test="${data.next}">
  							"freeboard?pageNo=${data.endPage + 1}"
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

