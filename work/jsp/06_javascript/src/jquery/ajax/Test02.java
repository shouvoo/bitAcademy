package jquery.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jquary/ajax/test02")
public class Test02 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=utf-8");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter();
		out.println("<h1>test02</h1>");
		out.close();
	}
	
	//Test02.html 사용
	/*@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("{\"result\": \"test\"}");
		out.close();
	}*/
	
	//Test02.html 사용
	/*
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=utf-8");
		String msg = request.getParameter("msg");
		PrintWriter out = response.getWriter();
		out.println("<h1>Ajax 응답 결과</h1>");
		out.println("<h1>" + msg + "</h1>");
		out.close();
	}
	
	//Test02.html 사용
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=utf-8");
		String msg = request.getParameter("msg");
		PrintWriter out = response.getWriter();
		out.println("<h1>Ajax 응답 결과</h1>");
		out.println("<h1>" + msg + "</h1>");
		out.close();
	}*/
}
