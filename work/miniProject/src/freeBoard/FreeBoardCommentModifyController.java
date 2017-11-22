package freeBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/freeboard/commentmodify")
public class FreeBoardCommentModifyController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		int no = Integer.parseInt(request.getParameter("no"));
		int commentNo = Integer.parseInt(request.getParameter("commentNo"));

		String contents = request.getParameter("contents");
		String writer = request.getParameter("writer");
		
		FreeBoardCommentDomain board = new FreeBoardCommentDomain();
		board.setNo(no);
		board.setCommentNo(commentNo);
		board.setContents(contents);
		board.setWriter(writer);
		
		MemberMapper mapper = new MemberMapper();
		
		try {
			mapper.commentModifyBoard(board);
		} catch (Exception e) {
			throw new ServletException(e);
		} 

		response.sendRedirect(request.getContextPath() + "/freeboard/detail?no="+no);
	}
}










