package day02;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day02/test04")
public class Test04 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// 파라미터 : fruit
		Map<Integer, String> fruitMap = new HashMap<>();
		fruitMap.put(1, "사과");
		fruitMap.put(2, "포도");
		fruitMap.put(3, "딸기");
		
		String [] fruit = request.getParameterValues("fruit"); // 동일한 이름의 값을 여러개 받을때 사용
		
		if(fruit != null)
		{
			for(String f : fruit)
			{
				System.out.println(f);
			}
		}
		
		//처리된 페이지에 결과를 사용자에게 결과를 출력하자
		//브라우저에게 전송된 데이트의 종류를 알려준다
		//응답내용에 한글이 있을경우 깨진다
		//response.setContentType("text/html");
		//한글처리 부분
		response.setContentType("text/html; charset=utf-8");
		
		//내용을 부라우져로 전송 - 출력객체 얻기
		//바이트 단위 출력
		//OutputStream out = response.getOutputStream();
		
		//문자단위 출력
		PrintWriter out = response.getWriter();
		
		StringBuffer html = new StringBuffer();
		
		html.append("<html>");
		html.append("	<body>");
		html.append("<h1>서블릿 결과 출력!!!</h1>");
		for (int i = 0; i < fruit.length; i++) 
		{
			html.append("<h1>" + fruitMap.get(i + 1)+"</h1>");
		}
		
		html.append("	</body>");
		html.append("</html>");
		
		out.write(html.toString());
		out.close();
	}
}























