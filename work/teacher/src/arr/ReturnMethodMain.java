package arr;
class ReturnMEthod{
	
	void meth_1()
	{
		System.out.println("ReturnMEthod  meth_1()");
		return;
		
		//System.out.println("뭔가를 또 해보면 에러지");
	}
	
	int meth_2()
	{
		System.out.println("ReturnMEthod  meth_2()");
		return 10;
		
	}
	
	/*int, int meth_3()
	{
		System.out.println("ReturnMEthod  mteh_1()");
		return 10, 100;
		
	}*/
	
	int [] meth_3()
	{
		System.out.println("ReturnMEthod  meth_3()");
		return new int[] {10, 100};
		
	}
	
}

public class ReturnMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnMEthod rm = new ReturnMEthod();
		
		rm.meth_1();
		
		int a = rm.meth_2();
		System.out.println(a);
		System.out.println(rm.meth_2()+100);
		
		int [] arr = rm.meth_3();
		System.out.println(arr[1]);
		rm.meth_3()[1] = 10000;
		System.out.println(rm.meth_3()[1]);
	}

}

