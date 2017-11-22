package freeBoard;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/freeboard/writecomment")
public class FreeBoardWriteCommentController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int no = Integer.parseInt(request.getParameter("no"));
		String writer = request.getParameter("writer");
		String contents = request.getParameter("contents");
		
		FreeBoardCommentDomain commentBoard = new FreeBoardCommentDomain();
		commentBoard.setNo(no);
		commentBoard.setContents(contents);
		commentBoard.setWriter(writer);
		
		MemberMapper mapper = new MemberMapper();
		
		try {
			mapper.commentInsertBoard(commentBoard);
		} catch (Exception e) {
			throw new ServletException(e);
		} 
		
		response.sendRedirect(request.getContextPath() + "/freeboard/detail?no="+no);
	}
}










