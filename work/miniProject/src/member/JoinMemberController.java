package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/join")
public class JoinMemberController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		
		MemberDomain member = new MemberDomain();
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setEmail(email);
		
		MemberDAO dao = new MemberDAO();
		
		try {
			dao.insertMember(member);
			response.sendRedirect(request.getContextPath()+"/member/loginform");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
	}
	
	
}
