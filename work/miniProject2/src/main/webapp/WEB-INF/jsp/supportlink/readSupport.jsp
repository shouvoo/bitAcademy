<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.2.1.js"
  integrity="sha256-DZAnKJ/6XZ9si04Hgrsxu/8s717jcIzLy3oi35EouyE="
  crossorigin="anonymous">
</script>
</head>
<body>
	<h1>CURRICULUM</h1>
	<form id="frm">
		타이틀 : <input type="text" name="title">
		사이트 : <input type="text" name="site">
	</form>
	
	<script type="text/javascript">

	var path = '${pageContext.request.contextPath}';

	$(document).ready(function() {
		callAjax();
	})

	function callAjax()
	{
		$.ajax({
			url : path+"/supportlink/readSupport.json",
			dataType : "json",
			success : (data) => 
			{
				var members = data; // ECMA 5버젼 이후 방식					
				console.log(data);
			}
		})
	}
	</script>
</body>
</html>