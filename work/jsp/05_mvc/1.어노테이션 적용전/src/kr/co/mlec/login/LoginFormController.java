package kr.co.mlec.login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;

public class LoginFormController implements Controller {

	@Override 
	public ModelAndView service(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView("/login/loginForm.jsp");
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if ("cid".equals(c.getName())) {
					mav.addAttribute("cid", c.getValue());
					break;
				}
			}
		}

		return mav;
	}
	
}









