package basic;

import java.io.IOException;

public class SeqMain1 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		/*int a = 0, b = 0, c = 0, sum;
		
		while(true)
		{
			int i = System.in.read();
			if(i == 13) 
			{
				System.in.read();
				break;
			}
			a *= 10;
			a += i - '0';
		}
		
		
		System.out.println("a  :  " + a);
		
		while(true)
		{
			int i = System.in.read();
			if(i == 13) 
			{
				System.in.read();
				break;
			}
			b *= 10;
			b += i - '0';
		}
		
		System.out.println("b  :  " + b);
		
		while(true)
		{
			int i = System.in.read();
			if(i == 13) 
			{
				System.in.read();
				break;
			}
			c *= 10;
			c += i - '0';
		}
		
		System.out.println("c  :  " + c);
		
		sum = a + b + c;
		
		if(sum  < 20) 
		{
			System.out.println("합이 20 보다 작음!!");
			System.out.println("result  :  " + (a * b * c));
		}
		else 
		{
			System.out.println("합이 20 보다 큼!!");
			System.out.println("result  :  " + sum);
		}*/
		
		int [] arr = {};
		
		int n = 0;
		String res = "소수";
		while(true)
		{
			int q = System.in.read();
			if(q == 13) 
			{
				System.in.read();
				break;
			}
			n *= 10;
			n += q - '0';
		}
		
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				res = "소수아님";
			}
		}
		
		System.out.println(n + res);
	}

}




















