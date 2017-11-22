package di.test10;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Menu 
{
	//@Resource(name="egg")
	@Resource(name="eggSand")
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