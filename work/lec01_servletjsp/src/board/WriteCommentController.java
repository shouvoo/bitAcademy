package board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/writecomment")
public class WriteCommentController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// post 방식일 경우 파라미터 한글 처리
		request.setCharacterEncoding("utf-8");
		
		// 화면에서 넘어온 파라미터 추출하기
		
		int no = Integer.parseInt(request.getParameter("no"));
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		// Domain 클래스에 파라미터 담기
		CommentBoardDomain commentBoard = new CommentBoardDomain();
		commentBoard.setNo(no);
		commentBoard.setContent(content);
		commentBoard.setWriter(writer);
		
		// DAO를 호출해서 작업처리 지시
		BoardDAO dao = new BoardDAO();
		try {
			dao.commentInsertBoard(commentBoard);
		} catch (Exception e) {
			throw new ServletException(e);
		} 
		
		response.sendRedirect("/lec01_servletjsp/board/detail?no="+no);
		/*request.setAttribute("commentList", commentBoard);
		RequestDispatcher rd = request.getRequestDispatcher("/board/detail");
		rd.forward(request, response);*/
		// 페이지 이동
		//response.sendRedirect("/lec01_servletjsp/board/list");
	}
}










