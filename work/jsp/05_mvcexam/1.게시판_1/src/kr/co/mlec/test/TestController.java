package kr.co.mlec.test;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.RequestMapping;

@Controller
public class TestController
{
	@RequestMapping("/test/a.do")
	public void test1()
	{
		System.out.println("test1 메소드 호출됨");
	}
}
