package freeBoard;

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


@WebServlet("/freeboard/detail")
public class FreeBoardDetailController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		int no = Integer.parseInt(request.getParameter("no"));
		try {			
			
			MemberMapper mapper = new MemberMapper();
			FreeBoardDomain board = mapper.detailBoard(no);
			List<FreeBoardCommentDomain> commnetList = mapper.commentListBoard(no);	
			
			
			request.setAttribute("board", board);
			request.setAttribute("commnetBoard", commnetList);
			RequestDispatcher rd = request.getRequestDispatcher("/freeBoard/freeDetailList.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}






