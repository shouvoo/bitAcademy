package common;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class MyHttpServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("MyHttpServlet - service()");
		service(
				(HttpServletRequest)request, 
				(HttpServletResponse)response
		);
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MyHttpServlet - service(http)");
		
		// 시작라인에 들어온 메서드 방식
		// GET, POST, PUT, DELETE...
		String method = request.getMethod();
		if ("GET".equals(method)) {
			doGet(request, response);
		}
		else if ("POST".equals(method)) {
			doPost(request, response);
		} 
		else if ("DELETE".equals(method)) {
		} 
		else if ("PUT".equals(method)) {
		} 
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("MyHttpServlet - doPost");
		response.sendError(405, "지원되지 않는 메서드 요청입니다.");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("MyHttpServlet - doGet");
		response.sendError(405, "지원되지 않는 메서드 요청입니다.");
	}
	
}










