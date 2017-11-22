package kr.co.mlec.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;


public class ListBoardController implements Controller
{
	public ModelAndView service(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		BoardMapper dao = new BoardMapper();
		List<BoardDomain> list = dao.listBoard();
		
		ModelAndView mav = new ModelAndView("/board/list.jsp");
		mav.addAttribute("list", list);
		return mav;
	}
	
}







