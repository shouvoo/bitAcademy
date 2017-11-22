package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Test02 
{
	public static void main(String[] args) 
	{
		try {
			//test01();
			//test02();
			//test03();
			test04();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//ArrayList 클래스의 메서드 중에서 반환타입이 void 인 메서드의 이름을 화면에 출력
	public static void test04() throws Exception
	{
		Class<?> clz = Dog.class;
		Method[] clzList = clz.getDeclaredMethods(); 
		
		for (Method m : clzList) 
		{
			Class<?> rClz = m.getReturnType();
			if("void".equals(rClz.getName()) == false) continue;
			System.out.println(m.getName());
		}
	}
	
	//원하는 메서드 하나 가져오기
	public static void test03() throws Exception
	{
		Class<?> clz = Dog.class;
		Method m = clz.getDeclaredMethod("setName", String.class);
		Method m2 = clz.getDeclaredMethod("getName");
		Method m3 = clz.getDeclaredMethod("setAge", int.class);
		System.out.println(m3.getName());
		System.out.println(m3.getReturnType());
	}
	
	public static void test02() throws Exception
	{
		sum(1, 2);
		sum(1, 2, 3);
	}
	
	public static int sum(int...arr) throws Exception
	{
		int result = 0;
		for(int val : arr)
		{
			result += val;
		}
		return result;
	}
	
	public static void test01() throws Exception
	{
		Class<?> clz = Dog.class;
		System.out.println("Dog 클래스의 모든 메서드 출력");
		
		Method[] mArr = clz.getDeclaredMethods();
		
		for (Method m : mArr) 
		{
			System.out.println("메서드 이름 : " + m.getName());
			Class<?> rClz = m.getReturnType();
			System.out.println("반환타입 이름 : " + rClz.getName());
			
			//파라미터 정보 확인하기
			Parameter[] pArr = m.getParameters();
			for (Parameter p : pArr) 
			{
				Type t = p.getParameterizedType();
				System.out.println(t.getTypeName() + " : " + p.getName());
			}
			
		}
	}
}
