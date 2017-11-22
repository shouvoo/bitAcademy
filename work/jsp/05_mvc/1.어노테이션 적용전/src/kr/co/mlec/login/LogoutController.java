package kr.co.mlec.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;

public class LogoutController implements Controller {

	public ModelAndView service(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 로그인 : 세션에 user를 등록
		// 로그아웃 : 세션을 삭제처리
		HttpSession session = request.getSession();
		session.invalidate();
		
		// 메인페이지로 이동하기
		return new ModelAndView("redirect:" + request.getContextPath() + "/main/main.do");
	}
}









