package day03;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day03/test01")
public class Test01 extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Test01 서블릿 호출됨!!");
		//페이지 이동 하기
		// RequestDipatcher 객체 얻기
		RequestDispatcher rd = request.getRequestDispatcher("/day03/test01.jsp");
		
		//화면에서 사용할 데이터를 공유한다
		request.setAttribute("msg", "테스트");
		request.setAttribute("time", new Date());
		
		rd.forward(request, response);
	}
}
