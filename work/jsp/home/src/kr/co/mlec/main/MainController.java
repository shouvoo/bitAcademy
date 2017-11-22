package kr.co.mlec.main;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/main/main.do")
	public void main(){}
	
//	public ModelAndView main() throws Exception {
//		// 로그인 폼으로 이동하기
//		return new ModelAndView("/main/main.jsp");
//	}
	
}









