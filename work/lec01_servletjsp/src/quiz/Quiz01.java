package quiz;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//서블릿 클래스로 선언
//http://localhost:8080/프로젝트명/quiz/quiz01
//파라미터 2개를 넘겨준다
//count : 1 부터 10 사이의 숫자를 입력
//type : music, movie 둘중에 한가지를 입력

//서블릿이 해야할 일
//music 일 경우 "음악" 이라는 단어를 count에 보내온 숫자 만큼 출력
//movie 일 경우 "영화" 이라는 단어를 count에 보내온 숫자 만큼 출력
//music, movie 의 값이 넘어오지 않은 경우 "잘못된 타입" 을 출력

@WebServlet("/quiz/Quiz01")
public class Quiz01 implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 호출!!!!");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service 호출!!!!");
		int cnt = Integer.parseInt(arg0.getParameter("count"));
		String type = arg0.getParameter("type");
		
		if(!type.equals("music") && !type.equals("movie")) System.out.println("잘못된 타입!!");
		else
		{
			for (int i = 0; i < cnt; i++) 
			{
				System.out.println(type);
				
				
			}
		}
	}

}
