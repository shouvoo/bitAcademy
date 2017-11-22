package day05;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/day05/test02")
public class test02 extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//클라이언트와 관련된 세션 얻기
		HttpSession session = request.getSession();
		
		//마지막으로 사용자가 접근합 시간
		long time = session.getLastAccessedTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		//세션의 설정된 아이디 확인
		String id = session.getId();
		
		//세션의 유지시간 변경(2초)
		session.setMaxInactiveInterval(2);
		
		
		out.println("<h1>Session id : " + id + "</h1>");
		out.println("<h1>접근시간 : " + sdf.format(time) + "</h1>");
		out.close();
	}
}
