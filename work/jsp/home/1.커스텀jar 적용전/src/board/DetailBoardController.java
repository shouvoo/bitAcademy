package board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.member.mapper.MemberMapper;
import login.Login;

@WebServlet("/board/detail")
public class DetailBoardController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		int no = Integer.parseInt(request.getParameter("no"));
		try {
			BoardDAO dao = new BoardDAO();
			
			
			MemberMapper mm = new MemberMapper();
			BoardDomain board = mm.detailBoard(no);
			List<CommentBoardDomain> commnetList = dao.commentListBoard(no);
			List<UploadBoardDomain> fileList = dao.fileBoard(no);
			
			

			request.setAttribute("board", board);
			request.setAttribute("commnetBoard", commnetList);
			request.setAttribute("fileBoard", fileList);
			
			RequestDispatcher rd = request.getRequestDispatcher(
				"/board/detail.jsp"	
			);
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}






