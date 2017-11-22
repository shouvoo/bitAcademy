package fixBoard;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.MemberDomain;

@WebServlet("/fix/redutwrite")
public class ReDutWriteController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		MemberDomain md = (MemberDomain)session.getAttribute("user");

		String no = request.getParameter("no");
		System.out.println(no);
		
		try {
			int cno = Integer.parseInt(request.getParameter("cno"));
			String writer = md.getName();
			String content = request.getParameter("content");
			String id = md.getId();
			
			FixVO bd = new FixVO();
			bd.setCommentNo(cno);
			bd.setWriter(writer);
			bd.setContent(content);
			bd.setId(id);
			
			FixDAO dao = new FixDAO();
			try {
				dao.insertReDut(bd);
			} catch (Exception e) {}
			
			response.sendRedirect(request.getContextPath()+"/fix/dut?no="+no);
		} catch (Exception e) {
			response.sendRedirect(request.getContextPath()+"/fix/dut?no="+no+"&chk=f");
		}
		
		
	}
}
