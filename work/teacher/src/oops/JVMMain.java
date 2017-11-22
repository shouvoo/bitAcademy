package oops;

class JVM{
	
	
	int a = meth_a();
	
	int meth_a()
	{
		System.out.println("meth_a()");
		
		return b;
	}
	int b = 20;
	
	int c = meth_c();
	
	
	int meth_c()
	{
		System.out.println("meth_c()");
		a= b;
		return 30;
	}
	
	void meth_1()
	{
		System.out.println("meth_1() 시작");
		meth_2();
		b = 200;
		
		System.out.println("meth_1() 끝");
	}
	
	void meth_2()
	{
		System.out.println("meth_2() 시작");
		meth_3();
		b = 20000;
		
		System.out.println("meth_2() 끝");
	}
	
	void meth_3()
	{
		System.out.println("meth_3() 시작");
		b = 2000000;
		System.out.println("meth_3() 끝");
	}
}

public class JVMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JVM jjj = new JVM();
		System.out.println(jjj.a);
		jjj.meth_1();
		
		System.out.println(jjj.b);
	}

}
