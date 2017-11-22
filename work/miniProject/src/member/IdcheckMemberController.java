package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/idcheck")
public class IdcheckMemberController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(id);
		MemberDAO dao = new MemberDAO();
		boolean idchk ;
		try {
			idchk = dao.compareMember(id);
			
			if(idchk) {
				request.setAttribute("id", id);
				request.setAttribute("chk", "사용가능한 아이디 입니다.");
			}else {
				request.setAttribute("chk", "중복된 아이디 입니다.");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/member/joinForm.jsp");
		rd.forward(request, response);
	}
	
}
