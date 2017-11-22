package di.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Quiz 
{
	public static void main(String[] args) 
	{
	
		ApplicationContext container = new ClassPathXmlApplicationContext("di/quiz.xml");
		
		Person p = (Person)container.getBean("user");
		Animal ani = (Animal)p.getAnimal();
		
		//화면에 "성공"이 출력됨
		ani.info();
	}
}