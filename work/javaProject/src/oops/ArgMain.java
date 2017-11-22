package oops;

import java.util.Arrays;

class ArgAAA
{
	int aa = 10, bb = 20;
	
	void meth_1()
	{
		System.out.println("ArgAAA meth_1()");
	}
	
	void meth_2(int c, int d, String e)
	{
		System.out.println("ArgAAA meth_2() : " + (c + d) + "  :  " + e);
	}
	
	void meth_3(int aa, int bb)
	{
		this.aa = aa;
		this.bb = bb;
	}
	
	void print()
	{
		System.out.println(aa + " : " + bb);
	}
	
	void meth_4(int a)
	{
		a = 1000;
		System.out.println("ArgAAA meth_4() : " + a);
	}
	
	void meth_5(int [] arr)
	{
		arr[1] = 1000;
		System.out.println("meth_5() : " + Arrays.toString(arr));
	}
}

public class ArgMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArgAAA a1 = new ArgAAA();
		a1.meth_1();
		a1.meth_2(100, 90, "¥ı«œ±‚");
		a1.meth_3(123, 456);
		a1.print();
		
		int abc = 5555;
		a1.meth_4(abc);
		System.out.println(abc);
		int [] ref = {123, 456, 789};
		a1.meth_5(ref);
		
	}

}
