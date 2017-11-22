package di.test09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		//컨테이너 객체(ApplicationContext)가 지정된 위치의 xml 파일을 로딩해서
		//<bean> 태그에 지정된 객체들을 관리하기 시작
		ApplicationContext container = new ClassPathXmlApplicationContext("di/test6.xml");
		
		Menu menu = (Menu)container.getBean("menu");
		menu.print();
	}
}
