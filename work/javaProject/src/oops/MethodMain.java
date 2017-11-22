package oops;

class MethodAAA
{
	int a = 10, b = 20;  //멤버변수
	void meth_1()
	{
		int c = 300; //지역변수
		System.out.println("MethAAA meth_1()  :  " + a + ", " + c);
	}
	
	void meth_2()
	{
		int b = 200; //지역변수
		System.out.println("MethAAA meth_2()  :  " + a + ", " +  + b);
	}
	
	void meth_3()
	{
		int b = 3456;
		this.b = 1234;
		System.out.println("MethAAA meth_3()  :  " + a + ", " +  this.b + " : " + b);
	}
}

public class MethodMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodAAA a1 = new MethodAAA();
		System.out.println("a1.a : " + a1.a);
		
		a1.meth_1();
		a1.meth_2();
		a1.meth_3();
		
	}

}
