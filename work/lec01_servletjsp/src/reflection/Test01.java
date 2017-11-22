package reflection;

import java.util.ArrayList;
import java.util.Random;

/*
클래스 정보 접근하는 3가지 방법
*/

public class Test01 
{
	public static void main(String[] args) 
	{
		try {
			//test01();
			test02();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void test02() throws Exception
	{
		Object obj = getObject();
		Class<?> clz = obj.getClass();
		System.out.println(clz.getName());
	}
	
	private static Object getObject() throws Exception
	{
		Object[] arr = {new String("a"), new Dog(), new ArrayList<String>()};
		Random r = new Random();
		return arr[r.nextInt(arr.length)];
	}
	
	public static void test01() throws Exception 
	{
		//리플렉션 : 클래스 정보가 로딩된다(method area)
		//      : method area 영역에 올라가 있는 클래스 정보를 조회 및 활용
		
		//1번 방식 : Class clz = Class.forName("패키지포함 클래스명");
		Class<?> clz = Class.forName("reflection.Dog");
		
		//2번 방식 : Calss clz = 클래스 이름.class;
		Class<?> clz2 = Dog.class;
		
		//3번 방식 :객체활용. Class clz = 객체.getClass();
		Dog d = new Dog();
		Class<?> clz3 = d.getClass();
		
		System.out.println(clz == clz2);
		System.out.println(clz3 == clz2);
		
		
		System.out.println(clz.getName());
		System.out.println(clz.getSimpleName());
	}
}





































