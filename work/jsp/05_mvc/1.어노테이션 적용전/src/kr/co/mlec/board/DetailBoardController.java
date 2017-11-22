package kr.co.mlec.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;

import kr.co.mlec.login.Login;

public class DetailBoardController implements Controller
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






