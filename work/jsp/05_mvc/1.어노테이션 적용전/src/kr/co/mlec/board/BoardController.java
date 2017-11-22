package kr.co.mlec.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.mvc.ModelAndView;

public class BoardController 
{
	public ModelAndView service(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		int no = Integer.parseInt(request.getParameter("no"));
		BoardMapper dao = new BoardMapper();
		BoardDomain board = dao.detailBoard(no);
		
		ModelAndView mav = new ModelAndView("/board/detail.jsp");
		mav.addAttribute("board", board);
		return mav;
	}
}
