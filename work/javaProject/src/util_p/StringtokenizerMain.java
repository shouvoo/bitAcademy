package util_p;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringtokenizerMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*String str = "æ∆±‚ªÛæÓ,æˆ∏∂ªÛæÓ,,æ∆∫¸ªÛæÓ.«“∏”¥œªÛæÓ,«“æ∆πˆ¡ˆ ªÛæÓ";
		StringTokenizer tok = new StringTokenizer(str, ",.");
		
		while(tok.hasMoreElements())
		{
			//System.out.println(tok.nextToken());
		}*/
		
		/*System.out.println("---------------------------------------------------");
		
		String [] ppArr = {"[0-9a-zA-Z_]*@[0-9a-zA-Z]*", "[∞°-∆R]{3,5}"};
		System.out.println("¿Ã∏ﬁ¿œ¿ª ¿€º∫«œººø‰");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		if(Pattern.matches(ppArr[0], input))
		{
			System.out.println(input);
			System.out.println("πﬂΩ≈¿Œ¿ª ¿‘∑¬«œººø‰");
			
		} else 
		{
			System.out.println("¡÷º“∏¶ πŸ∏£∞‘ ¿‘∑¬«œººø‰");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}
		
		sc = new Scanner(System.in);
		input = sc.nextLine();
		
		if(Pattern.matches(ppArr[1], input))
		{
			System.out.println(input);
			System.out.println("≥ªøÎ¿ª ¿‘∑¬«œººø‰");			
		} else 
		{
			System.out.println("πﬂΩ≈¿Œ¿ª πŸ∏£∞‘ ¿‘∑¬«œººø‰");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}
		
		sc = new Scanner(System.in);
		input = sc.nextLine();
		
		if(input.length() > 0)
		{
			System.out.println(input);
			System.out.println("¿Ã∏ﬁ¿œ ¿¸º€¿Ã øœ∑·µ«æ˙Ω¿¥œ¥Ÿ");			
		} else 
		{
			System.out.println("≥ªøÎ¿ª πŸ∏£∞‘ ¿‘∑¬«œººø‰");
			sc = new Scanner(System.in);
			input = sc.nextLine();
		}*/
	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try 
			{
				System.out.println("1.¡÷º“ : ");
				String mail = sc.nextLine();
				if(!(Pattern.matches("[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{3}", mail)) ||
					(Pattern.matches("[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{2}.[a-z]{2}", mail)))
				{
					throw new Exception("∏ﬁ¿œ¡÷º“ø°∑Ø");
				}
				
				System.out.println("2.πﬂΩ≈¿Œ : ");
				String sender = sc.nextLine();
				
				if(!(Pattern.matches("[§°-§æ|∞°-∆R]", sender)))
				{
					throw new Exception("πﬂΩ≈¿Œø°∑Ø");
				}
				
				System.out.println("3.≥ªøÎ : ");
				String contents = sc.nextLine();
				if(contents.trim().length() <= 0)
				{
					throw new Exception("≥ªøÎ ø°∑Ø");
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
