package basic;

import java.io.IOException;

public class WhileFortune 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		/*mmm:while(true)
		{
			System.out.println("������ �!!!");
			System.out.println("1~3.�, 0.����");
			System.out.print("�Է�  :  ");
			
			int num = System.in.read() - '0';
			System.in.read(); // ������ '\r' -> ���� ���� ��⸦ �������ش�
			System.in.read(); // ������ '\n' -> ���� ���� ��⸦ �������ش�
			
			String res;
			switch(num)
			{
				case 0 : 
					break mmm;
					
				case 1 : 
					res = "������ � ���� ¯!!";
					break;
					
				case 2 : 
					res = "�׳� ���� �׷�";
					break;
					
				case 3 : 
					res = "�����";
					break;
					
				default :
					res = "�ùٸ� ��ȣ ���";
					break;
			}
			
			System.out.println(res);
			
			//if(num == 0)
			//{
				//break;
			//}
			
			//System.out.println(num);
		}
			
		System.out.println("���α׷� ����!!");*/
		
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
		
		System.out.println("��  :  "  +  num1);
		
		
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
				case 47 : //������
					operator = input;
					break;
				case 42 : //���ϱ�
					operator = input;
					break;
				case 37 : //%
					operator = input;
					break;
				case 99 : //c
					break;
				case 103 : //g
					System.in.read();
					System.out.println("�����մϴ�");
					break mmm;
				default :
					System.out.println("�����ڸ� �ٽ� �Է��ϼ���");
			}

			System.out.println("������  :  " + (char)input);
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
				case 47 : //������
					result = num1 / num2;
					//System.out.println(num1 + " / " + num2 + " = " + result);
					break sss;
				case 42 : //���ϱ�
					result = num1 * num2;
					//System.out.println(num1 + " * " + num2 + " = " + result);
					break sss;
				case 37 : //%
					result = num1 % num2;
					//System.out.println(num1 + " % " + num2 + " = " + result);
					break sss;
				default :
					//System.out.println("�����ڸ� �ٽ� �Է��ϼ���");
					break sss;
			}
			
			
					
		}
		
		char op = (char)operator;
		System.out.println((char)num1 + op + (char)num2 + " = " + result);
		
	}

}



























