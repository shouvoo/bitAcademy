package kr.co.mlec.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.WebUtil;
import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;

public class ModifyBoardController implements Controller
{
	public ModelAndView service(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{

		BoardMapper dao = new BoardMapper();
		BoardDomain board = (BoardDomain)WebUtil.toVO(request, BoardDomain.class);
		dao.modifyBoard(board);
		return new ModelAndView("redirect:" + request.getContextPath() + "/board/list.do");
	}
}










