package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/modifyinfoForm")
public class ModifyInfoFormController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		MemberDomain member = new MemberDomain();
		member.setId(id);
		member.setPass(pass);
		
		MemberDAO dao = new MemberDAO();
		try {
			dao.detailMember(member);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new  ServletException(e);
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/modifyForm.jsp");
		rd.forward(request, response);
	}

}
