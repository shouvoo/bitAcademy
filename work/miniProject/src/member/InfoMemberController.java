package member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fixBoard.FixVO;
import freeBoard.FreeBoardDomain;
import qna.QnaDomain;

@WebServlet("/member/info")
public class InfoMemberController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDomain user = (MemberDomain)session.getAttribute("user");
		
		String id = user.getId();
		
		MemberDAO dao = new MemberDAO();
		try {
			List<QnaDomain> qlist = dao.qnaMemberInfo(id);
			List<FreeBoardDomain> flist = dao.freeMemberInfo(id);
			List<FixVO> fixlist = dao.fixMemberInfo(id);
	
			request.setAttribute("qlist", qlist);
			request.setAttribute("flist", flist);
			request.setAttribute("fixlist", fixlist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/infoList.jsp");
		rd.forward(request, response);
	}
	
}
