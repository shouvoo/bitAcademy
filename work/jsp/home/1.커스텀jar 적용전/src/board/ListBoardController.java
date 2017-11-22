package board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/board/list")
public class ListBoardController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 작업을 처리하기 위한 파라미터 추출
		
		try {
			// 데이터를 가져오기
			// List<BoardDomain> listBoard()
			/*BoardDAO dao = new BoardDAO();
			List<BoardDomain> list = dao.listBoard();*/
			MemberMapper mm = new MemberMapper();
			List<BoardDomain> list = mm.listBoard();
		
			// 데이터를 사용할 페이지로 이동\
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("/board/list.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}







