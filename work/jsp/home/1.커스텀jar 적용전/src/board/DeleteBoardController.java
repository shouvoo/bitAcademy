package board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/board/delete")
public class DeleteBoardController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		try {
			MemberMapper mm = new MemberMapper();
			 mm.deleteBoard(no);
			
			response.sendRedirect(request.getContextPath() + "/board/list"
			);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}






