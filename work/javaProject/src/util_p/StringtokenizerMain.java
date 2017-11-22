package util_p;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringtokenizerMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*String str = "아기상어,엄마상어,,아빠상어.할머니상어,할아버지 상어";
		StringTokenizer tok = new StringTokenizer(str, ",.");
		
		while(tok.hasMoreElements())
		{
			//System.out.println(tok.nextToken());
		}*/
		
		/*System.out.println("---------------------------------------------------");
		
		String [] ppArr = {"[0-9a-zA-Z_]*@[0-9a-zA-Z]*", "[가-힣]{3,5}"};
		System.out.println("이메일을 작성하세요");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		if(Pattern.matches(ppArr[0], input))
		{
			System.out.println(input);
			System.out.println("발신인을 입력하세요");
			
		} else 
		{
			System.out.println("주소를 바르게 입력하세요");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}
		
		sc = new Scanner(System.in);
		input = sc.nextLine();
		
		if(Pattern.matches(ppArr[1], input))
		{
			System.out.println(input);
			System.out.println("내용을 입력하세요");			
		} else 
		{
			System.out.println("발신인을 바르게 입력하세요");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}
		
		sc = new Scanner(System.in);
		input = sc.nextLine();
		
		if(input.length() > 0)
		{
			System.out.println(input);
			System.out.println("이메일 전송이 완료되었습니다");			
		} else 
		{
			System.out.println("내용을 바르게 입력하세요");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}*/
	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try 
			{
				System.out.println("1.주소 : ");
				String mail = sc.nextLine();
				if(!(Pattern.matches("[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{3}", mail)) ||
					(Pattern.matches("[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{2}.[a-z]{2}", mail)))
				{
					throw new Exception("메일주소에러");
				}
				
				System.out.println("2.발신인 : ");
				String sender = sc.nextLine();
				
				if(!(Pattern.matches("[ㄱ-ㅎ|가-힣]", sender)))
				{
					throw new Exception("발신인에러");
				}
				
				System.out.println("3.내용 : ");
				String contents = sc.nextLine();
				if(contents.trim().length() <= 0)
				{
					throw new Exception("내용 에러");
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
