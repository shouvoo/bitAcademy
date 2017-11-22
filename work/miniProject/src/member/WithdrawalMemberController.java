package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/withdrawalmember")
public class WithdrawalMemberController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		MemberDomain user = (MemberDomain)session.getAttribute("user");
		
		String id = user.getId();
		
		MemberDAO dao = new MemberDAO();
		try {
			dao.withdrawalMember(id);
			session.invalidate();
			RequestDispatcher rd = request.getRequestDispatcher("/main/index");
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
		
		
	}

	
}
