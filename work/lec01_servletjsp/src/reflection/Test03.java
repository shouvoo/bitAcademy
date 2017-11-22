package reflection;

import java.lang.reflect.Method;

/*리플렉션을 이용한 객체 생성
리플렉션을 이용한 메서드 실행*/

public class Test03 
{
	public static void main(String[] args) 
	{
		try {
			//test01();
			test02();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void test02() throws Exception  
	{
		/*Dog d = new Dog();
		d.setName("쫑");
		String name = d.getName();
		System.out.println(name);*/
		Class<?> clz = Dog.class;
		Object obj = clz.newInstance();
		Method m = clz.getDeclaredMethod("setName", String.class);
		m.invoke(obj, "쫑");
		
		Method m2 = clz.getDeclaredMethod("getName");
		String name = (String)m2.invoke(obj);
		System.out.println(name);
	}
	
	public static void test01() throws Exception  
	{
		Class<?> clz = Dog.class;
		//생성하기
		//Dog d = new Dog();
		
		Dog d = (Dog)clz.newInstance();
		d.setName("리플렉션을 이용한 객체");
		System.out.println(d.getName());
	}
}
