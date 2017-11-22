package anno.quiz;

import java.lang.reflect.Method;
import java.util.Scanner;

import anno.MyRuntime;

public class Test01
{
	public static void main(String[] args) throws Exception
	{
		Class<?> clz = BoardController.class;
		Method[] mArr = clz.getDeclaredMethods();
		Object obj = clz.newInstance();
		
		Scanner sc = new Scanner(System.in);

		while(true)			
		{
			System.out.print("경로 : ");
			String scTxt = sc.nextLine();
			for (Method m : mArr) 
			{
				RequestMapping anno1 = m.getAnnotation(RequestMapping.class);
				if(scTxt.equals(anno1.value()))
				{
					m.invoke(obj);
					break;
				} else 
				{
					System.out.print("존재하지 않는 경로입니다");
					System.out.println();
					break;
				}
				
			}
			
		}
	
	}
}
