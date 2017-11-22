package day05;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 쿠기에 대한 생성 및 전송
*/

@WebServlet("/day05/test01")
public class Test01 extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//이름, 값에 한글이 정상적으로 입력되게 하기위해서 인코딩을 해준다
		//URLEncoder 클래스 활용
		
		String name = URLEncoder.encode(request.getParameter("name"), "utf-8");
		String value = URLEncoder.encode(request.getParameter("value"), "utf-8");
		
		
		//쿠키생성
		Cookie c = new Cookie(name, value);
		
		//별도의 유효시간 설정이 되어있지 않은 경우
		//브라우져가 닫히기 전까지 유지됨

		
		//c.setMaxAge(60 * 60 * 24); // 하루동안 쿠키 유지
		c.setMaxAge(60 * 60); //초단위 설정 : 한시간동안 유지
		
		//생성된 쿠키를 프로젝트 전체에서 사용하도록 설정
		c.setPath("/");
		
		//쿠키를 사용자에게 응답하기
		response.addCookie(c);
		
		//response.sendRedirect("/lec01_servletjsp/day05/test01.jsp");
		response.sendRedirect("test01.jsp");
	}
}
