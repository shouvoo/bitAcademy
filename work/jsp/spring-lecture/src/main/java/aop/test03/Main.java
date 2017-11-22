package aop.test03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
	public static void main(String[] args) 
	{
		try {
			
			
			Controller controller = new ProxyController(new BoardController());
			controller.execute();
			
			controller = new ProxyController(new MemberController());
			controller.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
