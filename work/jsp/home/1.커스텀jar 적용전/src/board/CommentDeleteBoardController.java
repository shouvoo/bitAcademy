package board;

import java.io.IOException;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/board/commentdelete")
public class CommentDeleteBoardController extends  HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int no = Integer.parseInt(request.getParameter("no"));
		int commentNo = Integer.parseInt(request.getParameter("commentNo"));
		
		try 
		{	
			MemberMapper mm = new MemberMapper();
			CommentBoardDomain cbd = new CommentBoardDomain();
			cbd.setNo(no);
			cbd.setCommentNo(commentNo);
			mm.deleteCommentBoard(cbd);
			/*BoardDAO dao = new BoardDAO();
			dao.deleteCommentBoard(no, commentNo);*/
			
			response.sendRedirect(request.getContextPath() + "/board/detail?no="+no);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
