package quiz;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/quiz/Quiz02")
public class Quiz02 implements Servlet
{
	@Override
	public void destroy() {}
	@Override
	public ServletConfig getServletConfig() {return null;}
	@Override
	public String getServletInfo() {return null;}
	
	
	Quiz02DAO dao;
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		dao = new Quiz02DAO();
		System.out.println("init 실행");
	}

	@Override
	public void service(ServletRequest request, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		int pw = Integer.parseInt(request.getParameter("pass"));
		Quiz02VO vo = dao.detail(id, pw);
		
		if(vo == null) System.out.println("없어요!!!");
		else
		{
			System.out.println(vo.id);
			System.out.println(vo.pw);
			System.out.println(vo.name);
			
		}

	}

}
