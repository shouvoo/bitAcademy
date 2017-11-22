package util_p;

import java.util.Iterator;
import java.util.regex.Pattern;

public class RegexMain 
{
	public static void main(String[] args) 
	{
		/*String str = "Àåµ¿°Ç";
		
		System.out.println(str.equals("Àå.*"));
		
		System.out.println(Pattern.matches("Àå.*", "Àåµ¿°Ç"));
		System.out.println(Pattern.matches(".*ºó", "¿øºó"));
		*/
		
		String [] mmArr = {"Àåµ¿°Ç","Àå¼­°Ç","ÀåÇõ","Àå³²°Ç","Àå","Àå±º","ÃÖÀå±º","¹ÚÀå±º","Àå±º´Ô","ÀåÀåÀå",
                "Çöºó","¿øºó","¹Ì½ºÅÍºó","Ä¿ÇÇºó","Ä¿ÇÇ","¿øµÎÄ¿ÇÇ","ÀåÈñºó","¤¡¤¤¤§","¤¡¤©¤¤",
                "´Ù","°ø¼®È£","±èÈñ¾Ö","³ªºñ¾ß","³Êºñ¾Æ´Ï","123-456","1234-5678",
                "1234-5678-9012","123-5678-9012","12-5678-9012","12-568-9012",
                "123-678-9012","123-567833-9012","12-58-9012","1a",
                "abc","abc_def","1234","ab_1234","ab1234","aaa@aaa.aaa","aaaaaa.aaa@","aaa12aaa_aaa@",
                "ab56","AABB","aBCd","1","3","1234abc@aaa.aaa","1234abc@aaa.a","1a2b","a12",
                "^","^^","12^34abc@aaa.aaa","1a2b^","^a12","123456.^",
                "\\^","^\\^",".^","\\^^",
                "1234abc@aaa.aa.va","1234abc@a.aa.a.a.va", "°­³²¿ª", "°­³²¿ªÀü", "±¸³»¿°", "°­³»¿µ" , "¿µ°¡³×"    
        };
		
		String [] ppArr = {"Àå", "Àå.", "Àå*", "Àå.*", ".ºó", ".*ºó", ".*Àå.*", ".µ¿.",
		".*[°Ç | ºó]"	, "[0-9]", "[0-9]*", "[0-9].*", "[0-9a-zA-Z]*", "[0-9a-zA-Z_]*"	,
		"[0-9a-zA-Z_.@]*", "[0-9a-zA-Z_]*@", "[0-9a-zA-Z_]*@[0-9a-zA-Z_.]*",
		"[0-9]{4}",  "[0-9a-zA-Z_@.]{3,}", "[0-9a-zA-Z_@.]{3,6}",  
		"[0-9a-zA-Z_]{3,}@[0-9a-zA-Z_.]{5,}", "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}",
		"[0-9^]*", "[^0-9]*", "[^^]*", "[°¡-ÆR]*","[¤¡-¤¾]*", "[°¡-ƒ‰³ª-ˆ¢¾Æ-Ÿç]*", "[°¡-ƒ‰][³ª-ˆ¢][¾Æ-Ÿç]*"
		};
		
		for (String pp : ppArr) 
		{
			System.out.print(pp + " : ");
			
			for (String mm : mmArr) 
			{
				if(Pattern.matches(pp, mm))
				{
					System.out.print(mm + ", ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
