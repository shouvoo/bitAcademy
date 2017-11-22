package board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/detail")
public class DetailBoardController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		try {
			BoardDAO dao = new BoardDAO();
			BoardDomain board = dao.detailBoard(no);
			List<CommentBoardDomain> commnetList = dao.commentListBoard(no);
			
			System.out.println(commnetList);
			Object [] obj = {board, commnetList};
			request.setAttribute("board", obj);
			
			RequestDispatcher rd = request.getRequestDispatcher(
				"/board/detail.jsp"	
			);
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}






