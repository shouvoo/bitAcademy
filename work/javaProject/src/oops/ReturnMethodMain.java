package oops;

class ReturnMethod
{
	void meth_1()
	{
		System.out.println("ReturnMethod meth_1()");
		return;
		
		//System.out.println("출력해보자 return 선언후 코드는 error 발생");
	}
	
	int meth_2()
	{
		System.out.println("ReturnMethod meth_2()");
		return 10;
	}
	
	/*int meth_3()
	{
		System.out.println("ReturnMethod meth_3()");
		return 10, 100; // 리턴은 반드시 한가지 값만 나가야 한다
		// 한가지 이상의 값을 사용하고자 할때는 array 나 class 를 사용한다
	}*/
	
	int [] meth_3()
	{
		System.out.println("ReturnMethod meth_3()");
		return new int [] {100, 200};
	}
}

public class ReturnMethodMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ReturnMethod rm = new ReturnMethod();
		rm.meth_1();
		int a = rm.meth_2();
		System.out.println(a);
		System.out.println(rm.meth_2() + 100);
		
		int [] arr = rm.meth_3();
		System.out.println(arr[1]);
		
		System.out.println(rm.meth_3()[0]);
	}

}






















