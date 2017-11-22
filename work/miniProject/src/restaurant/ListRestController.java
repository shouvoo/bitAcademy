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

@WebServlet("/restaurant/list")
public class ListRestController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RestDAO dao = new RestDAO();
		List<RestVO> list = null;
		int page = 1, size = 0, lsize = 0, tab = 1;
		String order = "rownum asc";
		
		if(request.getParameter("order") != null && !request.getParameter("order").equals(""))
			order = request.getParameter("order");		
		
		if(request.getParameter("page") != null)
			page = Integer.parseInt(request.getParameter("page"));
		
		if(request.getParameter("tab") != null && Integer.parseInt(request.getParameter("tab")) > 1)
			tab = Integer.parseInt(request.getParameter("tab"));
		
		try {
			list = dao.listRest(order, page);
			size = dao.Page();
			lsize = (size%5 == 0) ? size/5 : size/5+1; //총 페이지 갯수
		} catch (Exception e) {

		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/restaurant/list.jsp");
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("size", size);
		request.setAttribute("lsize", lsize);
		request.setAttribute("tab", tab);
		
		rd.forward(request, response);
	}
}
