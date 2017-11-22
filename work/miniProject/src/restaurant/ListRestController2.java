package restaurant;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/restaurant/list2")
public class ListRestController2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RestDAO dao = new RestDAO();
		List<RestVO> list = null;
		
		try {
			list = dao.TodaylistRest();
		} catch (Exception e) {

		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/restaurant/list2.jsp");
		request.setAttribute("list", list);
		
		rd.forward(request, response);
	}
}
