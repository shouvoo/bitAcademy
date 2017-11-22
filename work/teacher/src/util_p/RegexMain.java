package util_p;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str = "¿Âµø∞«";
		
		System.out.println(str.equals("¿Â.*"));
		
		System.out.println(Pattern.matches("¿Â.*", "¿Âµø∞«"));
		
		
		//∫Û¿∏∑Œ ≥°≥™¥¬ ±€¿⁄∏¶ »Æ¿Œ«œººø‰
		
		System.out.println(Pattern.matches(".*∫Û", "«ˆπ›"));*/
		
		String [] mmArr = {"¿Âµø∞«","¿Âº≠∞«","¿Â«ı","¿Â≥≤∞«","¿Â","¿Â±∫","√÷¿Â±∫","π⁄¿Â±∫","¿Â±∫¥‘","¿Â¿Â¿Â",
                "«ˆ∫Û","ø¯∫Û","πÃΩ∫≈Õ∫Û","ƒø««∫Û","ƒø««","ø¯µŒƒø««","¿Â»Ò∫Û","§°§§§ß","§°§©§§",
                "¥Ÿ","∞¯ºÆ»£","±Ë»Òæ÷","≥™∫Òæﬂ","≥ ∫Òæ∆¥œ","123-456","1234-5678",
                "1234-5678-9012","123-5678-9012","12-5678-9012","12-568-9012",
                "123-678-9012","123-567833-9012","12-58-9012","1a",
                "abc","abc_def","1234","ab_1234","ab1234","aaa@aaa.aaa","aaaaaa.aaa@","aaa12aaa_aaa@",
                "ab56","AABB","aBCd","1","3","1234abc@aaa.aaa","1234abc@aaa.a","1a2b","a12",
                "^","^^","12^34abc@aaa.aaa","1a2b^","^a12","123456.^",
                "\\^","^\\^",".^","\\^^",
                "1234abc@aaa.aa.va","1234abc@a.aa.a.a.va", 
                "Å˙≥≤ø™","±§≥≤ø™¿¸","±∏≥ªø∞","πÊ∞Ì±∏≥ª","øµ∞°≥◊"       
        };
		
		
		
		String [] ppArr = {
				"¿Â","¿Â.","¿Â*","¿Â.*",".∫Û",".*∫Û", ".*¿Â.*",
				".*[∞«|∫Û]","[0-9]","[0-9]*","[0-9].","[0-9].*","[0-9a-zA-Z]*","[0-9a-zA-Z_]*",
				"[0-9a-zA-Z_.@]*","[0-9a-zA-Z_]*@","[0-9a-zA-Z_]*@[0-9a-zA-Z_.]*",
				"[0-9]{4}","[0-9a-zA-Z_@.]{3,}","[0-9a-zA-Z_@.]{3,6}","[0-9a-zA-Z_]{3,}@[0-9a-zA-Z_.]{5,}",
				"[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}","[0-9^]*","[^0-9]*","[^^]*",
				"[∞°-∆R]*","[§°-§æ]*","[∞°-Éâ][≥™-à¢][æ∆-üÁ]"
		};
		
		for (String pp : ppArr) {
			System.out.print(pp+":");
			
			for (String mm : mmArr) {
				if(Pattern.matches(pp, mm))
					System.out.print(mm+",");
				
			}
			System.out.println();
		}
		
		//§°§§§∑
		
		
	}

}
