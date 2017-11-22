package basic;

import java.io.IOException;

public class SeqMain1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int a=0,b=0,c=0, sum;
		
		System.out.print("수1:");
		while(true) {
			int i = System.in.read();
			if(i==13) 
			{
				System.in.read();
				break;
			}
			a*=10;
			a+=i-'0';
		}
		System.out.print("수2:");
		while(true) {
			int i = System.in.read();
			if(i==13) 
			{
				System.in.read();
				break;
			}
			b*=10;
			b+=i-'0';
		}
		System.out.print("수3:");
		while(true) {
			int i = System.in.read();
			if(i==13) 
			{
				System.in.read();
				break;
			}
			c*=10;
			c+=i-'0';
		}
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		sum = a+b+c;
		
		if(sum<20)
			sum=a*b*c;
		
		System.out.println("결과:"+sum);
		
		
	}

}
