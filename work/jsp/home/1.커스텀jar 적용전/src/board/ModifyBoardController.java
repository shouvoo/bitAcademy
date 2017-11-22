package board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.WebUtil;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/board/modify")
public class ModifyBoardController extends HttpServlet {
	@Override
	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//필터 처리됨 : EncodingFilter 확인
		// post 방식일 경우 파라미터 한글 처리
		//request.setCharacterEncoding("utf-8");
		
		/*int no = Integer.parseInt(request.getParameter("no"));
		// 화면에서 넘어온 파라미터 추출하기
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		// Domain 클래스에 파라미터 담기
		BoardDomain board = new BoardDomain();
		board.setNo(no);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(writer);*/
		
		
		
		// DAO를 호출해서 작업처리 지시
		/*BoardDAO dao = new BoardDAO();*/
		MemberMapper mm = new MemberMapper();
		try {
			BoardDomain board = (BoardDomain)WebUtil.toVO(request, BoardDomain.class);
			/*dao.modifyBoard(board);*/
			mm.modifyBoard(board);
		} catch (Exception e) {
			throw new ServletException(e);
		} 
		
		// 페이지 이동
		response.sendRedirect(request.getContextPath() + "/board/list");
	}
}










