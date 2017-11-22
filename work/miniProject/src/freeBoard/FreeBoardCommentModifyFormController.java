package freeBoard;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/freeboard/commentmodifyform")
public class FreeBoardCommentModifyFormController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		int commentNo = Integer.parseInt(request.getParameter("commentNo"));
		System.out.println(no);
		System.out.println(commentNo);
		try {
			
			FreeBoardCommentDomain commentBoard = new FreeBoardCommentDomain();
			commentBoard.setNo(no);
			commentBoard.setCommentNo(commentNo);
			
			MemberMapper mapper = new MemberMapper();
			FreeBoardCommentDomain board = mapper.commentDetailBoard(commentBoard);
			request.setAttribute("board", board);
			
			RequestDispatcher rd = request.getRequestDispatcher(
				"/freeBoard/freeBoardCommentModifyForm.jsp"	
			);
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}






