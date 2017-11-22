package kr.co.mlec.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;

public class MainController implements Controller {

	@Override
	public ModelAndView service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 폼으로 이동하기
		return new ModelAndView("/main/main.jsp");
	}
	
}









