package oops;

class MathodOver
{
	void meth(int a, String b)
	{
		System.out.println("기본형 : " + a + ", " + b);
	}
	
	public void meth(int a, String b, int c)
	{
		System.out.println("인수의 요소가 다른 경우  :  " + a + " ," + b + ", " + c);
	}
	
	void meth(int a, int b)
	{
		System.out.println("인수의 자료형이 다른 경우 : " + a + ", " + b);
	}
	
	void meth(String b, int a)
	{
		System.out.println("인수의 순서가 다른 경우 : " + b + ", " + a);
	}
}

public class MethodOverMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MathodOver mo = new MathodOver();
		mo.meth(100, "바람이 분다");
		mo.meth(100, "바람이 분다", 200);
		mo.meth(100, 200);
		mo.meth("바람이 분다", 100);
		
	}

}










































