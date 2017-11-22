package di.test09;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Menu 
{
	@Resource(name="cheese")
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
