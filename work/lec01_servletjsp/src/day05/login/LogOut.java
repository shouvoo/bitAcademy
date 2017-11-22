package day05.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/day05/login/logout")
public class LogOut extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//로그아웃 : 세션을 삭제처리
		HttpSession session = request.getSession();
		session.invalidate();
		
		//메인페이지로 이동하기
		
		response.sendRedirect(request.getContextPath() + "/day05/login/main");
	}
}
