/*
 *  서블릿 클래스를 생성하는 방법
 *  
 *  - Servlet 인터페이스를 상속하자
 * 
 */
package day01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

// http://localhost:8080/lec01_servletjsp/day01/test01

@WebServlet("/day01/test01") //어노테이션
public class Test01 implements Servlet {
	// 서블릿 객체가 메모리에 올라갔다가 해제될때 호출되는 메서드
	@Override
	public void destroy() {}
	@Override
	public ServletConfig getServletConfig() { return null; }
	@Override
	public String getServletInfo() { return null; }

	// 서블릿이 메모리에 올라갈때 최초 한번만 호출되는 메서드
	@Override
	public void init(ServletConfig arg0) throws ServletException { 
		System.out.println("init 호출...");
	}
	
	// 사용자가 요청한 정보에 대한 처리를 진행
	@Override
	public void service(
			ServletRequest request, 
			ServletResponse response) throws ServletException, IOException { 
		System.out.println("service 호출...");
		
		int a = Integer.parseInt(
				request.getParameter("a"));
		int b = Integer.parseInt(
				request.getParameter("b"));
		System.out.println(a);
		System.out.println(b);
	}
}
















