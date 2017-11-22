package basic;

import java.io.IOException;

public class InRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*while(true) {
			int i =System.in.read();
			if(i==13)
				break;
			System.out.print((char)i);
		}*/
		System.out.print("수1:");
		int su1=0;
		while(true) {
			int i = System.in.read();
			if(i==13)
				break;
			
			su1*=10;
			System.out.println("더하기전"+su1);
			su1+=i-'0';
		/*	i-='0';
			su1+=i;
			*/
			System.out.println("더하기후"+su1);
		}
		System.out.println("su1:"+su1);
		
		System.in.read();
		
		System.out.print("수2:");
		int su2=0;
		
		
		while(true) {
			int i = System.in.read();
			if(i==13)
				break;
			
			su2*=10;	
			su2+=i-'0';
		}
		
		
		System.out.println("su2:"+su2);
		System.out.println("합:"+(su1+su2));
	}

}
