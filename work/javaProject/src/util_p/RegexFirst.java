package util_p;

import java.util.regex.Pattern;

public class RegexFirst 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char ch = '¤¾';
		System.out.println((int)ch);
		
		/*for (int i = '¤¡'; i <= '¤¾'; i+=3) 
		{
			System.out.println((char)i);
		}*/
		
		String [] mmArr = {"Àåµ¿°Ç","Àå¼­°Ç","ÀåÇõ","Àå³²°Ç","Àå","Àå±º","ÃÖÀå±º","¹ÚÀå±º","Àå±º´Ô","ÀåÀåÀå",
                "Çöºó","¿øºó","¹Ì½ºÅÍºó","Ä¿ÇÇºó","Ä¿ÇÇ","¿øµÎÄ¿ÇÇ","ÀåÈñºó","¤¡¤¤¤§","¤¡¤©¤¤",
                "´Ù","°ø¼®È£","±èÈñ¾Ö","³ªºñ¾ß","³Êºñ¾Æ´Ï", "¤»¤½¤²", "Ä«¤½ºó", "°­³²¿ª", "°­³²¿ªÀü", "±¸³»¿°", "°­³»¿µ" , "¿µ°¡³×"    
        };
		
		String index = "¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤½¤¼¤¾¤¢¤¨¤¹¤³¤¶";
		String ff = "°¡³ª´Ù¶ó¸¶¹Ù»ç¾ÆÀÚÂ÷Ä«ÆÄÅ¸ÇÏ±îµûÂ¥ºü½Î";
		String ee = "ƒ‰ˆ¢‹L¡“J•½šïŸç£ ¯†µiÀ˜»MÆR…ùêÂö˜ªÏ";
		
		String sch = "¤»¤½¤²";
		//String sch = "¤¡¤¡¤¾¤©¤©¤¸¤§";
		String pp = "";
		
		for (int i = 0; i < sch.length(); i++) 
		{
			int pos = index.indexOf("" + sch.charAt(i));
			if(pos < 0) pp += sch.charAt(i);
			else pp += "[" + sch.charAt(i) +  "|" + ff.charAt(pos) + "-"+ee.charAt(pos) + "]";
		}
		
		System.out.println(pp);
		
		for (String str : mmArr) 
		{
			if(Pattern.matches(pp, str))
			{
				System.out.println(str + ", ");
			}
		}
	}

}
