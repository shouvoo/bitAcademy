/*
 * Servlet 클래스를 정의하는 방법
 * 
 * 1. Servlet 인터페이스 상속하기
 * 2. GenericServlet 추상 클래스를 상속하기
 * 3. HttpServlet 추상 클래스를 상속하기
 * 
 */
package day02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MyHttpServlet;

@WebServlet("/day02/test02")
public class Test02 extends MyHttpServlet {
	public void service(ServletRequest request, ServletResponse response) 
			 throws ServletException, IOException {
		System.out.println("service - 1");
	}
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("service - 2");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}
}
















