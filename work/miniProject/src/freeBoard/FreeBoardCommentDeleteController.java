package freeBoard;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/freeboard/commentdelete")
public class FreeBoardCommentDeleteController extends  HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int no = Integer.parseInt(request.getParameter("no"));
		int commentNo = Integer.parseInt(request.getParameter("commentNo"));
		
		try 
		{
			FreeBoardCommentDomain commentBoard = new FreeBoardCommentDomain();
			commentBoard.setNo(no);
			commentBoard.setCommentNo(commentNo);
			MemberMapper mapper = new MemberMapper();
			mapper.deleteCommentBoard(commentBoard);
			
			response.sendRedirect(request.getContextPath() + "/freeboard/detail?no="+no);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
