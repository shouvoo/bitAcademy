package util_p;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringtokenizerMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*String str = "�Ʊ���,�������,,�ƺ����.�ҸӴϻ��,�Ҿƹ��� ���";
		StringTokenizer tok = new StringTokenizer(str, ",.");
		
		while(tok.hasMoreElements())
		{
			//System.out.println(tok.nextToken());
		}*/
		
		/*System.out.println("---------------------------------------------------");
		
		String [] ppArr = {"[0-9a-zA-Z_]*@[0-9a-zA-Z]*", "[��-�R]{3,5}"};
		System.out.println("�̸����� �ۼ��ϼ���");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		if(Pattern.matches(ppArr[0], input))
		{
			System.out.println(input);
			System.out.println("�߽����� �Է��ϼ���");
			
		} else 
		{
			System.out.println("�ּҸ� �ٸ��� �Է��ϼ���");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}
		
		sc = new Scanner(System.in);
		input = sc.nextLine();
		
		if(Pattern.matches(ppArr[1], input))
		{
			System.out.println(input);
			System.out.println("������ �Է��ϼ���");			
		} else 
		{
			System.out.println("�߽����� �ٸ��� �Է��ϼ���");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}
		
		sc = new Scanner(System.in);
		input = sc.nextLine();
		
		if(input.length() > 0)
		{
			System.out.println(input);
			System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�");			
		} else 
		{
			System.out.println("������ �ٸ��� �Է��ϼ���");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}*/
	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try 
			{
				System.out.println("1.�ּ� : ");
				String mail = sc.nextLine();
				if(!(Pattern.matches("[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{3}", mail)) ||
					(Pattern.matches("[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{2}.[a-z]{2}", mail)))
				{
					throw new Exception("�����ּҿ���");
				}
				
				System.out.println("2.�߽��� : ");
				String sender = sc.nextLine();
				
				if(!(Pattern.matches("[��-��|��-�R]", sender)))
				{
					throw new Exception("�߽��ο���");
				}
				
				System.out.println("3.���� : ");
				String contents = sc.nextLine();
				if(contents.trim().length() <= 0)
				{
					throw new Exception("���� ����");
				}
				
				
				break;
			} catch (Exception e) 
			{
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		
		
	}

}
