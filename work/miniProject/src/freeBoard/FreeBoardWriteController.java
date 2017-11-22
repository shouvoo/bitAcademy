package freeBoard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;


@WebServlet("/freeboard/write")
public class FreeBoardWriteController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// post 방식일 경우 파라미터 한글 처리
		request.setCharacterEncoding("utf-8");
		
		// 화면에서 넘어온 파라미터 추출하기
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String writer = request.getParameter("writer");

		
		// Domain 클래스에 파라미터 담기
		FreeBoardDomain board = new FreeBoardDomain();
		board.setTitle(title);
		board.setContents(contents);
		board.setWriter(writer);
		
		// DAO를 호출해서 작업처리 지시
		MemberMapper mapper = new MemberMapper();
		try {
			mapper.insertBoard(board);
		} catch (Exception e) {
			throw new ServletException(e);
		} 

		
		// 페이지 이동
		response.sendRedirect(request.getContextPath() + "/freeboard/freeboard");
	}
}









