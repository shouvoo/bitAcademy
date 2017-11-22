package basic;

import java.io.IOException;

public class SeqMain2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=0;
		String res = "소수";
		
		System.out.print("n:");
		while(true) {
			int q = System.in.read();
			if(q==13) 
			{
				System.in.read();
				break;
			}
			n*=10;
			n+=q-'0';
		}
		
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
				res="소수 아님";
		}
		
		System.out.println(n+res);
		
	}

}
