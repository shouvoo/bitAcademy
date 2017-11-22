package anno;

import java.lang.reflect.Method;

public class Test04 
{
	public static void main(String[] args) 
	{
		//Apply 클래스의 클래스 정보 얻기
		Class<?> clz = Apply.class;
		MyRuntime myRun = clz.getAnnotation(MyRuntime.class);
		MyClass myClass = clz.getAnnotation(MyClass.class);
		
		//System.out.println("MyRun  :  " + myRun);
		//System.out.println("MyCls  :  " + myClass);
		
		//모든 메서드들을 얻기 : 변수명 mArr
		Method[] mArr = clz.getDeclaredMethods();
		
		for (Method m : mArr) 
		{
			//Policy 가 calss 로 설정되어서 실생시에 참조되지 않는다
			MyClass2 anno2 = m.getAnnotation(MyClass2.class);
			//System.out.println("메서드 이름  :  " + m.getName());
			
			//info 메서드일 경우에는 값이 존재
			//call 메서드일 경우 존대하지 않는다
			MyRuntime anno1 = m.getAnnotation(MyRuntime.class);
			
			if(anno1 != null)
			{
				System.out.println("id : " + anno1.id());
				System.out.println("msg : " + anno1.msg());
			}
			
			//System.out.println("MyRun  :  " + anno1);
			//System.out.println("MyCls  :  " + anno2);
		}
		
		
	}
}
