package util_p;

import java.util.regex.Pattern;

public class RegexFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] mmArr = {"Àåµ¿°Ç","Àå¼­°Ç","ÀåÇõ","Àå³²°Ç","Àå","Àå±º","ÃÖÀå±º","¹ÚÀå±º","Àå±º´Ô","ÀåÀåÀå",
                "Çöºó","¿øºó","Ä«ÆÄºó","Ä¿ÇÇºó","Ä¿ÇÇ¹Ù","¿øµÎÄ¿ÇÇ","ÀåÈñºó","¤¡¤¤¤§","¤¡¤©¤¤",
                "´Ù","°ø¼®È£","±èÈñ¾Ö","³ªºñ¾ß","³Êºñ¾Æ´Ï","¤»¤½¤²","Ä«¤½ºó","¤¾¤±ºó"};
		
		String index="¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤¼¤½¤¾¤¢¤¨¤¹¤³¤¶";
		String ff="°¡³ª´Ù¶ó¸¶¹Ù»ç¾ÆÀÚÂ÷Ä«Å¸ÆÄÇÏ±îµûÂ¥ºü½Î";
		String ee="ƒ‰ˆ¢‹L¡“J•½šïŸç£ ¯†µi»MÀ˜ÆR…ùêÂö˜ªÏ";
		
		String sch = "¤»¤½¤²";
		
		String pp ="";
		
		for (int i = 0; i < sch.length(); i++) {
			int pos = index.indexOf(""+sch.charAt(i));
			
			if(pos<0)
				pp+=sch.charAt(i);
			else
				pp+="["+sch.charAt(i)+"|"+ff.charAt(pos)+"-"+ee.charAt(pos)+"]";
		}
		
		System.out.println(pp);
		
		for (String str : mmArr) {
			if(Pattern.matches(pp, str))
				System.out.print(str+",");
		}
	}

}
