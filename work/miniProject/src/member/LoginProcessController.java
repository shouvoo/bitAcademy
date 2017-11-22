package member;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import qna.QnaDomain;

@WebServlet("/member/loginprocess")
public class LoginProcessController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		String idcheck = request.getParameter("idcheck");
		
		Cookie c = new Cookie("cid", id);
		c.setMaxAge(0);
		if("Y".equals(idcheck)) {
			c.setMaxAge(60*60*24);
			request.setAttribute("cid", id);
		}
		response.addCookie(c);
		
		MemberDomain member = new MemberDomain();
		member.setId(id);
		member.setPass(pass);
		
		MemberDAO dao = new MemberDAO();
		try {
			MemberDomain user = new MemberDomain();
			user = dao.detailMember(member);
			
			if(user != null) {
				
				user.setAccessTime(new Date());
				
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				
				response.sendRedirect(request.getContextPath()+"/main/index");
			}else {
				request.setAttribute("error", "올바르지 않는 값입니다.");
				RequestDispatcher rd = request.getRequestDispatcher("/member/joinForm.jsp");
				rd.forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
		
	}
	
}
