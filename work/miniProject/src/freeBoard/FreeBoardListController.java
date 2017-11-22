package freeBoard;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.PageResult;
import kr.co.mlec.member.mapper.MemberMapper;



@WebServlet("/freeboard/freeboard")
public class FreeBoardListController extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int pageNo = 1;

		try
		{
			pageNo = Integer.parseInt(request.getParameter("pageNo"));
		} catch(NumberFormatException e)
		{
			
		}
		
		try {
			// 데이터를 가져오기
			// List<BoardDomain> listBoard()
			MemberMapper mapper = new MemberMapper();
			Page page = new Page(pageNo);
			List<FreeBoardDomain> list = mapper.getFreeBoardList(page);
			// 데이터를 사용할 페이지로 이동\
			
			int count = mapper.freeBoardCount();
			PageResult pageResult = new PageResult(pageNo, count);

			request.setAttribute("pageResult", pageResult);
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("/freeBoard/list.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
