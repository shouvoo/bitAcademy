package util_p;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str = "장동건";
		
		System.out.println(str.equals("장.*"));
		
		System.out.println(Pattern.matches("장.*", "장동건"));
		
		
		//빈으로 끝나는 글자를 확인하세요
		
		System.out.println(Pattern.matches(".*빈", "현반"));*/
		
		String [] mmArr = {"장동건","장서건","장혁","장남건","장","장군","최장군","박장군","장군님","장장장",
                "현빈","원빈","미스터빈","커피빈","커피","원두커피","장희빈","ㄱㄴㄷ","ㄱㄹㄴ",
                "다","공석호","김희애","나비야","너비아니","123-456","1234-5678",
                "1234-5678-9012","123-5678-9012","12-5678-9012","12-568-9012",
                "123-678-9012","123-567833-9012","12-58-9012","1a",
                "abc","abc_def","1234","ab_1234","ab1234","aaa@aaa.aaa","aaaaaa.aaa@","aaa12aaa_aaa@",
                "ab56","AABB","aBCd","1","3","1234abc@aaa.aaa","1234abc@aaa.a","1a2b","a12",
                "^","^^","12^34abc@aaa.aaa","1a2b^","^a12","123456.^",
                "\\^","^\\^",".^","\\^^",
                "1234abc@aaa.aa.va","1234abc@a.aa.a.a.va", 
                "괋남역","광남역전","구내염","방고구내","영가네"       
        };
		
		
		
		String [] ppArr = {
				"장","장.","장*","장.*",".빈",".*빈", ".*장.*",
				".*[건|빈]","[0-9]","[0-9]*","[0-9].","[0-9].*","[0-9a-zA-Z]*","[0-9a-zA-Z_]*",
				"[0-9a-zA-Z_.@]*","[0-9a-zA-Z_]*@","[0-9a-zA-Z_]*@[0-9a-zA-Z_.]*",
				"[0-9]{4}","[0-9a-zA-Z_@.]{3,}","[0-9a-zA-Z_@.]{3,6}","[0-9a-zA-Z_]{3,}@[0-9a-zA-Z_.]{5,}",
				"[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}","[0-9^]*","[^0-9]*","[^^]*",
				"[가-힣]*","[ㄱ-ㅎ]*","[가-깋][나-닣][아-잏]"
		};
		
		for (String pp : ppArr) {
			System.out.print(pp+":");
			
			for (String mm : mmArr) {
				if(Pattern.matches(pp, mm))
					System.out.print(mm+",");
				
			}
			System.out.println();
		}
		
		//ㄱㄴㅇ
		
		
	}

}
