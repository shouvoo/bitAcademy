package basic;

import java.io.IOException;

public class HomeWork_20170727 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		int num1 = 0;
		firstWhile:while(true)
		{
			int input = System.in.read();
			switch(input)
			{
				case 13 :
					break firstWhile;
				case 49 :
					break firstWhile;
				default : 
					break;
			}
			
			num1 *= 10;
			num1 += input - '0';			
		}
		
		System.in.read();
		System.out.println("값1  :  "  +  num1);
		System.out.println("-------------------------------------------------------");
		
		char operator = 'N';
		secondWhile:while(true)
		{
			int input = System.in.read();
			
			if(operator != 'N')
			{
				break secondWhile;
			}
			
			switch(input)
			{
				case (int)'+' :
					operator = '+';
					break secondWhile;
				case (int)'-' :
					operator = '-';
					break secondWhile;
				case (int)'*' :
					operator = '*';
					break secondWhile;
				case (int)'/' :
					operator = '/';
					break secondWhile;
				case (int)'%' :
					operator = '%';
					break secondWhile;
				case (int)'c' :
					System.in.read();
					System.in.read();
					System.out.println("연산자를 다시 입력하세요");
					break;
				case (int)'g' :
					System.in.read();
				
					System.out.println("종료합니다");
					break secondWhile;
				default : 
					System.in.read();
					System.in.read();
					System.out.println("연산자를 다시 입력하세요");
					break;
			}
		}
		
		System.in.read();
		System.in.read();
		System.out.println("연산자  :  "  +  operator);
		System.out.println("-------------------------------------------------------");
		
		
		int num2 = 0;
		int hap = 0;
		thirdWhile:while(true)
		{
			int input = System.in.read();
			switch(input)
			{
				case 13 :
					break thirdWhile;
				case 49 :
					break thirdWhile;
				default : 
					break;
					
					
			}
			
			num2 *= 10;
			num2 += input - '0';
			
			switch(operator)
			{
				case '+' :
					hap = num1 + num2;
					break;
				case '-' :
					hap = num1 - num2;
					break;
				case '*' :
					hap = num1 * num2;
					break;
				case '/' :
					hap = num1 / num2;
					break;
				case '%' :
					hap = num1 % num2;
					break;
				default : 
					break;
			}
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + "  =  " + hap);
		System.out.println("-------------------------------------------------------");
	}

}















































