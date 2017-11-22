package day05.login;

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

@WebServlet("/day05/login/loginprocess")
public class LoginProcess extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 로그인 처리
		/*
		 *   - 사용자가 화면에서 입력한 파라미터 정보를 추출
		 *   
		 *   - 데이터베이스에 사용자가 입력한 정보가 있는지 체크
		 *   
		 *   - 데이터베이스에 사용자 정보가 존재한다면
		 *     : 세션에 사용자 정보를 등록
		 *     : 메인 페이지로 이동
		 *     
		 *   - 데이터베이스에 사용자 정보가 존재하지 않으면
		 *     : 로그인 폼 페이지로 이동
		 *     
		 */
		try {
			
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			String idcheck = request.getParameter("idcheck");
			
			Cookie c = new Cookie("cid", id);
			// 쿠키 삭제
			c.setMaxAge(0);
			if ("Y".equals(idcheck)) {
				c.setMaxAge(60 * 60 * 24);
				request.setAttribute("cid", id);
			}
			response.addCookie(c);
			
			// id : admin, pass : 1111 이면 성공
			LoginDAO dao = new LoginDAO();
			Login login = new Login();
			login.setId(id);
			login.setPass(pass);
			
			Login user = dao.detailMember(login);
			if (user != null) {
				user.setAccessTime(new Date());
				HttpSession session = request.getSession();
				session.setAttribute("user", login);
				
				// ${pageContext.request.contextPath}
				// pageContext.getRequest().getContextPath()
				
				// 메인페이지 이동하기
				response.sendRedirect(
					request.getContextPath() + "/day05/login/main"
				);
			}
			else {
				request.setAttribute(
					"error", "입력한 정보가 올바르지 않습니다."
				);
				
				// 로그인 폼으로 이동하기
				RequestDispatcher rd = request.getRequestDispatcher(
						"/day05/login/loginForm.jsp"
				);
				rd.forward(request, response);
				
			}
		} catch (Exception e) {
			throw new ServletException (e);
		}
	}
}









