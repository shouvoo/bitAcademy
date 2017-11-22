package day03;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day03/test02")
public class Test02 extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("test02 서블릿 호출됨!!");
		
		//포워드는 프로젝트 경로 삭게 센드리다이렉트는 프로젝트 경로 삽입
		//화면에서 사용할 데이터를 공유한다
		request.setAttribute("msg", "테스트");
		request.setAttribute("time", new Date());
		response.sendRedirect("/lec01_servletjsp/day03/test02.jsp");
	}
	
}
