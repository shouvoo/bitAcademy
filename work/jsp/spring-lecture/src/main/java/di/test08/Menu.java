package di.test08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Menu 
{
	@Autowired
	@Qualifier("ch2")
	private ISand sand;
	
	public Menu()
	{
		System.out.println("Menu 기본 생성자");
	}
	
	public void print()
	{
		sand.info();
	}
}