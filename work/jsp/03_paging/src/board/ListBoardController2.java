package board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/list2.do")
public class ListBoardController2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 작업을 처리하기 위한 파라미터 추출
		int pageNo = 1;
		
		
		try
		{
			pageNo = Integer.parseInt(request.getParameter("pageNo"));
			
			
		} catch(NumberFormatException e)
		{
			
		}
		System.out.println(pageNo);
		try {
			// 데이터를 가져오기
			// List<BoardDomain> listBoard()
			BoardDAO dao = new BoardDAO();
			Page page = new Page(pageNo);
			List<BoardDomain> list = dao.listBoard(page);
			
			//페이징을 위한 파트
			//전체게시물 수
			int count = dao.listBoardCount();
			//마지말 페이지 번호 구하기
			int lastPage = (count % 10 == 0) ? count / 10 : count / 10 + 1;
			
			//tab 블락 관련 처리
			//페이지 번호에 따른 tab 번호, 탭에 시작, 탭에 종료
			int currentTab = (pageNo - 1) / 10 + 1;
			int beginPage = (currentTab - 1) * 10 + 1;
			int endPage = (currentTab * 10 > lastPage) ?  lastPage : currentTab * 10;
			
			boolean prev = beginPage != 1;
			boolean next = endPage != lastPage;
			
			request.setAttribute("lastPage", lastPage);
			request.setAttribute("count", count);
			request.setAttribute("pageNo", pageNo);
			
			request.setAttribute("beginPage", beginPage);
			request.setAttribute("endPage", endPage);
			request.setAttribute("prev", prev);
			request.setAttribute("next", next);
		
			// 데이터를 사용할 페이지로 이동\
			request.setAttribute("list", list);
			
			
			RequestDispatcher rd = 
					request.getRequestDispatcher(
							"/jsp/board/list2.jsp"
					);
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}







