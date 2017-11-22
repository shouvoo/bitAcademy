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

@WebServlet("/board/commentmodifyform")
public class CommentModifyFormBoardController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		int commentNo = Integer.parseInt(request.getParameter("commentNo"));
		System.out.println(no);
		System.out.println(commentNo);
		try {
			MemberMapper mm = new MemberMapper();
			CommentBoardDomain board = new CommentBoardDomain();
			board.setNo(no);
			board.setCommentNo(commentNo);
			board = mm.commentDetailBoard(board);
			request.setAttribute("board", board);
			
			RequestDispatcher rd = request.getRequestDispatcher(
				"/board/commentModifyForm.jsp"	
			);
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}






