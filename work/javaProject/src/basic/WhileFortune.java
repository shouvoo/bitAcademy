package basic;

import java.io.IOException;

public class WhileFortune 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		/*mmm:while(true)
		{
			System.out.println("오늘의 운세!!!");
			System.out.println("1~3.운세, 0.종료");
			System.out.print("입력  :  ");
			
			int num = System.in.read() - '0';
			System.in.read(); // 엔터의 '\r' -> 엔터 후의 찌꺼기를 제거해준다
			System.in.read(); // 엔터의 '\n' -> 엔터 후의 찌꺼기를 제거해준다
			
			String res;
			switch(num)
			{
				case 0 : 
					break mmm;
					
				case 1 : 
					res = "오늘의 운세 완전 짱!!";
					break;
					
				case 2 : 
					res = "그냥 그저 그런";
					break;
					
				case 3 : 
					res = "헤어져";
					break;
					
				default :
					res = "올바른 번호 요망";
					break;
			}
			
			System.out.println(res);
			
			//if(num == 0)
			//{
				//break;
			//}
			
			//System.out.println(num);
		}
			
		System.out.println("프로그램 종료!!");*/
		
		int num1 = 0;
		
		
		while(true)
		{
			int input = System.in.read();
			
			if(input  == 13)
			{
				System.in.read();
				break;
			}
			num1 *= 10;
			num1 += input - '0';		
		}
		
		System.out.println("수  :  "  +  num1);
		
		
		int operator = 0;
		mmm:while(true)
		{
			int input = System.in.read();
			
			switch(input)
			{
				case 13 : 
					System.in.read();
					break mmm;
				case 43 : //+
					operator = input;
					break;
				case 45 : //-
					operator = input;
					break;
				case 47 : //나누기
					operator = input;
					break;
				case 42 : //곱하기
					operator = input;
					break;
				case 37 : //%
					operator = input;
					break;
				case 99 : //c
					break;
				case 103 : //g
					System.in.read();
					System.out.println("종료합니다");
					break mmm;
				default :
					System.out.println("연산자를 다시 입력하세요");
			}

			System.out.println("연산자  :  " + (char)input);
		}
		
		int num2 = 0;
		int result = 0;
		sss:while(true)
		{
			int input = System.in.read();
			//System.out.println("sss  :  " + input);
			
			switch(input)
			{
				case 13 : 
					System.in.read();
					break;
				default :
					break;
			}
			
			num2 *= 10;
			num2 += input - '0';
			
			switch(operator)
			{
				case 43 : //+
					result = num1 + num2;
					//System.out.println(num1 + " + " + num2 + " = " + result);
					break sss;
				case 45 : //-
					result = num1 - num2;
					//System.out.println(num1 + " - " + num2 + " = " + result);
					break sss;
				case 47 : //나누기
					result = num1 / num2;
					//System.out.println(num1 + " / " + num2 + " = " + result);
					break sss;
				case 42 : //곱하기
					result = num1 * num2;
					//System.out.println(num1 + " * " + num2 + " = " + result);
					break sss;
				case 37 : //%
					result = num1 % num2;
					//System.out.println(num1 + " % " + num2 + " = " + result);
					break sss;
				default :
					//System.out.println("연산자를 다시 입력하세요");
					break sss;
			}
			
			
					
		}
		
		char op = (char)operator;
		System.out.println((char)num1 + op + (char)num2 + " = " + result);
		
	}

}



























