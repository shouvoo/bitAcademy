package oops;

class ReturnMethod
{
	void meth_1()
	{
		System.out.println("ReturnMethod meth_1()");
		return;
		
		//System.out.println("����غ��� return ������ �ڵ�� error �߻�");
	}
	
	int meth_2()
	{
		System.out.println("ReturnMethod meth_2()");
		return 10;
	}
	
	/*int meth_3()
	{
		System.out.println("ReturnMethod meth_3()");
		return 10, 100; // ������ �ݵ�� �Ѱ��� ���� ������ �Ѵ�
		// �Ѱ��� �̻��� ���� ����ϰ��� �Ҷ��� array �� class �� ����Ѵ�
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






















