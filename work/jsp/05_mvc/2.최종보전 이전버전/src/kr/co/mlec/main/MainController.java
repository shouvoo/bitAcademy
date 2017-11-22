package kr.co.mlec.main;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.mvc.ModelAndView;

import org.springframework.web.mvc.RequestMapping;

public class MainController
{
	
	@RequestMapping("/main/main.do")
	public void main() throws Exception 
	{
		// 로그인 폼으로 이동하기
		/*return new ModelAndView("/main/main.jsp");*/
	}
	
}









