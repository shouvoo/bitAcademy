package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/modifyinfo")
public class ModifyInfoController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		
		MemberDomain user = (MemberDomain)session.getAttribute("user");
		
		MemberDomain member = new MemberDomain();
		
		member.setId(id);
		member.setPass(pass);
		member.setEmail(email);
		
		MemberDAO dao = new MemberDAO();
		try {
			dao.modifyInfo(member);
			
			user.setPass(pass);
			user.setEmail(email);
			
			RequestDispatcher rd = request.getRequestDispatcher("/member/info");
			rd.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
