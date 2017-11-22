package oops;

class MethodOver{
	
	void meth(int a, String b)
	{
		System.out.println("기본형태:"+a+","+b);
	}
	
	void meth(int a, String b, int c)
	{
		System.out.println("인수의 갯수가 다른 경우:"+a+","+b+","+c);
	}
	
	void meth(int a, int b)
	{
		System.out.println("인수의 자료형이 다른 경우:"+a+","+b);
	}
	
	void meth(String b, int a)
	{
		System.out.println("인수의 순서가 다른 경우:"+a+","+b);
	}
	
	
	/*String meth(int a, String b)
	{
		System.out.println("기본형태:"+a+","+b);
	}
	
	void meth(int d, String b)
	{
		System.out.println("기본형태:"+a+","+b);
	}*/
}

public class MethodOverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOver mo = new MethodOver();
		
		mo.meth(100, "바람의 상처");
		mo.meth(100, "바람의 상처",200);
		mo.meth(100,200);
		mo.meth( "바람의 상처", 200);
	}

}
