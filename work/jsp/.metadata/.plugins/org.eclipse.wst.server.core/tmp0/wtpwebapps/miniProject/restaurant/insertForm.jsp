<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="insert" method="post">
	<table border="1" class="table table-condensed">
	
	<tr>
		<th colspan="2">
			식당 입력
		</th>
	</tr>
	
	
		<tr>
			<td>
				상호: <input type="text" name="name">
			</td>
			<td>
				거리: <input type="text" name="street">
				주소: <input type="text" name="addr">
			</td>
		</tr>
		
		<tr>
			<td>
				맛 : <input type="text" name="flavor">
			</td>
			<td>
				가격: <input type="text" name="price">
			</td>
		</tr>
		
		<tr>
			<td>
				기타: <input type="text" name="etc">
			</td>
			<td>
				<button>제출</button>
			</td>
		</tr>
	</table>
</form>