package board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/delete")
public class DeleteBoardController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		try {
			BoardDAO dao = new BoardDAO();
			dao.deleteBoard(no);
			
			response.sendRedirect(
				"/lec01_servletjsp/board/list"
			);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}






