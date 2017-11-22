package freeBoard;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.member.mapper.MemberMapper;

@WebServlet("/freeboard/delete")
public class FreeBoardDeleteController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		try {
			MemberMapper mapper = new MemberMapper();
			mapper.deleteBoard(no);
			
			response.sendRedirect(request.getContextPath() + "/freeboard/freeboard"
			);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}






