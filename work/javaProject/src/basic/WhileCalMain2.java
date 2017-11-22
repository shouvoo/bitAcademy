package basic;

import java.io.IOException;

public class WhileCalMain2 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		total:while(true)
		{
			int su1 = 0;
			System.out.println("수1 : ");
			
			while(true)
			{
				int i = System.in.read();
				if(i == 13) break;				
				su1 *= 10;
				su1 += i - '0';
			}
			System.out.println(su1);
			System.in.read();
			/////////////////////////////////////////////
			
			
			char code;
			System.out.println("연산 : +, -, *, /, %, c(다시하기), g(종료)");
			int res = 0;
			code = (char)System.in.read();
			switch(code)
			{
				case 'g' :
					break total;
					
				case 'c' :
					System.in.read();
					System.in.read();
					continue;
			}
			
			
			/////////////////////////////////////////////
			System.in.read();
			System.in.read();
			
			int su2 = 0;
			System.out.println("수2 : ");
			
			while(true)
			{
				int i = System.in.read();
				if(i == 13) break;				
				su2 *= 10;
				su2 += i - '0';
				
				switch(code)
				{
					case '+' :
						res = su1 + su2;
						break;
					case '-' :
						res = su1 - su2;
						break;
						
					case '*' :
						res = su1 * su2;
						break;
						
					case '/' :
						res = su1 / su2;
						break;
						
					case '%' :
						res = su1 % su2;
						break;
				}
			}
			
			System.out.println(su2);
			System.in.read();
			System.out.println("" + su1 + code + su2 + " = " + res);
			break;
		}
	
		System.out.println("프로그램종료");

	}

}
